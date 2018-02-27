package com.comsoftacuity.inasm.client.application.stockoutreceipttype;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

class StockoutreceipttypeView extends ViewWithUiHandlers<StockoutreceipttypeUiHandlers> implements StockoutreceipttypePresenter.MyView {
    interface Binder extends UiBinder<Widget, StockoutreceipttypeView> {
    }

   

    @Inject
    StockoutreceipttypeView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    
}