/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;
import java.util.List;

@JsonRootName("lstcategoryleveltype")
public class Lstcategoryleveltypedto implements Dto {
    private Integer categoryleveltypeid;
     
    private String categoryleveltype;
    
    private Date datecreated;
      
    private Short active;
      
    private List<Lstsubcategorytreedto> lstsubcategorytreeList;
      
      
    private Lstmaindto lstmainid;

    public Lstcategoryleveltypedto() {
    }

    public Lstcategoryleveltypedto(Integer categoryleveltypeid) {
        this.categoryleveltypeid = categoryleveltypeid;
    }

    public Lstcategoryleveltypedto(Integer categoryleveltypeid, Date datecreated) {
        this.categoryleveltypeid = categoryleveltypeid;
        this.datecreated = datecreated;
    }

    public Integer getCategoryleveltypeid() {
        return categoryleveltypeid;
    }

    public void setCategoryleveltypeid(Integer categoryleveltypeid) {
        this.categoryleveltypeid = categoryleveltypeid;
    }

    public String getCategoryleveltype() {
        return categoryleveltype;
    }

    public void setCategoryleveltype(String categoryleveltype) {
        this.categoryleveltype = categoryleveltype;
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

      
    public List<Lstsubcategorytreedto> getLstsubcategorytreeList() {
        return lstsubcategorytreeList;
    }

    public void setLstsubcategorytreeList(List<Lstsubcategorytreedto> lstsubcategorytreeList) {
        this.lstsubcategorytreeList = lstsubcategorytreeList;
    }

    public Lstmaindto getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmaindto lstmainid) {
        this.lstmainid = lstmainid;
    }
    
}
