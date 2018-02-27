/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;

/**
 *
 *   
 */
 @JsonRootName("userusergrouppermission")
public class Userusergrouppermissiondto implements Dto {
   
    
    private Integer grouppermid;
      
    private Boolean status;
    
    private Date datecreated;
      
    private Integer enteredbyid;
      
    private Short active;
     
    private Userusergroupdto usergrpid;
    
    private Userpermissiondto permissionId;

    public Userusergrouppermissiondto() {
    }

    public Userusergrouppermissiondto(Integer grouppermid) {
        this.grouppermid = grouppermid;
    }

    public Userusergrouppermissiondto(Integer grouppermid, Date datecreated) {
        this.grouppermid = grouppermid;
        this.datecreated = datecreated;
    }

    public Integer getGrouppermid() {
        return grouppermid;
    }

    public void setGrouppermid(Integer grouppermid) {
        this.grouppermid = grouppermid;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
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

    public Userusergroupdto getUsergrpid() {
        return usergrpid;
    }

    public void setUsergrpid(Userusergroupdto usergrpid) {
        this.usergrpid = usergrpid;
    }

    public Userpermissiondto getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Userpermissiondto permissionId) {
        this.permissionId = permissionId;
    }

      
}
