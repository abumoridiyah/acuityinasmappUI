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
@JsonRootName("userassignedusergroup")   
public class Userassignedusergroupdto implements Dto {
    
    private Integer asignuserid;
    
    private Date datecreated;
      
    private Integer enteredbyId;
      
    private Short active;
    
    private Userusergroupdto groupid;
    
    private Userpermissiondto prmissionId;
    
    private Userusersinfodto userid;

    public Userassignedusergroupdto() {
    }

    public Userassignedusergroupdto(Integer asignuserid) {
        this.asignuserid = asignuserid;
    }

    public Userassignedusergroupdto(Integer asignuserid, Date datecreated) {
        this.asignuserid = asignuserid;
        this.datecreated = datecreated;
    }

    public Integer getAsignuserid() {
        return asignuserid;
    }

    public void setAsignuserid(Integer asignuserid) {
        this.asignuserid = asignuserid;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Integer getEnteredbyId() {
        return enteredbyId;
    }

    public void setEnteredbyId(Integer enteredbyId) {
        this.enteredbyId = enteredbyId;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Userusergroupdto getGroupid() {
        return groupid;
    }

    public void setGroupid(Userusergroupdto groupid) {
        this.groupid = groupid;
    }

    public Userpermissiondto getPrmissionId() {
        return prmissionId;
    }

    public void setPrmissionId(Userpermissiondto prmissionId) {
        this.prmissionId = prmissionId;
    }

    public Userusersinfodto getUserid() {
        return userid;
    }

    public void setUserid(Userusersinfodto userid) {
        this.userid = userid;
    }

      
    
}
