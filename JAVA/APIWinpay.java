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
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Reza Ishaq Maulana <es.mgr@bm.co.id>
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
        message.setSpi_amount("5000");

        message.setSpi_billingName("REZA");
        message.setSpi_billingEmail("rezaishaqm@gmail.com");
        message.setSpi_billingPhone("085645314075");
        message.setSpi_currency("IDR");
        message.setSkip_spi_page("true");
        message.setSpi_item_expedition("0");
        message.setSpi_token("305626c408a6681dfd39c3a0bc5dea2dfd2f253f8157f7cbe5d72fcdfd962c7d");
        message.setGet_link("YES");

        List<WPItem> items = new ArrayList<>();
        WPItem wp = new WPItem();
        wp.setName("BARANG OKE PUNYA");
        wp.setQty("1");
        wp.setSku("OLALA");
        wp.setUnitPrice("5000");
        items.add(wp);
        message.setSpi_item(items);
        message.setSpi_is_escrow("0");

        WinpayProceed proc = new WinpayProceed(message, "indomaret");
        proc.setEnvironment(WinpayProceed.ENV_DEVELOPMENT);
        proc.call();
        if (proc.getIsSuccess()) {
            PaymentData data = (PaymentData) proc.getResponse().getData();
            
            System.out.println("Payment Code  " + data.getPayment_code());
            System.out.println("URL Panduan  " + data.getSpi_status_url());
            System.out.println("URL Payment  " + data.getUrl_payment());
            System.out.println("URL Checkout  " + data.getUrl_checkout());
        }
    }

}
