package com.comsoftacuity.inasm.client.application.userassignedusergroup;

import com.comsoftacuity.inasm.shared.dto.Userassignedusergroupdto;
import com.gwtplatform.mvp.client.UiHandlers;

interface UserassignedusergroupUiHandlers extends UiHandlers {
    void createUserassignedgroup(Userassignedusergroupdto user);
    public void updateUserassignedgroup(Userassignedusergroupdto user);
    public void getUserassignedgroup(int id);
    public void deleteUserassignedgroup(int id);
    void getUserassignedgroupList(int offset, int limit);
    void getUsergroupList(int offset, int limit);
    void getUserpermissionList(int offset, int limit);
    void getUserinfoList(int offset, int limit);
}