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
@JsonRootName("transtocktaking")
public class Transtocktakingdto implements Dto {
   
   
    private Integer stktakenid;
      
    private Integer itemid;
      
    private Integer storeId;
   
    private Date dateoftran;
   
    private BigDecimal computerqty;
      
    private BigDecimal physicalcount;
      
    private BigDecimal difference;
      
      
    private String remarks;
      
      
      
      
    private Date datecreated;
      
    private Short active;
      
      
    private Tranlogsdto tranlogid;

    public Transtocktakingdto() {
    }

    public Transtocktakingdto(Integer stktakenid) {
        this.stktakenid = stktakenid;
    }

    public Transtocktakingdto(Integer stktakenid, Date datecreated) {
        this.stktakenid = stktakenid;
        this.datecreated = datecreated;
    }

    public Integer getStktakenid() {
        return stktakenid;
    }

    public void setStktakenid(Integer stktakenid) {
        this.stktakenid = stktakenid;
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

    public Date getDateoftran() {
        return dateoftran;
    }

    public void setDateoftran(Date dateoftran) {
        this.dateoftran = dateoftran;
    }

    public BigDecimal getComputerqty() {
        return computerqty;
    }

    public void setComputerqty(BigDecimal computerqty) {
        this.computerqty = computerqty;
    }

    public BigDecimal getPhysicalcount() {
        return physicalcount;
    }

    public void setPhysicalcount(BigDecimal physicalcount) {
        this.physicalcount = physicalcount;
    }

    public BigDecimal getDifference() {
        return difference;
    }

    public void setDifference(BigDecimal difference) {
        this.difference = difference;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
