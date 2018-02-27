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

@JsonRootName("lststockleveltype")      
public class Lststockleveltypedto implements Dto {
    
    private Integer storetypeid;
    
    private String description;
    
    private Date datecreated;
      
    private Short active;
      
    private List<Lststoresdto> lststoresList;
      
      
    private Lstmaindto lstmainid;

    public Lststockleveltypedto() {
    }

    public Lststockleveltypedto(Integer storetypeid) {
        this.storetypeid = storetypeid;
    }

    public Lststockleveltypedto(Integer storetypeid, Date datecreated) {
        this.storetypeid = storetypeid;
        this.datecreated = datecreated;
    }

    public Integer getStoretypeid() {
        return storetypeid;
    }

    public void setStoretypeid(Integer storetypeid) {
        this.storetypeid = storetypeid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

      
    public List<Lststoresdto> getLststoresList() {
        return lststoresList;
    }

    public void setLststoresList(List<Lststoresdto> lststoresList) {
        this.lststoresList = lststoresList;
    }

    public Lstmaindto getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmaindto lstmainid) {
        this.lstmainid = lstmainid;
    }

    
}
