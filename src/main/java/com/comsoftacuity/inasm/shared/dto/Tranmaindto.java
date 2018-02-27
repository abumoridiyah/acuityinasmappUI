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
@JsonRootName("tranmain") 
public class Tranmaindto implements Dto {
    
    private Integer id;
     
    private String tranreference;
      
    private Integer storeid;
      
    private Integer createduserid;
      
    private Integer recievedbyId;
      
    private Integer supplierId;
    
    private String suppliername;
     
    private String stocktakingby;
    
    private String carriedby;
     
    private String approvedby;
     
    private Date trandate;
    
    private String trantype;
      
    private List<Tranlogsdto> tranlogsList;

    public Tranmaindto() {
    }

    public Tranmaindto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTranreference() {
        return tranreference;
    }

    public void setTranreference(String tranreference) {
        this.tranreference = tranreference;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Integer getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(Integer createduserid) {
        this.createduserid = createduserid;
    }

    public Integer getRecievedbyId() {
        return recievedbyId;
    }

    public void setRecievedbyId(Integer recievedbyId) {
        this.recievedbyId = recievedbyId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getStocktakingby() {
        return stocktakingby;
    }

    public void setStocktakingby(String stocktakingby) {
        this.stocktakingby = stocktakingby;
    }

    public String getCarriedby() {
        return carriedby;
    }

    public void setCarriedby(String carriedby) {
        this.carriedby = carriedby;
    }

    public String getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }

    public Date getTrandate() {
        return trandate;
    }

    public void setTrandate(Date trandate) {
        this.trandate = trandate;
    }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype;
    }

      
    public List<Tranlogsdto> getTranlogsList() {
        return tranlogsList;
    }

    public void setTranlogsList(List<Tranlogsdto> tranlogsList) {
        this.tranlogsList = tranlogsList;
    }
    
}
