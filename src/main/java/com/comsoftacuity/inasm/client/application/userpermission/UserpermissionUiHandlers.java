package com.comsoftacuity.inasm.client.application.userpermission;

import com.comsoftacuity.inasm.shared.dto.Userpermissiondto;
import com.gwtplatform.mvp.client.UiHandlers;

interface UserpermissionUiHandlers extends UiHandlers {
    void createUserpermission(Userpermissiondto user);
    public void updateUserpermission(Userpermissiondto user);
    public void getUserpermission(int id);
    public void deleteUserpermission(int id);
    void getUserpermissionList(int offset, int limit);
    void getModuleList(int offset, int limit);
    void getMainList(int offset, int limit);
}