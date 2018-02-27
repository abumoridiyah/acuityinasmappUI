package com.comsoftacuity.inasm.client.application.stockoutreceipttype;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class StockoutreceipttypeModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(StockoutreceipttypePresenter.class, StockoutreceipttypePresenter.MyView.class, StockoutreceipttypeView.class, StockoutreceipttypePresenter.MyProxy.class);
    }
}