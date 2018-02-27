package com.comsoftacuity.inasm.client.application.supplytype;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class SupplyTypeModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(SupplyTypePresenter.class, SupplyTypePresenter.MyView.class, SupplyTypeView.class, SupplyTypePresenter.MyProxy.class);
    }
}