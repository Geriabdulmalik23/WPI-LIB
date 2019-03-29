/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.winpay.api.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Modifier;
import java.util.List;

/**
 *
 * @author Reza Ishaq Maulana <es.mgr@bm.co.id>
 */
public class WPIMessage {

    private String cms;
    private String spi_info1;
    private String authKey;
    private String spi_callback;
    private String url_listener;
    private String spi_currency;
    private List<WPItem> spi_item;
    private String spi_item_description;
    private String spi_price;
    private String spi_item_weight;
    private String spi_quantity;
    private String spi_is_escrow;
    private String spi_amount;
    private String spi_merchant_discount;
    private String spi_signature;
    private String spi_merchant_discount_reff;
    private String spi_token;
    private String spi_merchant_transaction_reff;
    private String spi_seller_zipcode;
    private String spi_item_expedition;
    private String spi_expedition_name;
    private String spi_expedition_type;
    private String spi_expedition_code;
    private String spi_expedition_price;
    private String spi_billingPhone;
    private String spi_billingEmail;
    private String spi_billingName;
    private String spi_billingAddress;
    private String spi_deliveryName;
    private String spi_deliveryAddress;
    private String spi_paymentDate;
    private String spi_request_key;
    private String custom_page;
    private String custom_header;
    private String custom_logo;
    private String custom_name;
    private String skip_spi_page;
    private String get_link;
    
    public WPIMessage(){
        this.get_link = "NO";
    }
    
    @Override
    public String toString() {
        Gson gs = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.FINAL)
                .disableHtmlEscaping()
                .create();
        String a = gs.toJson(this);
        return a;
    }

    /**
     * Melakukan parse JSON to Object Model.
     *
     * @param jsonString : Json yang telah dirubah ke bentuk String.
     * @return Boolean = true : one way, false : return
     */
    public WPIMessage parseJsonToObject(String jsonString) {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.FINAL)
                .create();
        WPIMessage model = gson.fromJson(jsonString, this.getClass());
        return model;
    }

    public String getCms() {
        return cms;
    }

    public void setCms(String cms) {
        this.cms = cms;
    }

    public String getSpi_info1() {
        return spi_info1;
    }

    public void setSpi_info1(String spi_info1) {
        this.spi_info1 = spi_info1;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getSpi_callback() {
        return spi_callback;
    }

    public void setSpi_callback(String spi_callback) {
        this.spi_callback = spi_callback;
    }

    public String getUrl_listener() {
        return url_listener;
    }

    public void setUrl_listener(String url_listener) {
        this.url_listener = url_listener;
    }

    public String getSpi_currency() {
        return spi_currency;
    }

    public void setSpi_currency(String spi_currency) {
        this.spi_currency = spi_currency;
    }

    public List<WPItem> getSpi_item() {
        return spi_item;
    }

    public void setSpi_item(List<WPItem> spi_item) {
        this.spi_item = spi_item;
    }

    public String getSpi_item_description() {
        return spi_item_description;
    }

    public void setSpi_item_description(String spi_item_description) {
        this.spi_item_description = spi_item_description;
    }

    public String getSpi_price() {
        return spi_price;
    }

    public void setSpi_price(String spi_price) {
        this.spi_price = spi_price;
    }

    public String getSpi_item_weight() {
        return spi_item_weight;
    }

    public void setSpi_item_weight(String spi_item_weight) {
        this.spi_item_weight = spi_item_weight;
    }

    public String getSpi_quantity() {
        return spi_quantity;
    }

    public void setSpi_quantity(String spi_quantity) {
        this.spi_quantity = spi_quantity;
    }

    public String getSpi_is_escrow() {
        return spi_is_escrow;
    }

    public void setSpi_is_escrow(String spi_is_escrow) {
        this.spi_is_escrow = spi_is_escrow;
    }

    public String getSpi_amount() {
        return spi_amount;
    }

    public void setSpi_amount(String spi_amount) {
        this.spi_amount = spi_amount;
    }

    public String getSpi_merchant_discount() {
        return spi_merchant_discount;
    }

    public void setSpi_merchant_discount(String spi_merchant_discount) {
        this.spi_merchant_discount = spi_merchant_discount;
    }

    public String getSpi_signature() {
        return spi_signature;
    }

    public void setSpi_signature(String spi_signature) {
        this.spi_signature = spi_signature;
    }

    public String getSpi_merchant_discount_reff() {
        return spi_merchant_discount_reff;
    }

    public void setSpi_merchant_discount_reff(String spi_merchant_discount_reff) {
        this.spi_merchant_discount_reff = spi_merchant_discount_reff;
    }

    public String getSpi_token() {
        return spi_token;
    }

    public void setSpi_token(String spi_token) {
        this.spi_token = spi_token;
    }

    public String getSpi_merchant_transaction_reff() {
        return spi_merchant_transaction_reff;
    }

    public void setSpi_merchant_transaction_reff(String spi_merchant_transaction_reff) {
        this.spi_merchant_transaction_reff = spi_merchant_transaction_reff;
    }

    public String getSpi_seller_zipcode() {
        return spi_seller_zipcode;
    }

    public void setSpi_seller_zipcode(String spi_seller_zipcode) {
        this.spi_seller_zipcode = spi_seller_zipcode;
    }

    public String getSpi_item_expedition() {
        return spi_item_expedition;
    }

    public void setSpi_item_expedition(String spi_item_expedition) {
        this.spi_item_expedition = spi_item_expedition;
    }

    public String getSpi_expedition_name() {
        return spi_expedition_name;
    }

    public void setSpi_expedition_name(String spi_expedition_name) {
        this.spi_expedition_name = spi_expedition_name;
    }

    public String getSpi_expedition_type() {
        return spi_expedition_type;
    }

    public void setSpi_expedition_type(String spi_expedition_type) {
        this.spi_expedition_type = spi_expedition_type;
    }

    public String getSpi_expedition_code() {
        return spi_expedition_code;
    }

    public void setSpi_expedition_code(String spi_expedition_code) {
        this.spi_expedition_code = spi_expedition_code;
    }

    public String getSpi_expedition_price() {
        return spi_expedition_price;
    }

    public void setSpi_expedition_price(String spi_expedition_price) {
        this.spi_expedition_price = spi_expedition_price;
    }

    public String getSpi_billingPhone() {
        return spi_billingPhone;
    }

    public void setSpi_billingPhone(String spi_billingPhone) {
        this.spi_billingPhone = spi_billingPhone;
    }

    public String getSpi_billingEmail() {
        return spi_billingEmail;
    }

    public void setSpi_billingEmail(String spi_billingEmail) {
        this.spi_billingEmail = spi_billingEmail;
    }

    public String getSpi_billingName() {
        return spi_billingName;
    }

    public void setSpi_billingName(String spi_billingName) {
        this.spi_billingName = spi_billingName;
    }

    public String getSpi_billingAddress() {
        return spi_billingAddress;
    }

    public void setSpi_billingAddress(String spi_billingAddress) {
        this.spi_billingAddress = spi_billingAddress;
    }

    public String getSpi_deliveryName() {
        return spi_deliveryName;
    }

    public void setSpi_deliveryName(String spi_deliveryName) {
        this.spi_deliveryName = spi_deliveryName;
    }

    public String getSpi_deliveryAddress() {
        return spi_deliveryAddress;
    }

    public void setSpi_deliveryAddress(String spi_deliveryAddress) {
        this.spi_deliveryAddress = spi_deliveryAddress;
    }

    public String getSpi_paymentDate() {
        return spi_paymentDate;
    }

    public void setSpi_paymentDate(String spi_paymentDate) {
        this.spi_paymentDate = spi_paymentDate;
    }

    public String getSpi_request_key() {
        return spi_request_key;
    }

    public void setSpi_request_key(String spi_request_key) {
        this.spi_request_key = spi_request_key;
    }

    public String getCustom_page() {
        return custom_page;
    }

    public void setCustom_page(String custom_page) {
        this.custom_page = custom_page;
    }

    public String getCustom_header() {
        return custom_header;
    }

    public void setCustom_header(String custom_header) {
        this.custom_header = custom_header;
    }

    public String getCustom_logo() {
        return custom_logo;
    }

    public void setCustom_logo(String custom_logo) {
        this.custom_logo = custom_logo;
    }

    public String getCustom_name() {
        return custom_name;
    }

    public void setCustom_name(String custom_name) {
        this.custom_name = custom_name;
    }

    public String getSkip_spi_page() {
        return skip_spi_page;
    }

    public void setSkip_spi_page(String skip_spi_page) {
        this.skip_spi_page = skip_spi_page;
    }

    public String getGet_link() {
        return get_link;
    }

    public void setGet_link(String get_link) {
        this.get_link = get_link;
    }

}
