/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.client.application.supplier;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

/**
 *
 * @author Abu Moridiyah
 */
public class SupplierModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
        bindPresenter(SupplierPresenter.class, SupplierPresenter.MyView.class, SupplierView.class, SupplierPresenter.MyProxy.class);
    }
    
}
