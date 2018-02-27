package com.comsoftacuity.inasm.client.application.trandepreciation;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class TrandepreciationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(TrandepreciationPresenter.class, TrandepreciationPresenter.MyView.class, TrandepreciationView.class, TrandepreciationPresenter.MyProxy.class);
    }
}