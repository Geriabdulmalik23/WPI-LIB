/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import id.winpay.api.WinpayProceed;
import id.winpay.api.model.WPIMessage;
import id.winpay.api.model.WPItem;
import id.winpay.api.model.response.PaymentData;
import com.mashape.unirest.http.exceptions.UnirestException;
import id.winpay.api.util.Config;
import id.winpay.api.util.Config.PARAMS_PRODUCT_CODE;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Zainul Alim <zainulalim@ymail.com>
 */
public class APIWinpay {

    /**
     * @param args the command line arguments
     */
    private static final Logger log = Logger.getLogger(APIWinpay.class);

    public static void main(String[] args) throws UnirestException, Exception {
        WPIMessage message = new WPIMessage();
        log.info("START");
        message.setCms("API");
        
        message.setSpi_billingName("Zainul Alim");
        message.setSpi_billingEmail("zainulalim@ymail.com");
        message.setSpi_billingPhone("085649605912");
        message.setSpi_currency("IDR");
        message.setSpi_item_expedition("0");
        message.setSpi_token("305626c408a6681dfd39c3a0bc5dea2dfd2f253f8157f7cbe5d72fcdfd962c7d");
        message.setGet_link("no");

        List<WPItem> items = new ArrayList<>();
        WPItem wp = new WPItem();
        wp.setName("Baju Bali");
        wp.setQty("1");
        wp.setSku("AG-0189833");
        wp.setUnitPrice("5000");
        items.add(wp);
        wp = new WPItem();
        wp.setName("Baju Jogja");
        wp.setQty("2");
        wp.setSku("AB-89898");
        wp.setUnitPrice("1000");
        items.add(wp);
        message.setSpi_item(items);
        message.setSpi_is_escrow("0");
        
        message.setSpi_amount("8000");
        
        Config c = Config.getInstance();
        c.initconfig(Config.DEVELOPMENT);
        WinpayProceed proc = new WinpayProceed(message, PARAMS_PRODUCT_CODE.ALFAMART, c);
        proc.call();
        if (proc.getIsSuccess()) {
            PaymentData data = (PaymentData) proc.getResponse().getData();
            
            log.info("Payment Code  " + data.getPayment_code());
            log.info("URL Panduan  " + data.getSpi_status_url());
            log.info("URL Payment  " + data.getUrl_payment());
            log.info("URL Checkout  " + data.getUrl_checkout());
        }
    }

}
