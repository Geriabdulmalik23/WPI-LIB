/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.winpay.api.model.response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.reflect.Modifier;

/**
 *
 * @author al_zain92
 */
public class WPIResponse {

    private String rc;
    private String rd;
    private String request_time;
    private String response_time;
    private WPIData data;
    
    
    @Override
    public String toString() {
        Gson gs = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.FINAL, Modifier.PROTECTED, Modifier.PUBLIC)
                .disableHtmlEscaping()
                .create();
        String a = gs.toJson(this);
        return a;
    }

    public WPIResponse parseJsonToObject(String jsonString) {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.FINAL)
                .create();
        JsonObject j = new JsonParser().parse(jsonString).getAsJsonObject();
        this.setData(gson.fromJson(j.get("data").toString(), this.data.getClass()));
        WPIResponse model = gson.fromJson(jsonString, this.getClass());
        model.setData(this.getData());
        return model;
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

    public String getRequest_time() {
        return request_time;
    }

    public void setRequest_time(String request_time) {
        this.request_time = request_time;
    }

    public String getResponse_time() {
        return response_time;
    }

    public void setResponse_time(String response_time) {
        this.response_time = response_time;
    }

    public WPIData getData() {
        return data;
    }

    public void setData(WPIData data) {
        this.data = data;
    }

    

}
