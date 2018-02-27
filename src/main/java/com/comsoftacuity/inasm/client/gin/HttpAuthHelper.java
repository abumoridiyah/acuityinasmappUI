/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.client.gin;

/**
 *
 * @author vaterp
 */
public class HttpAuthHelper {
  
    public static native String generateUserPasswordBase64(String username, String password) /*-{
        return window.btoa(username + ":" + password);
    }-*/;  
}
