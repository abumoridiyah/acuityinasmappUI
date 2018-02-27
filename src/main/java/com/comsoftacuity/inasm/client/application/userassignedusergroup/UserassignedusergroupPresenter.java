package com.comsoftacuity.inasm.client.application.userassignedusergroup;

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
import com.comsoftacuity.inasm.shared.dto.Userassignedusergroupdto;
import com.comsoftacuity.inasm.shared.dto.Userpermissiondto;
import com.comsoftacuity.inasm.shared.dto.Userusergroupdto;
import com.comsoftacuity.inasm.shared.dto.Userusersinfodto;
import gwt.material.design.client.ui.MaterialLoader;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
public class UserassignedusergroupPresenter extends Presenter<UserassignedusergroupPresenter.MyView, UserassignedusergroupPresenter.MyProxy> implements UserassignedusergroupUiHandlers {

    @Override
    public void createUserassignedgroup(Userassignedusergroupdto user) {
         MaterialLoader.showLoading(true);
        service.addUserassignedusergroup(user, new MethodCallback<Userassignedusergroupdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userassignedusergroupdto response) {
                MaterialLoader.showLoading(false);
                getView().setUserassignedusergroupList((List<Userassignedusergroupdto>) response);
                MessageHandler.showmessage(SAVEMESSAGE);
            }
        });
    }

    @Override
    public void updateUserassignedgroup(Userassignedusergroupdto user) {
        MaterialLoader.showLoading(true);
        service.updateUserassignedusergroup(user, new MethodCallback<Userassignedusergroupdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userassignedusergroupdto response) {
                 MaterialLoader.showLoading(false);
                 getView().setUserassignedusergroupList((List<Userassignedusergroupdto>) response);
                 MessageHandler.showmessage(UPDATEMESSAGE);
            }
        });
    }

    @Override
    public void getUserassignedgroup(int id) {
        MaterialLoader.showLoading(true);
        service.getUserassignedusergroup(id, new MethodCallback<Userassignedusergroupdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userassignedusergroupdto response) {
                MaterialLoader.showLoading(false);
            }
        });
    }

    @Override
    public void deleteUserassignedgroup(int id) {
        MaterialLoader.showLoading(true);
        service.deleteUserassignedusergroup(id, new MethodCallback<Userassignedusergroupdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userassignedusergroupdto response) {
                MaterialLoader.showLoading(false);
                getView().setUserassignedusergroupList((List<Userassignedusergroupdto>) response);
                MessageHandler.showmessage(DELETEMESSAGE);
            }
        });
    }

    @Override
    public void getUserassignedgroupList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getUserassignedusergroupList(offset, limit, new MethodCallback<List<Userassignedusergroupdto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Userassignedusergroupdto> response) {
                MaterialLoader.showLoading(false);
                getView().setUserassignedusergroupList(response);
            }
        });
    }

    @Override
    public void getUsergroupList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getUsergroupList(offset, limit, new MethodCallback<List<Userusergroupdto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Userusergroupdto> response) {
                MaterialLoader.showLoading(false);
                getView().setUsergroupList(response);
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
    interface MyView extends View , HasUiHandlers<UserassignedusergroupUiHandlers> {
        void setUserassignedusergroupList(List<Userassignedusergroupdto> list);
        void setUsergroupList(List<Userusergroupdto> list);
        void setUserpermissionList(List<Userpermissiondto> list);
        void setUserinfoList(List<Userusersinfodto> list);
    }
   

    @NameToken(NameTokens.userassignedusergroup)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<UserassignedusergroupPresenter> {
    }
    private final AppService service;
    @Inject
    UserassignedusergroupPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy,AppService service) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
         this.service=service;
        getView().setUiHandlers(this);
    }
    
    protected void onBind() {
        super.onBind();
        getUserpermissionList(0, 50);
        getUserinfoList(0, 50);
        getUsergroupList(0, 50);
    }
    
    protected void onReveal() {
        super.onReveal();
    }
    
    protected void onHide() {
        super.onHide();
    }
    
}