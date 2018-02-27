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
@JsonRootName("lstsupplytype")
public class Lstsupplytypedto implements Dto {
   
    
    private static final long serialVersionUID = 1L;
    
    private Integer subpplytypeid;
   
    private String description;
    
    private Date dateCreated;
    
    private Short active;
    
    private Supplierdto supplyid;
   
    private Lstmaindto lstmainid;

    public Lstsupplytypedto() {
    }

    public Lstsupplytypedto(Integer subpplytypeid) {
        this.subpplytypeid = subpplytypeid;
    }

    public Lstsupplytypedto(Integer subpplytypeid, Date dateCreated) {
        this.subpplytypeid = subpplytypeid;
        this.dateCreated = dateCreated;
    }

    public Integer getSubpplytypeid() {
        return subpplytypeid;
    }

    public void setSubpplytypeid(Integer subpplytypeid) {
        this.subpplytypeid = subpplytypeid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Supplierdto getSupplyid() {
        return supplyid;
    }

    public void setSupplyid(Supplierdto supplyid) {
        this.supplyid = supplyid;
    }

    public Lstmaindto getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmaindto lstmainid) {
        this.lstmainid = lstmainid;
    }


     
    
}
