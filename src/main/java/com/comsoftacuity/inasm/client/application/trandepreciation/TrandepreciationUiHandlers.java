package com.comsoftacuity.inasm.client.application.trandepreciation;

import com.comsoftacuity.inasm.shared.dto.Trandepreciationdto;
import com.gwtplatform.mvp.client.UiHandlers;

interface TrandepreciationUiHandlers extends UiHandlers {
    void createTrandepreciation(Trandepreciationdto depreciate);
    public void updateTrandepreciation(Trandepreciationdto depreciate);
    public void getTrandepreciation(int id);
    public void deleteTrandepreciation(int id);
    void getTrandepreciationList(int offset, int limit);
    void getRegitemsList(int offset, int limit);
    void getPrminstitution(int offset, int limit);
}