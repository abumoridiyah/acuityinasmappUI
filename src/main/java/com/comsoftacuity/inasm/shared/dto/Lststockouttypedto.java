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
@JsonRootName("lststockouttype")   
public class Lststockouttypedto implements Dto {
   
   
    private Integer stockouttypeid;
    
    private String description;
    
    private Date datecreated;
      
    private Short active;
      
      
    private Lstmaindto lstmainid;
      
    private List<Transtockoutdto> transtockoutList;

    public Lststockouttypedto() {
    }

    public Lststockouttypedto(Integer stockouttypeid) {
        this.stockouttypeid = stockouttypeid;
    }

    public Lststockouttypedto(Integer stockouttypeid, Date datecreated) {
        this.stockouttypeid = stockouttypeid;
        this.datecreated = datecreated;
    }

    public Integer getStockouttypeid() {
        return stockouttypeid;
    }

    public void setStockouttypeid(Integer stockouttypeid) {
        this.stockouttypeid = stockouttypeid;
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

      
    public List<Transtockoutdto> getTranstockoutList() {
        return transtockoutList;
    }

    public void setTranstockoutList(List<Transtockoutdto> transtockoutList) {
        this.transtockoutList = transtockoutList;
    }

      
    
}
