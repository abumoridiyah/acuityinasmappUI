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
@JsonRootName("lststockoutreceipttype") 
public class Lststockoutreceipttypedto implements Dto {
    
   
    private Integer stockrecipttypeid;
    
    private String description;
    
    private Date datecreated;
      
    private Short active;
    
    private Lstmaindto lstmainid;

    public Lststockoutreceipttypedto() {
    }

    public Lststockoutreceipttypedto(Integer stockrecipttypeid) {
        this.stockrecipttypeid = stockrecipttypeid;
    }

    public Lststockoutreceipttypedto(Integer stockrecipttypeid, Date datecreated) {
        this.stockrecipttypeid = stockrecipttypeid;
        this.datecreated = datecreated;
    }

    public Integer getStockrecipttypeid() {
        return stockrecipttypeid;
    }

    public void setStockrecipttypeid(Integer stockrecipttypeid) {
        this.stockrecipttypeid = stockrecipttypeid;
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

    public Lstmaindto getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmaindto lstmainid) {
        this.lstmainid = lstmainid;
    }

}
