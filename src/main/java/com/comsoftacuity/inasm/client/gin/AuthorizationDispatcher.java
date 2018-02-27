/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.client.gin;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.user.client.Cookies;
import org.fusesource.restygwt.client.Dispatcher;
import org.fusesource.restygwt.client.Method;


/**
 * Created by iroko on 8/8/16.
 */
public class AuthorizationDispatcher implements Dispatcher{
    private final String AUTH_TOKEN_HEADER = "auth_token";
    @Override
    public Request send(Method method, RequestBuilder builder) throws RequestException {
        String basicAuthentication = HttpAuthHelper.generateUserPasswordBase64(
                UserCredentials.INSTANCE.getUsername(),
                UserCredentials.INSTANCE.getPassword()
        );

        builder.setHeader("Authorization", basicAuthentication);
        String userCookie = Cookies.getCookie("user_cookie");
        if (userCookie != null && !(userCookie.isEmpty())) {
            builder.setHeader(AUTH_TOKEN_HEADER, userCookie);

        }
        return builder.send();
    }
    
}
