package com.comsoftacuity.inasm.client.application.usergroup;

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
import com.comsoftacuity.inasm.shared.dto.Lstmaindto;
import com.comsoftacuity.inasm.shared.dto.Userusergroupdto;
import gwt.material.design.client.ui.MaterialLoader;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
public class UsergrouppermissionPresenter extends Presenter<UsergrouppermissionPresenter.MyView, UsergrouppermissionPresenter.MyProxy> implements UsergrouppermissionUiHandlers {

    @Override
    public void createUsergroup(Userusergroupdto user) {
        MaterialLoader.showLoading(true);
        service.addUsergroup(user, new MethodCallback<Userusergroupdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userusergroupdto response) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(SAVEMESSAGE);
                getView().setUsergroupList((List<Userusergroupdto>) response);
            }
        });
    }

    @Override
    public void updateUsergroup(Userusergroupdto user) {
        MaterialLoader.showLoading(true);
        service.updateUsergroup(user, new MethodCallback<Userusergroupdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userusergroupdto response) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(UPDATEMESSAGE);
                getView().setUsergroupList((List<Userusergroupdto>) response);
            }
        });
    }

    @Override
    public void getUsergroup(int id) {
        MaterialLoader.showLoading(true);
        service.getUsergroup(id, new MethodCallback<Userusergroupdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Userusergroupdto response) {
                MaterialLoader.showLoading(false);
            }
        });
    }

    @Override
    public void deleteUsergroup(int id) {
         MaterialLoader.showLoading(true);
         service.deleteUsergroup(id, new MethodCallback<Userusergroupdto>() {

             @Override
             public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
             }

             @Override
             public void onSuccess(Method method, Userusergroupdto response) {
                  MaterialLoader.showLoading(false);
                MessageHandler.showmessage(DELETEMESSAGE);
                getView().setUsergroupList((List<Userusergroupdto>) response);
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
    public void getMainList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getLstmains(offset, limit, new MethodCallback<List<Lstmaindto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(true);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Lstmaindto> response) {
                MaterialLoader.showLoading(false);
                getView().setMainList(response);
            }
        });
    }
    interface MyView extends View , HasUiHandlers<UsergrouppermissionUiHandlers> {
        void setUsergroupList(List<Userusergroupdto> list);
        void setMainList(List<Lstmaindto> list);
    }
    

    @NameToken(NameTokens.usergrouppermission)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<UsergrouppermissionPresenter> {
    }
     private final AppService service;
     
    @Inject
    UsergrouppermissionPresenter(
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