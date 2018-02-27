/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;
import java.util.List;

/**
 *
 *   
 */
@JsonRootName("lststores") 
public class Lststoresdto implements Dto {
   
   
    private Integer storeid;
      
    private Integer parentId;
    
    private String storelevelname;
    
    private Date datecreated;
      
    private Short active;
    
    private Lstmaindto lstmainid;
      
      
    private Lststockleveltypedto storetypeid;
      
    private List<Tranlogsdto> tranlogsList;

    public Lststoresdto() {
    }

    public Lststoresdto(Integer storeid) {
        this.storeid = storeid;
    }

    public Lststoresdto(Integer storeid, Date datecreated) {
        this.storeid = storeid;
        this.datecreated = datecreated;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getStorelevelname() {
        return storelevelname;
    }

    public void setStorelevelname(String storelevelname) {
        this.storelevelname = storelevelname;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Lstmaindto getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmaindto lstmainid) {
        this.lstmainid = lstmainid;
    }

    public Lststockleveltypedto getStoretypeid() {
        return storetypeid;
    }

    public void setStoretypeid(Lststockleveltypedto storetypeid) {
        this.storetypeid = storetypeid;
    }

      
    public List<Tranlogsdto> getTranlogsList() {
        return tranlogsList;
    }

    public void setTranlogsList(List<Tranlogsdto> tranlogsList) {
        this.tranlogsList = tranlogsList;
    }

     
    
}
