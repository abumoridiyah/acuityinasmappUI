package com.comsoftacuity.inasm.client.application.trandepreciation;

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
import com.comsoftacuity.inasm.shared.dto.Prmintinstitutiondto;
import com.comsoftacuity.inasm.shared.dto.Regitemsdto;
import com.comsoftacuity.inasm.shared.dto.Trandepreciationdto;
import gwt.material.design.client.ui.MaterialLoader;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
public class TrandepreciationPresenter extends Presenter<TrandepreciationPresenter.MyView, TrandepreciationPresenter.MyProxy> implements TrandepreciationUiHandlers {

    @Override
    public void createTrandepreciation(Trandepreciationdto depreciate) {
        MaterialLoader.showLoading(true);
        service.addTrandepreciation(depreciate, new MethodCallback<Trandepreciationdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                    MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Trandepreciationdto response) {
                 MaterialLoader.showLoading(false);
                 getView().setTrandepreciationList((List<Trandepreciationdto>) response);
                 MessageHandler.showmessage(SAVEMESSAGE);
            }
        });
    }

    @Override
    public void updateTrandepreciation(Trandepreciationdto depreciate) {
        MaterialLoader.showLoading(true);
        service.updateTrandepreciation(depreciate, new MethodCallback<Trandepreciationdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Trandepreciationdto response) {
                MaterialLoader.showLoading(false);
                getView().setTrandepreciationList((List<Trandepreciationdto>) response);
                MessageHandler.showmessage(UPDATEMESSAGE);
            }
        });
    }

    @Override
    public void getTrandepreciation(int id) {
        MaterialLoader.showLoading(true);
        service.getTrandepreciation(id, new MethodCallback<Trandepreciationdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Trandepreciationdto response) {
                MaterialLoader.showLoading(false);
                getView().setTrandepreciationList((List<Trandepreciationdto>) response);
               
            }
        });
    }

    @Override
    public void deleteTrandepreciation(int id) {
        MaterialLoader.showLoading(true);
        service.deleteTrandepreciation(id, new MethodCallback<Trandepreciationdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Trandepreciationdto response) {
                MaterialLoader.showLoading(false);
                getView().setTrandepreciationList((List<Trandepreciationdto>) response);
                MessageHandler.showmessage(DELETEMESSAGE);
            }
        });
    }

    @Override
    public void getTrandepreciationList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getTrandepreciationList(offset, limit, new MethodCallback<List<Trandepreciationdto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Trandepreciationdto> response) {
                MaterialLoader.showLoading(false);
                getView().setTrandepreciationList(response);
            }
        });
    }

    @Override
    public void getRegitemsList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getRegitemsList(offset, limit, new MethodCallback<List<Regitemsdto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Regitemsdto> response) {
                MaterialLoader.showLoading(false);
                getView().setRegitemsList(response);
            }
        });
    }

    @Override
    public void getPrminstitution(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getPrmintinstitutions(offset, limit, new MethodCallback<List<Prmintinstitutiondto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Prmintinstitutiondto> response) {
                MaterialLoader.showLoading(false);
                getView().setPrminstitutionList(response);
            }
        });
    }
    interface MyView extends View , HasUiHandlers<TrandepreciationUiHandlers> {
        void setTrandepreciationList(List<Trandepreciationdto> list);
        void setRegitemsList(List<Regitemsdto> list);
        void setPrminstitutionList(List<Prmintinstitutiondto> list);
    }
   

    @NameToken(NameTokens.trandepreciation)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<TrandepreciationPresenter> {
    }
     private final AppService service;
    @Inject
    TrandepreciationPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy,AppService service) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
        this.service=service;
        getView().setUiHandlers(this);
    }
    
    protected void onBind() {
        super.onBind();
        getPrminstitution(0, 50);
        getRegitemsList(0, 50);
    }
    
    protected void onReveal() {
        super.onReveal();
    }
    
    protected void onHide() {
        super.onHide();
    }
    
}