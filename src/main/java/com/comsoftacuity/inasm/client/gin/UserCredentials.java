/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.client.gin;

/**
 * Created by peter on 8/8/16.
 */
public enum  UserCredentials {

    INSTANCE("anonymous", "12345");

    private String username;
    private String password;


    private UserCredentials(String username, String password) {
        this.setPassword(password);
        this.setUsername(username);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
