package com.comsoftacuity.inasm.client.gin;

import com.comsoftacuity.inasm.client.application.ApplicationModule;
import com.comsoftacuity.inasm.client.place.NameTokens;
import com.comsoftacuity.inasm.client.resources.ResourceLoader;

import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class ClientModule extends AbstractPresenterModule {

    @Override
    protected void configure() {

        install(new DefaultModule.Builder().build());
        install(new ApplicationModule());
       
        bind(ResourceLoader.class).asEagerSingleton();
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.HOME);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.HOME);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.HOME);
        bind(RestyGWTConfig.class).asEagerSingleton();
       
    }
}
