package com.comsoftacuity.inasm.client.application.stockouttype;

import com.comsoftacuity.inasm.shared.dto.Lststockouttypedto;
import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import java.util.List;

class StockouttypeView extends ViewWithUiHandlers<StockouttypeUiHandlers> implements StockouttypePresenter.MyView {

    @Override
    public void setLststockleveltypeList(List<Lststockouttypedto> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    interface Binder extends UiBinder<Widget, StockouttypeView> {
    }

   

    @Inject
    StockouttypeView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    
}