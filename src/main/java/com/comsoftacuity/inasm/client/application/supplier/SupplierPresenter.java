/**
 * Date Created: May 23, 2016
 *
 */
package com.comsoftacuity.inasm.client.application.supplier;





import com.comsoftacuity.inasm.client.application.ApplicationPresenter;
import com.comsoftacuity.inasm.client.place.NameTokens;
import com.comsoftacuity.inasm.client.rest.AppService;
import com.comsoftacuity.inasm.client.util.MessageHandler;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.DELETEMESSAGE;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ERRORMESSAGE;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.SAVEMESSAGE;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.UPDATEMESSAGE;
import com.comsoftacuity.inasm.shared.dto.Lstsupplytypedto;
import com.comsoftacuity.inasm.shared.dto.Supplierdto;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import gwt.material.design.client.ui.MaterialLoader;
import java.util.List;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;


/**
 *
 * @author Yusuff Saliu Adediran
 */
public class SupplierPresenter extends Presenter<SupplierPresenter.MyView, SupplierPresenter.MyProxy> implements SupplierUiHandlers {

    @Override
    public void createSupplier(Supplierdto supply) {
        MaterialLoader.showLoading(true);
        service.addSupplier(supply, new MethodCallback<Supplierdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Supplierdto response) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(SAVEMESSAGE);
                getView().setSupplierList((List<Supplierdto>) response);
            }
        });
        
    }

    @Override
    public void updateSupplier(Supplierdto supply) {
        MaterialLoader.showLoading(true);
        service.updateSupplier(supply, new MethodCallback<Supplierdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Supplierdto response) {
                 MaterialLoader.showLoading(false);
                 MessageHandler.showmessage(UPDATEMESSAGE);
                getView().setSupplierList((List<Supplierdto>) response);
            }
        });
    }

    @Override
    public void getSupplier(int id) {
        MaterialLoader.showLoading(true);
        service.getSupplier(id, new MethodCallback<Supplierdto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Supplierdto response) {
                 MaterialLoader.showLoading(false);
            }
        });
    }

    @Override
    public void deleteSupplier(int id) {
       MaterialLoader.showLoading(true);
       service.deleteSupplier(id, new MethodCallback<Supplierdto>() {

           @Override
           public void onFailure(Method method, Throwable exception) {
               MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
           }

           @Override
           public void onSuccess(Method method, Supplierdto response) {
               MaterialLoader.showLoading(false);
               MessageHandler.showmessage(DELETEMESSAGE);
                getView().setSupplierList((List<Supplierdto>) response);
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
    public void craeteSupplyType(Lstsupplytypedto supply) {
        MaterialLoader.showLoading(true);
        service.addLstsupplytype(supply, new MethodCallback<Lstsupplytypedto>() {

            @Override
            public void onFailure(Method method, Throwable exception) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(ERRORMESSAGE);
            }

            @Override
            public void onSuccess(Method method, Lstsupplytypedto response) {
                MaterialLoader.showLoading(false);
                MessageHandler.showmessage(SAVEMESSAGE);
                getView().setSupplierList((List<Supplierdto>) response);
            }
        });
    }

    

    
     interface MyView extends View, HasUiHandlers<SupplierUiHandlers> {
         
       void setSupplierList(List<Supplierdto> list);
       public List<Supplierdto> getSupplierCounter();
    }
     
    @ProxyCodeSplit
    @NameToken(NameTokens.supplier)
    interface MyProxy extends ProxyPlace<SupplierPresenter> {
        
    }
    
    
    private final AppService service;
    @Inject
    SupplierPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy,AppService service) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
        this.service=service;
        getView().setUiHandlers(this);
    }

    @Override
    protected void onBind() {
        super.onBind();
       
    }

   
}
