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
@JsonRootName("trandisposal")
public class Trandisposaldto implements Dto {
   
    private Integer id;
    
    private Integer itemid;
    
    private Date dateoftran;
    
    private String batchno;
   
    private BigDecimal qtydisposed;
    
    private String statusatdisposal;
      
    private Integer disposaltypeId;
      
      
    private String disposalstatus;
      
    private Integer enteredbyId;
    
    private Date datecreated;
      
    private Short active;
      
      
    private Tranlogsdto tranlogid;

    public Trandisposaldto() {
    }

    public Trandisposaldto(Integer id) {
        this.id = id;
    }

    public Trandisposaldto(Integer id, Date datecreated) {
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

    public Date getDateoftran() {
        return dateoftran;
    }

    public void setDateoftran(Date dateoftran) {
        this.dateoftran = dateoftran;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public BigDecimal getQtydisposed() {
        return qtydisposed;
    }

    public void setQtydisposed(BigDecimal qtydisposed) {
        this.qtydisposed = qtydisposed;
    }

    public String getStatusatdisposal() {
        return statusatdisposal;
    }

    public void setStatusatdisposal(String statusatdisposal) {
        this.statusatdisposal = statusatdisposal;
    }

    public Integer getDisposaltypeId() {
        return disposaltypeId;
    }

    public void setDisposaltypeId(Integer disposaltypeId) {
        this.disposaltypeId = disposaltypeId;
    }

    public String getDisposalstatus() {
        return disposalstatus;
    }

    public void setDisposalstatus(String disposalstatus) {
        this.disposalstatus = disposalstatus;
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

    public Tranlogsdto getTranlogid() {
        return tranlogid;
    }

    public void setTranlogid(Tranlogsdto tranlogid) {
        this.tranlogid = tranlogid;
    }
    
}
