package com.comsoftacuity.inasm.client.application.stockoutreceipttype;

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
public class StockoutreceipttypePresenter extends Presenter<StockoutreceipttypePresenter.MyView, StockoutreceipttypePresenter.MyProxy> implements StockoutreceipttypeUiHandlers {
    interface MyView extends View , HasUiHandlers<StockoutreceipttypeUiHandlers> {
    }
    

    @NameToken(NameTokens.stockoutreceipttype)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<StockoutreceipttypePresenter> {
    }

    @Inject
    StockoutreceipttypePresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
        
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