/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.winpay.api.error;

/**
 *
 * @author Reza Ishaq Maulana <es.mgr@bm.co.id>
 */
public class WinpayException extends Exception{
    
    private String rc;
    private String rd;
    
    /**
     * Construct with description message, be careful using this constructor.
     * Always trap with try catch before using this.
     *
     * @param keterangan
     */
    public WinpayException(String keterangan) {
        super(keterangan);
    }

    /**
     * Construct with predefined response and description.
     *
     * @param responseCode response code (see
     * {@link com.bm.smartcash.constant.ResponseCode})
     * @param descriptionCode description code (see
     * {@link com.bm.smartcash.constant.TextCode})
     */
    public WinpayException(String responseCode,
            String descriptionCode) {
        super();
        this.rc = responseCode;
        this.rd = descriptionCode;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }
    
    
}
