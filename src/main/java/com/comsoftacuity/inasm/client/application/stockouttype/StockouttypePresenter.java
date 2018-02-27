package com.comsoftacuity.inasm.client.application.stockouttype;

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
import com.comsoftacuity.inasm.shared.dto.Lststockouttypedto;
import com.comsoftacuity.inasm.shared.dto.ServiceResult;
import gwt.material.design.client.ui.MaterialLoader;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
public class StockouttypePresenter extends Presenter<StockouttypePresenter.MyView, StockouttypePresenter.MyProxy> implements StockouttypeUiHandlers {

    @Override
    public void createStockout(Lststockouttypedto stock) {
        MaterialLoader.showLoading(true);
        service.addLststockouttype(stock, new MethodCallback<Lststockouttypedto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                 MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Lststockouttypedto response) {
                 MaterialLoader.showLoading(false);
                 getView().setLststockleveltypeList((List<Lststockouttypedto>) response);
                 MessageHandler.showmessage(SAVEMESSAGE);
            }
        });
    }

    @Override
    public void updateStockout(Lststockouttypedto stock) {
        MaterialLoader.showLoading(true);
        service.updateLststockouttype(stock, new MethodCallback<Lststockouttypedto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Lststockouttypedto response) {
                MaterialLoader.showLoading(false);
                getView().setLststockleveltypeList((List<Lststockouttypedto>) response);
                MessageHandler.showmessage(UPDATEMESSAGE);
            }
        });
    }

    @Override
    public void getStockout(int id) {
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
    public void deleteStockout(int id) {
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
                getView().setLststockleveltypeList((List<Lststockouttypedto>) response);
                MessageHandler.showmessage(DELETEMESSAGE);
            }
        });
    }

    @Override
    public void getStockoutList(int offset, int limit) {
        MaterialLoader.showLoading(true);
        service.getLststockouttypes(offset, limit, new MethodCallback<List<Lststockouttypedto>>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, List<Lststockouttypedto> response) {
                MaterialLoader.showLoading(false);
                getView().setLststockleveltypeList(response);
            }
        });
    }
    interface MyView extends View , HasUiHandlers<StockouttypeUiHandlers> {
         void setLststockleveltypeList(List<Lststockouttypedto> list);
    }
    

    @NameToken(NameTokens.stockouttype)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<StockouttypePresenter> {
    }
    private final AppService service;
    @Inject
    StockouttypePresenter(
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