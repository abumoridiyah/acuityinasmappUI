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
@JsonRootName("lstsubcategorytree")   
public class Lstsubcategorytreedto implements Dto {
    
    
    private Integer subcategorytid;
      
    private Integer parentId;
    
    private String description;
    
    private Date datecreated;
      
    private Short active;
   
    private Lstcategoryleveltypedto categoryleveltypeid;
     
    private Lstmaindto lstmainid;
      
    private List<Regitemsdto> regitemsList;
      
    private List<Regdepreciationbycategorydto> regdepreciationbycategoryList;

    public Lstsubcategorytreedto() {
    }

    public Lstsubcategorytreedto(Integer subcategorytid) {
        this.subcategorytid = subcategorytid;
    }

    public Lstsubcategorytreedto(Integer subcategorytid, Date datecreated) {
        this.subcategorytid = subcategorytid;
        this.datecreated = datecreated;
    }

    public Integer getSubcategorytid() {
        return subcategorytid;
    }

    public void setSubcategorytid(Integer subcategorytid) {
        this.subcategorytid = subcategorytid;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Lstcategoryleveltypedto getCategoryleveltypeid() {
        return categoryleveltypeid;
    }

    public void setCategoryleveltypeid(Lstcategoryleveltypedto categoryleveltypeid) {
        this.categoryleveltypeid = categoryleveltypeid;
    }

    public Lstmaindto getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmaindto lstmainid) {
        this.lstmainid = lstmainid;
    }

      
    public List<Regitemsdto> getRegitemsList() {
        return regitemsList;
    }

    public void setRegitemsList(List<Regitemsdto> regitemsList) {
        this.regitemsList = regitemsList;
    }

      
    public List<Regdepreciationbycategorydto> getRegdepreciationbycategoryList() {
        return regdepreciationbycategoryList;
    }

    public void setRegdepreciationbycategoryList(List<Regdepreciationbycategorydto> regdepreciationbycategoryList) {
        this.regdepreciationbycategoryList = regdepreciationbycategoryList;
    }

    
}
