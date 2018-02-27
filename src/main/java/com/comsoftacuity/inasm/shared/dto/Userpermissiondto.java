/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.List;

/**
 *
 *   
 */
@JsonRootName("userpermission") 
public class Userpermissiondto implements Dto {
    
    
    private Integer permissionid;
    
    private String permission;
     
    private String description;
      
    private Integer enteredbyid;
      
    private Short active;
      
    private Integer lstmainid;
      
    private List<Userusergrouppermissiondto> userusergrouppermissionList;
      
      
    private Appmodulesdto moduleid;
      
    private List<Userassignedusergroupdto> userassignedusergroupList;

    public Userpermissiondto() {
    }

    public Userpermissiondto(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEnteredbyid() {
        return enteredbyid;
    }

    public void setEnteredbyid(Integer enteredbyid) {
        this.enteredbyid = enteredbyid;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Integer getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Integer lstmainid) {
        this.lstmainid = lstmainid;
    }

      
    public List<Userusergrouppermissiondto> getUserusergrouppermissionList() {
        return userusergrouppermissionList;
    }

    public void setUserusergrouppermissionList(List<Userusergrouppermissiondto> userusergrouppermissionList) {
        this.userusergrouppermissionList = userusergrouppermissionList;
    }

    public Appmodulesdto getModuleid() {
        return moduleid;
    }

    public void setModuleid(Appmodulesdto moduleid) {
        this.moduleid = moduleid;
    }

      
    public List<Userassignedusergroupdto> getUserassignedusergroupList() {
        return userassignedusergroupList;
    }

    public void setUserassignedusergroupList(List<Userassignedusergroupdto> userassignedusergroupList) {
        this.userassignedusergroupList = userassignedusergroupList;
    }

     
    
}
