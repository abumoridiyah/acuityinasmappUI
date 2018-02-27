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
@JsonRootName("regitems")
public class Regitemsdto implements Dto {
   
   
    private Integer itemid;
    
    private String itemcode;
    
    private String itemname;
    
    private String aliasname;
      
    private Integer measureunitid;
      
    private Integer measurepackid;
     
    private String barcode;
    
    private String rfidnumber;
    
    private String usemeasure;
    
    private Date datecreated;
      
    private Integer enteredbid;
      
    private Short active;
      
    private List<Tranlogsdto> tranlogsList;
      
    private List<Trandepreciationdto> trandepreciationList;
      
      
    private Lstsubcategorytreedto subcategorytid;
      
      
    private Prmintinstitutiondto institutionid;

    public Regitemsdto() {
    }

    public Regitemsdto(Integer itemid) {
        this.itemid = itemid;
    }

    public Regitemsdto(Integer itemid, String itemcode, Date datecreated) {
        this.itemid = itemid;
        this.itemcode = itemcode;
        this.datecreated = datecreated;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getAliasname() {
        return aliasname;
    }

    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
    }

    public Integer getMeasureunitid() {
        return measureunitid;
    }

    public void setMeasureunitid(Integer measureunitid) {
        this.measureunitid = measureunitid;
    }

    public Integer getMeasurepackid() {
        return measurepackid;
    }

    public void setMeasurepackid(Integer measurepackid) {
        this.measurepackid = measurepackid;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getRfidnumber() {
        return rfidnumber;
    }

    public void setRfidnumber(String rfidnumber) {
        this.rfidnumber = rfidnumber;
    }

    public String getUsemeasure() {
        return usemeasure;
    }

    public void setUsemeasure(String usemeasure) {
        this.usemeasure = usemeasure;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Integer getEnteredbid() {
        return enteredbid;
    }

    public void setEnteredbid(Integer enteredbid) {
        this.enteredbid = enteredbid;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

      
    public List<Tranlogsdto> getTranlogsList() {
        return tranlogsList;
    }

    public void setTranlogsList(List<Tranlogsdto> tranlogsList) {
        this.tranlogsList = tranlogsList;
    }

      
    public List<Trandepreciationdto> getTrandepreciationList() {
        return trandepreciationList;
    }

    public void setTrandepreciationList(List<Trandepreciationdto> trandepreciationList) {
        this.trandepreciationList = trandepreciationList;
    }

    public Lstsubcategorytreedto getSubcategorytid() {
        return subcategorytid;
    }

    public void setSubcategorytid(Lstsubcategorytreedto subcategorytid) {
        this.subcategorytid = subcategorytid;
    }

    public Prmintinstitutiondto getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitutiondto institutionid) {
        this.institutionid = institutionid;
    }
    
}
