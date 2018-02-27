package com.comsoftacuity.inasm.client.application.userpermission;

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
import com.comsoftacuity.inasm.shared.dto.Appmodulesdto;
import com.comsoftacuity.inasm.shared.dto.Tranmaindto;
import com.comsoftacuity.inasm.shared.dto.Userpermissiondto;
import gwt.material.design.client.ui.MaterialLoader;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
public class UserpermissionPresenter extends Presenter<UserpermissionPresenter.MyView, UserpermissionPresenter.MyProxy> implements UserpermissionUiHandlers {

    @Override
    public void createUserpermission(Userpermissiondto user) {
        MaterialLoader.showLoading(true);
        service.addUserpermission(user, new MethodCallback<Userpermissiondto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userpermissiondto response) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(SAVEMESSAGE);
                getView().setUserpermissionList((List<Userpermissiondto>) response);
            }
        });
    }

    @Override
    public void updateUserpermission(Userpermissiondto user) {
        MaterialLoader.showLoading(true);
        service.updateUserpermission(user, new MethodCallback<Userpermissiondto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userpermissiondto response) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(UPDATEMESSAGE);
                getView().setUserpermissionList((List<Userpermissiondto>) response);
            }
        });
    }

    @Override
    public void getUserpermission(int id) {
        MaterialLoader.showLoading(true);
        service.getUserpermission(id, new MethodCallback<Userpermissiondto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userpermissiondto response) {
                MaterialLoader.showLoading(false);
            }
        });
    }

    @Override
    public void deleteUserpermission(int id) {
        MaterialLoader.showLoading(true);
        service.deleteUserpermission(id, new MethodCallback<Userpermissiondto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userpermissiondto response) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(DELETEMESSAGE);
                getView().setUserpermissionList((List<Userpermissiondto>) response);
            }
        });
    }

    @Override
    public void getUserpermissionList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getUserpermissionList(offset, limit, new MethodCallback<List<Userpermissiondto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Userpermissiondto> response) {
                MaterialLoader.showLoading(false);
                getView().setUserpermissionList(response);
                
            }
        });
    }

    @Override
    public void getModuleList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getAppmoduless(offset, limit, new MethodCallback<List<Appmodulesdto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Appmodulesdto> response) {
                 MaterialLoader.showLoading(false);
                 getView().setModuleList(response);
            }
        });
    }

    @Override
    public void getMainList(int offset, int limit) {
         MaterialLoader.showLoading(true);
         service.getTranmainList(offset, limit, new MethodCallback<List<Tranmaindto>>() {

             @Override
             public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
             }

             @Override
             public void onSuccess(Method method, List<Tranmaindto> response) {
                 MaterialLoader.showLoading(false);
                 getView().setMainList(response);
             }
         });
    }
    interface MyView extends View , HasUiHandlers<UserpermissionUiHandlers> {
        void setUserpermissionList(List<Userpermissiondto> list);
        void setModuleList(List<Appmodulesdto> list);
        void setMainList(List<Tranmaindto> list);
    }
   

    @NameToken(NameTokens.userpermission)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<UserpermissionPresenter> {
    }
    private final AppService service;
    @Inject
    UserpermissionPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy,AppService service) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
        this.service=service;
        getView().setUiHandlers(this);
    }
    
    protected void onBind() {
        super.onBind();
        getMainList(0, 50);
        getModuleList(0, 50);
    }
    
    protected void onReveal() {
        super.onReveal();
    }
    
    protected void onHide() {
        super.onHide();
    }
    
}