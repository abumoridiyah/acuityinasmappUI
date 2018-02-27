package com.comsoftacuity.inasm.client.application.stockleveltype;

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
import com.comsoftacuity.inasm.shared.dto.Lststockleveltypedto;
import com.comsoftacuity.inasm.shared.dto.ServiceResult;
import gwt.material.design.client.ui.MaterialLoader;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
public class StockleveltypePresenter extends Presenter<StockleveltypePresenter.MyView, StockleveltypePresenter.MyProxy> implements StockleveltypeUiHandlers {

    @Override
    public void createStockleveltype(Lststockleveltypedto stock) {
         MaterialLoader.showLoading(true);
        service.addLststockleveltype(stock, new MethodCallback<Lststockleveltypedto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Lststockleveltypedto response) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(SAVEMESSAGE);
                getView().setLststockleveltypeList((List<Lststockleveltypedto>) response);
            }
        });
    }

    @Override
    public void updateStocklevel(Lststockleveltypedto stock) {
        MaterialLoader.showLoading(true);
        service.updateLststockleveltype(stock, new MethodCallback<Lststockleveltypedto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                 MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Lststockleveltypedto response) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(UPDATEMESSAGE);
                getView().setLststockleveltypeList((List<Lststockleveltypedto>) response);
            }
        });
    }

    @Override
    public void getStockleveltype(int id) {
        MaterialLoader.showLoading(true);
        service.getLststockleveltype(id, new MethodCallback<Lststockleveltypedto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Lststockleveltypedto response) {
                MaterialLoader.showLoading(false);
                
            }
        });
    }

    @Override
    public void deleteStockleveltype(int id) {
         MaterialLoader.showLoading(true);
         service.deleteLststockleveltype(id, new MethodCallback<ServiceResult>() {

             @Override
             public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
             }

             @Override
             public void onSuccess(Method method, ServiceResult response) {
                  MaterialLoader.showLoading(false);
                  MessageHandler.showmessage(DELETEMESSAGE);
                  getView().setLststockleveltypeList((List<Lststockleveltypedto>) response);
             }
         });
    }

    @Override
    public void getStockleveltypeList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getLststockleveltypes(offset, limit, new MethodCallback<List<Lststockleveltypedto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Lststockleveltypedto> response) {
                MaterialLoader.showLoading(false);
                getView().setLststockleveltypeList(response);
            }
        });
    }
    interface MyView extends View , HasUiHandlers<StockleveltypeUiHandlers> {
         void setLststockleveltypeList(List<Lststockleveltypedto> list);
    }
    

    @NameToken(NameTokens.stockleveltype)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<StockleveltypePresenter> {
    }
    private final AppService service;
    
    @Inject
    StockleveltypePresenter(
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