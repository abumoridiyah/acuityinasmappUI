package com.comsoftacuity.inasm.client.application.userpermission;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class UserpermissionModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(UserpermissionPresenter.class, UserpermissionPresenter.MyView.class, UserpermissionView.class, UserpermissionPresenter.MyProxy.class);
    }
}