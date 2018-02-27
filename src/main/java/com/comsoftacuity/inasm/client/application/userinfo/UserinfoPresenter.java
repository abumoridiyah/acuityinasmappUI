package com.comsoftacuity.inasm.client.application.userinfo;

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
import com.comsoftacuity.inasm.shared.dto.Userusersinfodto;
import gwt.material.design.client.ui.MaterialLoader;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
public class UserinfoPresenter extends Presenter<UserinfoPresenter.MyView, UserinfoPresenter.MyProxy> implements UserinfoUiHandlers {

    @Override
    public void createUserinfo(Userusersinfodto user) {
         MaterialLoader.showLoading(true);
         service.addUserinfo(user, new MethodCallback<Userusersinfodto>() {

             @Override
             public void onFailure(Method method, Throwable exception) {
                  MaterialLoader.showLoading(false);
                 MessageHandler.showmessage(ERRORMESSAGE);
             }

             @Override
             public void onSuccess(Method method, Userusersinfodto response) {
                  MaterialLoader.showLoading(false);
                  MessageHandler.showmessage(SAVEMESSAGE);
                  getView().setUserinfoList((List<Userusersinfodto>) response);
             }
         });
    }

    @Override
    public void updateUserinfo(Userusersinfodto user) {
         MaterialLoader.showLoading(true);
         service.updateUserinfo(user, new MethodCallback<Userusersinfodto>() {

             @Override
             public void onFailure(Method method, Throwable exception) {
                  MaterialLoader.showLoading(false);
                 MessageHandler.showmessage(ERRORMESSAGE);
             }

             @Override
             public void onSuccess(Method method, Userusersinfodto response) {
                  MaterialLoader.showLoading(false);
                  MessageHandler.showmessage(UPDATEMESSAGE);
                  getView().setUserinfoList((List<Userusersinfodto>) response);
             }
         });
    }

    @Override
    public void getUserinfo(int id) {
        MaterialLoader.showLoading(true);
        service.getUserinfo(id, new MethodCallback<Userusersinfodto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                 MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userusersinfodto response) {
                MaterialLoader.showLoading(false);
            }
        });
    }

    @Override
    public void deleteUserinfo(int id) {
        MaterialLoader.showLoading(true);
        service.deleteUserinfo(id, new MethodCallback<Userusersinfodto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                 MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userusersinfodto response) {
                 MaterialLoader.showLoading(false);
                  MessageHandler.showmessage(DELETEMESSAGE);
                  getView().setUserinfoList((List<Userusersinfodto>) response);
            }
        });
    }

    @Override
    public void getUserinfoList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getUseruserinfoList(offset, limit, new MethodCallback<List<Userusersinfodto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Userusersinfodto> response) {
                MaterialLoader.showLoading(false);
                getView().setUserinfoList(response);
            }
        });
    }
    interface MyView extends View , HasUiHandlers<UserinfoUiHandlers> {
         void setUserinfoList(List<Userusersinfodto> list);
    }
    

    @NameToken(NameTokens.userinfo)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<UserinfoPresenter> {
    }
     private final AppService service;
    @Inject
    UserinfoPresenter(
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