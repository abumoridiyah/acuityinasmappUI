package com.comsoftacuity.inasm.client.application.stockouttype;

import com.comsoftacuity.inasm.shared.dto.Lststockouttypedto;
import com.gwtplatform.mvp.client.UiHandlers;

interface StockouttypeUiHandlers extends UiHandlers {
     void createStockout(Lststockouttypedto stock);
    public void updateStockout(Lststockouttypedto stock);
    public void getStockout(int id);
    public void deleteStockout(int id);
    void getStockoutList(int offset, int limit);
}