package com.comsoftacuity.inasm.client.application.store;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.comsoftacuity.inasm.client.application.ApplicationPresenter;
import com.comsoftacuity.inasm.client.place.NameTokens;
import com.comsoftacuity.inasm.client.rest.AppService;
import com.comsoftacuity.inasm.client.util.MessageHandler;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.DELETEMESSAGE;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ERRORMESSAGE;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.SAVEMESSAGE;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.UPDATEMESSAGE;
import com.comsoftacuity.inasm.shared.dto.Lststoresdto;
import com.comsoftacuity.inasm.shared.dto.ServiceResult;
import gwt.material.design.client.ui.MaterialLoader;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
public class StorePresenter extends Presenter<StorePresenter.MyView, StorePresenter.MyProxy> implements StoreUiHandlers {

    @Override
    public void createStore(Lststoresdto store) {
        MaterialLoader.showLoading(true);
        service.addLststores(store, new MethodCallback<Lststoresdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                 MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Lststoresdto response) {
                MaterialLoader.showLoading(false);
                getView().setStoreList((List<Lststoresdto>) response);
                MessageHandler.showmessage(SAVEMESSAGE);
            }
        });
    }

    @Override
    public void updateStore(Lststoresdto store) {
        MaterialLoader.showLoading(true);
        service.updateLststores(store, new MethodCallback<Lststoresdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                 MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Lststoresdto response) {
                MaterialLoader.showLoading(false);
                getView().setStoreList((List<Lststoresdto>) response);
                MessageHandler.showmessage(UPDATEMESSAGE);
            }
        });
    }

    @Override
    public void getStore(int id) {
        MaterialLoader.showLoading(true);
        service.getLststoress(id, id, new MethodCallback<List<Lststoresdto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Lststoresdto> response) {
                MaterialLoader.showLoading(false);
            }
        });
    }

    @Override
    public void deleteStore(int id) {
        MaterialLoader.showLoading(true);
        service.deleteLststores(id, new MethodCallback<ServiceResult>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, ServiceResult response) {
                MaterialLoader.showLoading(false);
                getView().setStoreList((List<Lststoresdto>) response);
                MessageHandler.showmessage(DELETEMESSAGE);
            }
        });
    }

    @Override
    public void getStoreList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getLststoress(offset, limit, new MethodCallback<List<Lststoresdto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Lststoresdto> response) {
                MaterialLoader.showLoading(false);
                getView().setStoreList(response);
            }
        });
    }
    interface MyView extends View , HasUiHandlers<StoreUiHandlers> {
        void setStoreList(List<Lststoresdto> list);
    }
    

    @NameToken(NameTokens.store)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<StorePresenter> {
    }
    private final AppService service;
    @Inject
    StorePresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy,AppService service) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
        this.service=service;
        getView().setUiHandlers(this);
    }
    
    protected void onBind() {
        super.onBind();
    }
    
    protected void onReveal() {
        super.onReveal();
    }
    
    protected void onHide() {
        super.onHide();
    }
    
}