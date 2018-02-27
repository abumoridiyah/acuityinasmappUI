package com.comsoftacuity.inasm.client.application.stockleveltype;

import com.comsoftacuity.inasm.shared.dto.Lststockleveltypedto;
import com.gwtplatform.mvp.client.UiHandlers;

interface StockleveltypeUiHandlers extends UiHandlers {
     void createStockleveltype(Lststockleveltypedto stock);
    public void updateStocklevel(Lststockleveltypedto stock);
    public void getStockleveltype(int id);
    public void deleteStockleveltype(int id);
    void getStockleveltypeList(int offset, int limit);
}