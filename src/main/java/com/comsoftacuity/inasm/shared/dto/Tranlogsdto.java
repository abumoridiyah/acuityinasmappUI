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
@JsonRootName("tranlogs")   
public class Tranlogsdto implements Dto {
   
   
    private Integer tranlogid;
      
    private Integer qtyin;
      
    private Integer qtyout;
      
    private Integer enteredbyid;
    
    private Date datecreated;
      
    private Integer active;
      
    private List<Transtockleveldto> transtocklevelList;
      
    private List<Trantransfersdto> trantransfersList;
      
    private List<Transtockindto> transtockinList;
      
    private List<Transtocktakingdto> transtocktakingList;
      
    private List<Transtockoutdto> transtockoutList;
      
      
    private Lststoresdto storeid;
      
      
    private Prmintinstitutiondto institutionid;
      
      
    private Regitemsdto itemid;
      
      
    private Tranmaindto tranmainid;
      
    private List<Trandisposaldto> trandisposalList;

    public Tranlogsdto() {
    }

    public Tranlogsdto(Integer tranlogid) {
        this.tranlogid = tranlogid;
    }

    public Integer getTranlogid() {
        return tranlogid;
    }

    public void setTranlogid(Integer tranlogid) {
        this.tranlogid = tranlogid;
    }

    public Integer getQtyin() {
        return qtyin;
    }

    public void setQtyin(Integer qtyin) {
        this.qtyin = qtyin;
    }

    public Integer getQtyout() {
        return qtyout;
    }

    public void setQtyout(Integer qtyout) {
        this.qtyout = qtyout;
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

      
    public List<Transtockleveldto> getTranstocklevelList() {
        return transtocklevelList;
    }

    public void setTranstocklevelList(List<Transtockleveldto> transtocklevelList) {
        this.transtocklevelList = transtocklevelList;
    }

      
    public List<Trantransfersdto> getTrantransfersList() {
        return trantransfersList;
    }

    public void setTrantransfersList(List<Trantransfersdto> trantransfersList) {
        this.trantransfersList = trantransfersList;
    }

      
    public List<Transtockindto> getTranstockinList() {
        return transtockinList;
    }

    public void setTranstockinList(List<Transtockindto> transtockinList) {
        this.transtockinList = transtockinList;
    }

      
    public List<Transtocktakingdto> getTranstocktakingList() {
        return transtocktakingList;
    }

    public void setTranstocktakingList(List<Transtocktakingdto> transtocktakingList) {
        this.transtocktakingList = transtocktakingList;
    }

      
    public List<Transtockoutdto> getTranstockoutList() {
        return transtockoutList;
    }

    public void setTranstockoutList(List<Transtockoutdto> transtockoutList) {
        this.transtockoutList = transtockoutList;
    }

    public Lststoresdto getStoreid() {
        return storeid;
    }

    public void setStoreid(Lststoresdto storeid) {
        this.storeid = storeid;
    }

    public Prmintinstitutiondto getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitutiondto institutionid) {
        this.institutionid = institutionid;
    }

    public Regitemsdto getItemid() {
        return itemid;
    }

    public void setItemid(Regitemsdto itemid) {
        this.itemid = itemid;
    }

    public Tranmaindto getTranmainid() {
        return tranmainid;
    }

    public void setTranmainid(Tranmaindto tranmainid) {
        this.tranmainid = tranmainid;
    }

      
    public List<Trandisposaldto> getTrandisposalList() {
        return trandisposalList;
    }

    public void setTrandisposalList(List<Trandisposaldto> trandisposalList) {
        this.trandisposalList = trandisposalList;
    }

}
