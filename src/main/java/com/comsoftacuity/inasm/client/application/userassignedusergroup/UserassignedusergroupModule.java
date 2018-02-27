package com.comsoftacuity.inasm.client.application.userassignedusergroup;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class UserassignedusergroupModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(UserassignedusergroupPresenter.class, UserassignedusergroupPresenter.MyView.class, UserassignedusergroupView.class, UserassignedusergroupPresenter.MyProxy.class);
    }
}