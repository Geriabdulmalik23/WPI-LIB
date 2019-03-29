/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.winpay.api.model.response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Modifier;

/**
 *
 * @author al_zain92
 */
public class WPIData {

    public WPIData parseJsonToObject(String jsonString, Class parseModel) {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.FINAL)
                .disableHtmlEscaping()
                .create();
        WPIData model = (WPIData) gson.fromJson(jsonString, parseModel);
        return model;
    }

    @Override
    public String toString() {
        Gson gs = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.FINAL, Modifier.PROTECTED)
                .disableHtmlEscaping()
                .create();
        String a = gs.toJson(this);
        return a;
    }

    public WPIData createMessage() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (WPIData) Class.forName(this.getClass().getName()).newInstance();
    }
}
