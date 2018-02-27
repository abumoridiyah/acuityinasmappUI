package com.comsoftacuity.inasm.client.application.usergroup;

import com.comsoftacuity.inasm.shared.dto.Lstmaindto;
import com.comsoftacuity.inasm.shared.dto.Userusergroupdto;
import com.gwtplatform.mvp.client.UiHandlers;
import java.util.List;

interface UsergrouppermissionUiHandlers extends UiHandlers {
    void createUsergroup(Userusergroupdto user);
    public void updateUsergroup(Userusergroupdto user);
    public void getUsergroup(int id);
    public void deleteUsergroup(int id);
    void getUsergroupList(int offset, int limit);
   void getMainList(int offset, int limit);
}