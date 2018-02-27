package com.comsoftacuity.inasm.client.application.stockouttype;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class StockouttypeModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(StockouttypePresenter.class, StockouttypePresenter.MyView.class, StockouttypeView.class, StockouttypePresenter.MyProxy.class);
    }
}