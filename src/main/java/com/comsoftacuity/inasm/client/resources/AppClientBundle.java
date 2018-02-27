/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 *
 * @author JIDEX
 */
public interface AppClientBundle extends ClientBundle{
    AppClientBundle INSTANCE =GWT.create(AppClientBundle.class);
    @Source("css/app.css")
    TextResource appCss();
}
