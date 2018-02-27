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
@JsonRootName("transtockout")
public class Transtockoutdto implements Dto {
    
   
    private Integer stockoutid;
      
    private Integer itemid;
      
    private Integer recipientId;
    
    private String recipientName;
    
    private String documentNo;
      
    private Integer fromstockinId;
     
    private String recipienttype;
    
    private Date dateout;
      
    private Boolean returned;
     
    private Date returneddate;
   
    private BigDecimal qtyout;
      
    private BigDecimal qtyrqst;
      
    private Integer frmstoreid;
      
      
    private String approvedby;
   
    private Date datecreated;
      
    private Integer enteredbyid;
      
    private Short active;
      
      
    private Lststockouttypedto stockouttypeid;
      
      
    private Tranlogsdto tranlogid;

    public Transtockoutdto() {
    }

    public Transtockoutdto(Integer stockoutid) {
        this.stockoutid = stockoutid;
    }

    public Transtockoutdto(Integer stockoutid, Date datecreated) {
        this.stockoutid = stockoutid;
        this.datecreated = datecreated;
    }

    public Integer getStockoutid() {
        return stockoutid;
    }

    public void setStockoutid(Integer stockoutid) {
        this.stockoutid = stockoutid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public Integer getFromstockinId() {
        return fromstockinId;
    }

    public void setFromstockinId(Integer fromstockinId) {
        this.fromstockinId = fromstockinId;
    }

    public String getRecipienttype() {
        return recipienttype;
    }

    public void setRecipienttype(String recipienttype) {
        this.recipienttype = recipienttype;
    }

    public Date getDateout() {
        return dateout;
    }

    public void setDateout(Date dateout) {
        this.dateout = dateout;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    public Date getReturneddate() {
        return returneddate;
    }

    public void setReturneddate(Date returneddate) {
        this.returneddate = returneddate;
    }

    public BigDecimal getQtyout() {
        return qtyout;
    }

    public void setQtyout(BigDecimal qtyout) {
        this.qtyout = qtyout;
    }

    public BigDecimal getQtyrqst() {
        return qtyrqst;
    }

    public void setQtyrqst(BigDecimal qtyrqst) {
        this.qtyrqst = qtyrqst;
    }

    public Integer getFrmstoreid() {
        return frmstoreid;
    }

    public void setFrmstoreid(Integer frmstoreid) {
        this.frmstoreid = frmstoreid;
    }

    public String getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Integer getEnteredbyid() {
        return enteredbyid;
    }

    public void setEnteredbyid(Integer enteredbyid) {
        this.enteredbyid = enteredbyid;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Lststockouttypedto getStockouttypeid() {
        return stockouttypeid;
    }

    public void setStockouttypeid(Lststockouttypedto stockouttypeid) {
        this.stockouttypeid = stockouttypeid;
    }

    public Tranlogsdto getTranlogid() {
        return tranlogid;
    }

    public void setTranlogid(Tranlogsdto tranlogid) {
        this.tranlogid = tranlogid;
    }
    
}
