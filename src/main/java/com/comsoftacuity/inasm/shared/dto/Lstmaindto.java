/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;
import java.util.List;

@JsonRootName("lstmain")
public class Lstmaindto implements Dto {
  
    private Integer lstmainid;
    
    private String description;
     
    private Date datecreated;
      
    private List<Userusergroupdto> userusergroupList;
      
    private List<Lststockouttypedto> lststockouttypeList;
      
    private List<Lstsubcategorytreedto> lstsubcategorytreeList;
      
    private List<Lstmeasureunitdto> lstmeasureunitList;
      
      
    private Prmintinstitutiondto institutionid;
      
    private List<Lststoresdto> lststoresList;
      
    private List<Lstcategoryleveltypedto> lstcategoryleveltypeList;
      
    private List<Lststockleveltypedto> lststockleveltypeList;
      
    private List<Lstmeasurepackdto> lstmeasurepackList;
      
    private List<Lstinventorytypedto> lstinventorytypeList;
      
    private List<Lstsupplytypedto> lstsupplytypeList;
      
    private List<Lststockoutreceipttypedto> lststockoutreceipttypeList;

    public Lstmaindto() {
    }

    public Lstmaindto(Integer lstmainid) {
        this.lstmainid = lstmainid;
    }

    public Integer getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Integer lstmainid) {
        this.lstmainid = lstmainid;
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

      
    public List<Userusergroupdto> getUserusergroupList() {
        return userusergroupList;
    }

    public void setUserusergroupList(List<Userusergroupdto> userusergroupList) {
        this.userusergroupList = userusergroupList;
    }

      
    public List<Lststockouttypedto> getLststockouttypeList() {
        return lststockouttypeList;
    }

    public void setLststockouttypeList(List<Lststockouttypedto> lststockouttypeList) {
        this.lststockouttypeList = lststockouttypeList;
    }

      
    public List<Lstsubcategorytreedto> getLstsubcategorytreeList() {
        return lstsubcategorytreeList;
    }

    public void setLstsubcategorytreeList(List<Lstsubcategorytreedto> lstsubcategorytreeList) {
        this.lstsubcategorytreeList = lstsubcategorytreeList;
    }

      
    public List<Lstmeasureunitdto> getLstmeasureunitList() {
        return lstmeasureunitList;
    }

    public void setLstmeasureunitList(List<Lstmeasureunitdto> lstmeasureunitList) {
        this.lstmeasureunitList = lstmeasureunitList;
    }

    public Prmintinstitutiondto getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitutiondto institutionid) {
        this.institutionid = institutionid;
    }

      
    public List<Lststoresdto> getLststoresList() {
        return lststoresList;
    }

    public void setLststoresList(List<Lststoresdto> lststoresList) {
        this.lststoresList = lststoresList;
    }

      
    public List<Lstcategoryleveltypedto> getLstcategoryleveltypeList() {
        return lstcategoryleveltypeList;
    }

    public void setLstcategoryleveltypeList(List<Lstcategoryleveltypedto> lstcategoryleveltypeList) {
        this.lstcategoryleveltypeList = lstcategoryleveltypeList;
    }

      
    public List<Lststockleveltypedto> getLststockleveltypeList() {
        return lststockleveltypeList;
    }

    public void setLststockleveltypeList(List<Lststockleveltypedto> lststockleveltypeList) {
        this.lststockleveltypeList = lststockleveltypeList;
    }

      
    public List<Lstmeasurepackdto> getLstmeasurepackList() {
        return lstmeasurepackList;
    }

    public void setLstmeasurepackList(List<Lstmeasurepackdto> lstmeasurepackList) {
        this.lstmeasurepackList = lstmeasurepackList;
    }

      
    public List<Lstinventorytypedto> getLstinventorytypeList() {
        return lstinventorytypeList;
    }

    public void setLstinventorytypeList(List<Lstinventorytypedto> lstinventorytypeList) {
        this.lstinventorytypeList = lstinventorytypeList;
    }

      
    public List<Lstsupplytypedto> getLstsupplytypeList() {
        return lstsupplytypeList;
    }

    public void setLstsupplytypeList(List<Lstsupplytypedto> lstsupplytypeList) {
        this.lstsupplytypeList = lstsupplytypeList;
    }

      
    public List<Lststockoutreceipttypedto> getLststockoutreceipttypeList() {
        return lststockoutreceipttypeList;
    }

    public void setLststockoutreceipttypeList(List<Lststockoutreceipttypedto> lststockoutreceipttypeList) {
        this.lststockoutreceipttypeList = lststockoutreceipttypeList;
    }

}
