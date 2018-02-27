/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.client.rest;

import com.google.gwt.user.client.Window;

/**
 *
 * @author Mohammed Sadiq
 */
public class ApiPaths {

   // public static final String ROOT = Window.Location.getProtocol() + "//" + Window.Location.getHost() + "/acuityinasmapi/v1";
     public static final String ROOT = "v1"; 
    public static final String PATH_ID = "/{id}";
    
 public static final String PARAMTYPE = "parametertype";
    public static final String MERCHANTCODE = "merchantid";
    public static final String OFFLOCATION = "location";
    public static final String ID = "id";
    public static final String LIMIT = "limit";
    public static final String TAG = "tag";
    public static final String OFFSET = "offset";
    public static final String BASEURL="/inventory";

}
