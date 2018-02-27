/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.client.util;


import gwt.material.design.client.ui.MaterialToast;

/**
 *
 * @author Mohammed Sadiq
 */
public class MessageHandler {
   
    public static void showmessage(String message){
        MaterialToast.fireToast(message);
    }
}
