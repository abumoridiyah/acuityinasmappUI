package com.comsoftacuity.inasm.client.application.supplytype;

import com.comsoftacuity.inasm.shared.dto.Lstsupplytypedto;
import com.gwtplatform.mvp.client.UiHandlers;

interface SupplyTypeUiHandlers extends UiHandlers {
    void createSupplyType(Lstsupplytypedto supply);
    public void updateSupplyType(Lstsupplytypedto supply);
    public void getSupplyType(int id);
    public void deleteSupplyType(int id);
    void getSupplyTypeList(int offset, int limit);
    void getSupplierList(int offset, int limit);
    void getLstmainList(int offset, int limit);
}