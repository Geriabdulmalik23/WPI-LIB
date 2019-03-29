/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.winpay.api;

import id.winpay.api.util.OpenSslAes;
import id.winpay.api.error.WinpayException;
import id.winpay.api.model.WPIMessage;
import id.winpay.api.model.response.WPIData;
import id.winpay.api.model.response.TokenData;
import id.winpay.api.model.response.WPIResponse;
import id.winpay.api.model.response.PaymentData;
import id.winpay.api.util.Config;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.util.Optional;
import org.apache.log4j.Logger;

/**
 *
 * @author Reza Ishaq Maulana <es.mgr@bm.co.id>
 */
public class WinpayProceed {

    private static final Logger log = Logger.getLogger(WinpayProceed.class);
    
    WPIMessage message;
    WPIResponse response;
    Boolean isSuccess;
    String descResponse;
    String productCode;
    Config config = new Config();
    
    public WinpayProceed(WPIMessage message, String productcode) {
        this.message = message;
        this.response = new WPIResponse();
        this.response.setRc("01");
        this.response.setRd("Response Empty");
        this.isSuccess = false;
        this.productCode = productcode;
    }

    public WinpayProceed(WPIMessage message, String productcode, Config config) {
        this.message = message;
        this.response = new WPIResponse();
        this.response.setRc("01");
        this.response.setRd("Response Empty");
        this.isSuccess = false;
        this.productCode = productcode;
        this.config = config;
    }
    
    public WinpayProceed(WPIMessage message, Config.PARAMS_PRODUCT_CODE productcode, Config config) {
        this.message = message;
        this.response = new WPIResponse();
        this.response.setRc("01");
        this.response.setRd("Response Empty");
        this.isSuccess = false;
        this.productCode = productcode.toString();
        this.config = config;
    }

    private String getToken() throws Exception {
        HttpResponse<String> s = Unirest.get(config.getConfig(Config.PARAMS_CONFIG.PATH_TOKEN))
                .header("Content-Type", config.getConfig(Config.PARAMS_CONFIG.PATH_CONTENT_TYPE_JSON))
                .basicAuth(config.getConfig(Config.PARAMS_CONFIG.PRIV_KEY1),
                        config.getConfig(Config.PARAMS_CONFIG.PRIV_KEY2))
                .asString();

        if (Optional.ofNullable(s).isPresent()) {
            log.info("Response Get Token : " + s.getBody());
            WPIResponse response = new WPIResponse();
            WPIData data = new TokenData().createMessage();
            response.setData(data);
            response = response.parseJsonToObject(s.getBody());
            TokenData datatoken = (TokenData) response.getData();
            String token = datatoken.getToken();
            log.info("TOKEN : " + token);
            return token;
        }

        throw new WinpayException("01", "Failed to get token");
    }

    private void send(WPIMessage message, String token, String productCode) throws Exception {
        this.message.setSpi_request_key(token);
        this.message.setSpi_token(config.getConfig(Config.PARAMS_CONFIG.PRIV_KEY1) + config.getConfig(Config.PARAMS_CONFIG.PRIV_KEY2));
        String aesmessage = OpenSslAes.openssl_encrypt(message.toString(), token);
        String first = aesmessage.substring(0, 10);
        String last = aesmessage.substring(10);
        aesmessage = first + token + last;
        log.info("ID PRODUK : " + productCode);
        String url = config.getUrlProductCode(productCode);
        log.info("URL : " + url);
        String content_type = config.getConfig(Config.PARAMS_CONFIG.PATH_CONTENT_TYPE_SENDDATA);
        log.info("Content-Type : " + content_type);
        log.info("Message : " + aesmessage);
        HttpResponse<String> s = Unirest.post(url)
                .header("Content-Type", content_type)
                .body("orderdata=" + aesmessage)
                .asString();

        if (Optional.ofNullable(s).isPresent()) {
            log.info(s.getBody());
            this.response = new WPIResponse();
            WPIData data = new PaymentData().createMessage();
            this.response.setData(data);
            this.response = this.response.parseJsonToObject(s.getBody());
            if (this.response.getRc().equals("00") || this.response.getRc().equals("")) {
                this.isSuccess = true;
            }
        }
    }

    public void call() {
        try {
            this.send(this.message, this.getToken(), this.productCode);
        } catch (WinpayException ex) {
            this.response.setRc(ex.getRc());
            this.response.setRd(ex.getRd());
            log.error("Failed send to winpay!", ex);
        } catch (Exception ex) {
            log.error("Failed send to winpay!", ex);
        }
    }

    public WPIMessage getMessage() {
        return message;
    }

    public void setMessage(WPIMessage message) {
        this.message = message;
    }

    public WPIResponse getResponse() {
        return response;
    }

    public void setResponse(WPIResponse response) {
        this.response = response;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getDescResponse() {
        return descResponse;
    }

    public void setDescResponse(String descResponse) {
        this.descResponse = descResponse;
    }

}
