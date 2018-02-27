package com.comsoftacuity.inasm.client.application.usergroup;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class UsergrouppermissionModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(UsergrouppermissionPresenter.class, UsergrouppermissionPresenter.MyView.class, UsergrouppermissionView.class, UsergrouppermissionPresenter.MyProxy.class);
    }
}