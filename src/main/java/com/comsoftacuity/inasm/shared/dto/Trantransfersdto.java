/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 *   
 */
@JsonRootName("trantransfers")
public class Trantransfersdto implements Dto {
   
   
    private Integer id;
      
    private Integer itemid;
      
    private Integer fromstoreid;
      
    private Integer tostoreId;
    
    private BigDecimal qtysent;
      
    private BigDecimal qtyrecieved;
      
      
    private String batchno;
      
      
    private String transferstatus;
      
      
    private String remarks;
      
    private Integer enteredbyid;
      
      
      
      
    private Date datecreated;
      
    private Integer active;
      
      
    private Tranlogsdto tranlogid;

    public Trantransfersdto() {
    }

    public Trantransfersdto(Integer id) {
        this.id = id;
    }

    public Trantransfersdto(Integer id, Date datecreated) {
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

    public Integer getFromstoreid() {
        return fromstoreid;
    }

    public void setFromstoreid(Integer fromstoreid) {
        this.fromstoreid = fromstoreid;
    }

    public Integer getTostoreId() {
        return tostoreId;
    }

    public void setTostoreId(Integer tostoreId) {
        this.tostoreId = tostoreId;
    }

    public BigDecimal getQtysent() {
        return qtysent;
    }

    public void setQtysent(BigDecimal qtysent) {
        this.qtysent = qtysent;
    }

    public BigDecimal getQtyrecieved() {
        return qtyrecieved;
    }

    public void setQtyrecieved(BigDecimal qtyrecieved) {
        this.qtyrecieved = qtyrecieved;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public String getTransferstatus() {
        return transferstatus;
    }

    public void setTransferstatus(String transferstatus) {
        this.transferstatus = transferstatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getEnteredbyid() {
        return enteredbyid;
    }

    public void setEnteredbyid(Integer enteredbyid) {
        this.enteredbyid = enteredbyid;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Tranlogsdto getTranlogid() {
        return tranlogid;
    }

    public void setTranlogid(Tranlogsdto tranlogid) {
        this.tranlogid = tranlogid;
    }

    
}
