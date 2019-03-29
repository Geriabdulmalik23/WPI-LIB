/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.winpay.api.model.response;

/**
 *
 * @author al_zain92
 */
public class PaymentData extends WPIData {

    private String reff_id;
    private String payment_code;
    private String order_id;
    private String payment_method;
    private String payment_method_code;
    private String spi_status_url;

    private String url_payment;
    private String url_checkout;

    private Long fee_admin;
    private Long total_amount;

    public String getReff_id() {
        return reff_id;
    }

    public void setReff_id(String reff_id) {
        this.reff_id = reff_id;
    }

    public String getPayment_code() {
        return payment_code;
    }

    public void setPayment_code(String payment_code) {
        this.payment_code = payment_code;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_method_code() {
        return payment_method_code;
    }

    public void setPayment_method_code(String payment_method_code) {
        this.payment_method_code = payment_method_code;
    }

    public String getSpi_status_url() {
        return spi_status_url;
    }

    public void setSpi_status_url(String spi_status_url) {
        this.spi_status_url = spi_status_url;
    }

    public Long getFee_admin() {
        return fee_admin;
    }

    public void setFee_admin(Long fee_admin) {
        this.fee_admin = fee_admin;
    }

    public Long getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Long total_amount) {
        this.total_amount = total_amount;
    }

    public String getUrl_payment() {
        return url_payment;
    }

    public void setUrl_payment(String url_payment) {
        this.url_payment = url_payment;
    }

    public String getUrl_checkout() {
        return url_checkout;
    }

    public void setUrl_checkout(String url_checkout) {
        this.url_checkout = url_checkout;
    }
    
    
}
