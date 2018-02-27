package com.comsoftacuity.inasm.client.application.supplytype;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
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
import com.comsoftacuity.inasm.shared.dto.Lstsupplytypedto;
import com.comsoftacuity.inasm.shared.dto.ServiceResult;
import com.comsoftacuity.inasm.shared.dto.Supplierdto;
import gwt.material.design.client.ui.MaterialLoader;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
public class SupplyTypePresenter extends Presenter<SupplyTypePresenter.MyView, SupplyTypePresenter.MyProxy> implements SupplyTypeUiHandlers {

    @Override
    public void createSupplyType(Lstsupplytypedto supply) {
        MaterialLoader.showLoading(true);
        service.addLstsupplytype(supply, new MethodCallback<Lstsupplytypedto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Lstsupplytypedto response) {
                MessageHandler.showmessage(SAVEMESSAGE);
                getView().setLstSupplyTypeList((List<Lstsupplytypedto>) response);
            }
        });
    }

    @Override
    public void updateSupplyType(Lstsupplytypedto supply) {
        MaterialLoader.showLoading(true);
        service.updateLstsupplytype(supply, new MethodCallback<Lstsupplytypedto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Lstsupplytypedto response) {
                MessageHandler.showmessage(UPDATEMESSAGE);
                getView().setLstSupplyTypeList((List<Lstsupplytypedto>) response);
            }
        });
    }

    @Override
    public void getSupplyType(int id) {
        MaterialLoader.showLoading(true);
        service.getLstsupplytype(id, new MethodCallback<Lstsupplytypedto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
                
            }

            @Override
            public void onSuccess(Method method, Lstsupplytypedto response) {
                getView().setLstSupplyTypeList((List<Lstsupplytypedto>) response);
            }
        });
    }

    @Override
    public void deleteSupplyType(int id) {
         MaterialLoader.showLoading(true);
        service.deleteLstsupplytype(id, new MethodCallback<ServiceResult>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, ServiceResult response) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(DELETEMESSAGE);
               
            }
        });
    }

    @Override
    public void getSupplyTypeList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getLstsupplytypes(offset, limit, new MethodCallback<List<Lstsupplytypedto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Lstsupplytypedto> response) {
                MaterialLoader.showLoading(false);
                getView().setLstSupplyTypeList(response);
            }
        });
    }

    @Override
    public void getSupplierList(int offset, int limit) {
         MaterialLoader.showLoading(true);
         service.getSupplierList(offset, limit, new MethodCallback<List<Supplierdto>>() {

             @Override
             public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
             }

             @Override
             public void onSuccess(Method method, List<Supplierdto> response) {
                 MaterialLoader.showLoading(false);
                 getView().setSupplierList(response);
             }
         });
    }

    @Override
    public void getLstmainList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getLstmains(offset, limit, new MethodCallback<List<Lstmaindto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                 MessageHandler.showmessage(exception.getMessage());
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Lstmaindto> response) {
                MaterialLoader.showLoading(false);
                getView().setTranmainList(response);
            }
        });
    }

    
    interface MyView extends View , HasUiHandlers<SupplyTypeUiHandlers> {
        void setLstSupplyTypeList(List<Lstsupplytypedto> list);
        void setSupplierList(List<Supplierdto> list);
        void setTranmainList(List<Lstmaindto> list);
    }
   
    @NameToken(NameTokens.institution)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<SupplyTypePresenter> {
    }
private final AppService service;
    @Inject
    SupplyTypePresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy,AppService service) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
        this.service=service;
        getView().setUiHandlers(this);
    }
    
    protected void onBind() {
        super.onBind();
        getLstmainList(0, 50);
        getSupplierList(0, 50);
    }
    
}