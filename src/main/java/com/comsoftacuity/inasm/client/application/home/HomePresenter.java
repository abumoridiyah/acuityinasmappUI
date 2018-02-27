package com.comsoftacuity.inasm.client.application.home;

import com.comsoftacuity.inasm.client.application.ApplicationPresenter;
import com.comsoftacuity.inasm.client.place.NameTokens;
import com.comsoftacuity.inasm.client.rest.AppService;
import com.comsoftacuity.inasm.shared.dto.Lstcategoryleveltypedto;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.client.ui.MaterialToast;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

public class HomePresenter extends Presenter<HomePresenter.MyView, HomePresenter.MyProxy> {

    interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.HOME)
    interface MyProxy extends ProxyPlace<HomePresenter> {
    }
    private final AppService service;

    @Inject
    HomePresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy, AppService service) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
        this.service = service;
    }

    @Override
    protected void onBind() {
        super.onBind(); //To change body of generated methods, choose Tools | Templates.
        service.getLstcategoryleveltypes(0, 0, new MethodCallback<List<Lstcategoryleveltypedto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialToast.fireToast(exception.getMessage());
            }

            @Override
            public void onSuccess(Method method, List<Lstcategoryleveltypedto> response) {
                MaterialToast.fireToast("Size: " + response.size());
            }
        });
    }

}
