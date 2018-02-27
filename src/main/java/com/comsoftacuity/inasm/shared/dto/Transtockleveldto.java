/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.math.BigDecimal;
import java.util.Date;
@JsonRootName("transtocklevel")
public class Transtockleveldto implements Dto {
  
    
    private Integer stockid;
      
    private Integer itemid;
      
    private Integer storeId;
   
    private BigDecimal qtylevel;
    
    private Date datecreated;
      
    private Integer enteredbyId;
     
    private Tranlogsdto tranlogid;

    public Transtockleveldto() {
    }

    public Transtockleveldto(Integer stockid) {
        this.stockid = stockid;
    }

    public Transtockleveldto(Integer stockid, Date datecreated) {
        this.stockid = stockid;
        this.datecreated = datecreated;
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public BigDecimal getQtylevel() {
        return qtylevel;
    }

    public void setQtylevel(BigDecimal qtylevel) {
        this.qtylevel = qtylevel;
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

    public Tranlogsdto getTranlogid() {
        return tranlogid;
    }

    public void setTranlogid(Tranlogsdto tranlogid) {
        this.tranlogid = tranlogid;
    }
    
}
