/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.math.BigDecimal;
import java.util.Date;
@JsonRootName("transtockin")
public class Transtockindto implements Dto {
   
    private Integer id;
      
    private Integer itemid;
     
    private String supplyreferenceno;
    
    private BigDecimal qtysupplied;
      
    private BigDecimal qtyremaining;
     
    private Date datesupplied;
     
    private String batchno;
      
    private Boolean canexpire;
    
    private Date expirationdate;
      
    private Integer stockintypeId;
      
    private Integer enteredbyId;
      
      
      
      
    private Date datecreated;
      
    private Short active;
      
      
    private Lstsupplytypedto supplytypeid;
      
      
    private Tranlogsdto tranlogid;

    public Transtockindto() {
    }

    public Transtockindto(Integer id) {
        this.id = id;
    }

    public Transtockindto(Integer id, Date datecreated) {
        this.id = id;
        this.datecreated = datecreated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getSupplyreferenceno() {
        return supplyreferenceno;
    }

    public void setSupplyreferenceno(String supplyreferenceno) {
        this.supplyreferenceno = supplyreferenceno;
    }

    public BigDecimal getQtysupplied() {
        return qtysupplied;
    }

    public void setQtysupplied(BigDecimal qtysupplied) {
        this.qtysupplied = qtysupplied;
    }

    public BigDecimal getQtyremaining() {
        return qtyremaining;
    }

    public void setQtyremaining(BigDecimal qtyremaining) {
        this.qtyremaining = qtyremaining;
    }

    public Date getDatesupplied() {
        return datesupplied;
    }

    public void setDatesupplied(Date datesupplied) {
        this.datesupplied = datesupplied;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public Boolean getCanexpire() {
        return canexpire;
    }

    public void setCanexpire(Boolean canexpire) {
        this.canexpire = canexpire;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public Integer getStockintypeId() {
        return stockintypeId;
    }

    public void setStockintypeId(Integer stockintypeId) {
        this.stockintypeId = stockintypeId;
    }

    public Integer getEnteredbyId() {
        return enteredbyId;
    }

    public void setEnteredbyId(Integer enteredbyId) {
        this.enteredbyId = enteredbyId;
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

    public Lstsupplytypedto getSupplytypeid() {
        return supplytypeid;
    }

    public void setSupplytypeid(Lstsupplytypedto supplytypeid) {
        this.supplytypeid = supplytypeid;
    }

    public Tranlogsdto getTranlogid() {
        return tranlogid;
    }

    public void setTranlogid(Tranlogsdto tranlogid) {
        this.tranlogid = tranlogid;
    }
    
}
