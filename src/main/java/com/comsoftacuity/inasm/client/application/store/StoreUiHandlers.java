package com.comsoftacuity.inasm.client.application.store;

import com.comsoftacuity.inasm.shared.dto.Lststoresdto;
import com.gwtplatform.mvp.client.UiHandlers;

interface StoreUiHandlers extends UiHandlers {
    void createStore(Lststoresdto store);
    public void updateStore(Lststoresdto store);
    public void getStore(int id);
    public void deleteStore(int id);
    void getStoreList(int offset, int limit);
}