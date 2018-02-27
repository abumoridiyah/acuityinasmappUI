package com.comsoftacuity.inasm.client.application.userinfo;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class UserinfoModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(UserinfoPresenter.class, UserinfoPresenter.MyView.class, UserinfoView.class, UserinfoPresenter.MyProxy.class);
    }
}