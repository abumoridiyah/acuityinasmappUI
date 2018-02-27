package com.comsoftacuity.inasm.client.application.stockleveltype;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class StockleveltypeModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(StockleveltypePresenter.class, StockleveltypePresenter.MyView.class, StockleveltypeView.class, StockleveltypePresenter.MyProxy.class);
    }
}