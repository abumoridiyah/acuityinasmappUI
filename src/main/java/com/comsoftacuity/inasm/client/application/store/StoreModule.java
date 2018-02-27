package com.comsoftacuity.inasm.client.application.store;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class StoreModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(StorePresenter.class, StorePresenter.MyView.class, StoreView.class, StorePresenter.MyProxy.class);
    }
}