package id.winpay.api.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Reza Ishaq Maulana <es.mgr@bm.co.id>
 */
public class Config {

    public final static String DEVELOPMENT = "DEVELOPMENT";
    public final static String PRODUCTION = "PRODUCTION";
    private final static String ENVIRONMENT = "DEVELOPMENT";
    private static final Config theInstance = new Config();
    final Map<String, String> config = new HashMap<>();
    final Map<String, String> urlproduct = new HashMap<>();

    public Config() {

        if (ENVIRONMENT.equals(PRODUCTION)) {
            buildProd(config);
        } else if (ENVIRONMENT.equals(DEVELOPMENT)) {
            buildDev(config);
        }

        urlproduct.put("MANDIRICP", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "MANDIRICP");
        urlproduct.put("BCAKP", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BCAKP");
        urlproduct.put("BRIEP", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BRIEP");
        urlproduct.put("CIMBC", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "CIMBC");
        urlproduct.put("DANAMON", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "DANAMON");
        urlproduct.put("MUAMALAT", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "MUAMALAT");
        urlproduct.put("BTNONLINE", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BTNONLINE");
        urlproduct.put("ALFAMART", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "ALFAMART");
        urlproduct.put("INDOMARET", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "INDOMARET");
        urlproduct.put("XLTUNAI", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "XLTUNAI");
        urlproduct.put("DOMPETKU", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "DOMPETKU");
        urlproduct.put("MANDIRIEC", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "MANDIRIEC");
        urlproduct.put("BRIMC", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BRIMC");
        urlproduct.put("TCASH", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "TCASH");
        urlproduct.put("BEBASBAYAR", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BEBASBAYAR");
        urlproduct.put("FASTPAY", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "FASTPAY");
        urlproduct.put("MANDIRIPC", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "MANDIRIPC");
        urlproduct.put("FINPAY", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "FINPAY");
        urlproduct.put("BCAPC", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BCAPC");
        urlproduct.put("ATM137", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "ATM137");
        urlproduct.put("BNIVA", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BNIVA");
        urlproduct.put("BRIVA", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BRIVA");
        urlproduct.put("BCAVA", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BCAVA");
        urlproduct.put("MANDIRIVA", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "MANDIRIVA");
        urlproduct.put("KKWP", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "KKWP");
    }

    public void initconfig(String env) {
        if (PRODUCTION.equals(env)) {
            buildProd(config);
        } else if (DEVELOPMENT.equals(env)) {
            buildDev(config);
        }

        urlproduct.put("MANDIRICP", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "MANDIRICP");
        urlproduct.put("BCAKP", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BCAKP");
        urlproduct.put("BRIEP", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BRIEP");
        urlproduct.put("CIMBC", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "CIMBC");
        urlproduct.put("DANAMON", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "DANAMON");
        urlproduct.put("MUAMALAT", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "MUAMALAT");
        urlproduct.put("BTNONLINE", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BTNONLINE");
        urlproduct.put("ALFAMART", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "ALFAMART");
        urlproduct.put("INDOMARET", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "INDOMARET");
        urlproduct.put("XLTUNAI", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "XLTUNAI");
        urlproduct.put("DOMPETKU", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "DOMPETKU");
        urlproduct.put("MANDIRIEC", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "MANDIRIEC");
        urlproduct.put("BRIMC", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BRIMC");
        urlproduct.put("TCASH", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "TCASH");
        urlproduct.put("BEBASBAYAR", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BEBASBAYAR");
        urlproduct.put("FASTPAY", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "FASTPAY");
        urlproduct.put("MANDIRIPC", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "MANDIRIPC");
        urlproduct.put("FINPAY", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "FINPAY");
        urlproduct.put("BCAPC", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BCAPC");
        urlproduct.put("ATM137", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "ATM137");
        urlproduct.put("BNIVA", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BNIVA");
        urlproduct.put("BRIVA", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BRIVA");
        urlproduct.put("BCAVA", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "BCAVA");
        urlproduct.put("MANDIRIVA", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "MANDIRIVA");
        urlproduct.put("KKWP", this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + "KKWP");
    }

    public static Config getInstance() {
        return theInstance;
    }

    public String getConfig(PARAMS_CONFIG config) {
        return this.config.get(config.getVal());
    }

    public String setConfig(PARAMS_CONFIG config, String value) {
        return this.config.put(config.getVal(), value);
    }

    public String getUrlProductCode(String produk) {
        if (urlproduct.containsKey(produk)) {
            return urlproduct.get(produk);
        }
        return this.config.get(PARAMS_CONFIG.PATH_API2.getVal()) + produk;
    }

    private void buildDev(Map<String, String> config) {
        config.put(PARAMS_CONFIG.HOST.getVal(), "https://sandbox-payment.winpay.id");
        config.put(PARAMS_CONFIG.PATH_API.getVal(), "https://sandbox-payment.winpay.id/api/");
        config.put(PARAMS_CONFIG.PATH_API2.getVal(), "https://sandbox-payment.winpay.id/apiv2/");
        config.put(PARAMS_CONFIG.PATH_CONTENT_TYPE_JSON.getVal(), "application/json");
        config.put(PARAMS_CONFIG.PATH_CONTENT_TYPE_SENDDATA.getVal(), "application/x-www-form-urlencoded");
        config.put(PARAMS_CONFIG.PATH_TOKEN.getVal(), "https://sandbox-payment.winpay.id/token");
        config.put(PARAMS_CONFIG.PATH_TOOLBAR.getVal(), "https://sandbox-payment.winpay.id/toolbar");
        config.put(PARAMS_CONFIG.PRIV_KEY1.getVal(), "");
        config.put(PARAMS_CONFIG.PRIV_KEY2.getVal(), "");
        config.put(PARAMS_CONFIG.REFERER.getVal(), "");
        config.put(PARAMS_CONFIG.MERCHANT_KEY.getVal(), "");

    }

    private void buildProd(Map<String, String> config) {
        config.put(PARAMS_CONFIG.HOST.getVal(), "https://secure-payment.winpay.id");
        config.put(PARAMS_CONFIG.PATH_API.getVal(), "https://secure-payment.winpay.id/api/");
        config.put(PARAMS_CONFIG.PATH_API2.getVal(), "https://secure-payment.winpay.id/apiv2/");
        config.put(PARAMS_CONFIG.PATH_CONTENT_TYPE_JSON.getVal(), "application/json");
        config.put(PARAMS_CONFIG.PATH_CONTENT_TYPE_SENDDATA.getVal(), "application/x-www-form-urlencoded");
        config.put(PARAMS_CONFIG.PATH_TOKEN.getVal(), "https://secure-payment.winpay.id/token");
        config.put(PARAMS_CONFIG.PATH_TOOLBAR.getVal(), "https://secure-payment.winpay.id/toolbar");
        config.put(PARAMS_CONFIG.PRIV_KEY1.getVal(), "");
        config.put(PARAMS_CONFIG.PRIV_KEY2.getVal(), "");
        config.put(PARAMS_CONFIG.REFERER.getVal(), "");
        config.put(PARAMS_CONFIG.MERCHANT_KEY.getVal(), "");

    }

    public enum PARAMS_CONFIG {

        HOST("url"),
        PATH_TOKEN("path-token"),
        PATH_API("path-api1"),
        PATH_API2("path-api2"),
        PATH_TOOLBAR("path-toolbar"),
        PATH_CONTENT_TYPE_SENDDATA("content-send"),
        PATH_CONTENT_TYPE_JSON("content-json"),
        PRIV_KEY1("privkey1"),
        PRIV_KEY2("privkey2"),
        REFERER("referer"),
        MERCHANT_KEY("merchant-key");

        private String val;

        PARAMS_CONFIG(String val) {
            this.val = val;
        }

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

    }

    public enum PARAMS_PRODUCT_CODE {

        MANDIRI_CLICK_PAY("MANDIRICP"),
        BCA_CLIK_PAY("BCAKP"),
        BRI_EPAY("BRIEP"),
        CIMB_CLICK_PAY("CIMBC"),
        DANAMAON_ONLINE("DANAMON"),
        MUAMALAT_IB("MUAMALAT"),
        BTN_ONLINE("BTNONLINE"),
        ALFAMART("ALFAMART"),
        INDOMARET("INDOMARET"),
        XL_TUNAI("XLTUNAI"),
        INDOSAT_DOMPETKU("DOMPETKU"),
        MANDIRI_E_CASH("MANDIRIEC"),
        BRI_MOBILE_CASH("BRIMC"),
        TELKOMSEL_CASH("TCASH"),
        BEBASBAYAR("BEBASBAYAR"),
        FASTPAY("FASTPAY"),
        MANDIRI_PAYMENT_CODE("MANDIRIPC"),
        FINPAY("FINPAY"),
        BCA_PAYMENT_CODE("BCAPC"),
        ATM_137_CIMVB("ATM137"),
        BNI_VIRTUAL_ACCOUNT("BNIVA"),
        BRI_VIRTUAL_ACCOUNT("BRIVA"),
        BCA_VIRTUAL_ACCOUNT("BCAVA"),
        MANDIRI_VIRTUAL_ACCOUNT("MANDIRIVA"),
        CREDIT_CARD("KKWP");

        private String val;

        PARAMS_PRODUCT_CODE(String val) {
            this.val = val;
        }

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

    }
}
