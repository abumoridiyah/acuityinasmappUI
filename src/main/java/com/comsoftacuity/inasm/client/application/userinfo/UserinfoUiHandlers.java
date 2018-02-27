package com.comsoftacuity.inasm.client.application.userinfo;

import com.comsoftacuity.inasm.shared.dto.Userusersinfodto;
import com.gwtplatform.mvp.client.UiHandlers;

interface UserinfoUiHandlers extends UiHandlers {
    void createUserinfo(Userusersinfodto user);
    public void updateUserinfo(Userusersinfodto user);
    public void getUserinfo(int id);
    public void deleteUserinfo(int id);
    void getUserinfoList(int offset, int limit);
}