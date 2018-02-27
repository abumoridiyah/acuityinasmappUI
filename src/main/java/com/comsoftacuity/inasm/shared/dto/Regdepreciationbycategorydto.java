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
@JsonRootName("regdepreciationbycategory")
public class Regdepreciationbycategorydto implements Dto {
   
    private Integer depreciationid;
   
    private BigDecimal depreciationvalue;
     
    private String depreciationPeriod;
    
    private Date datecreated;
      
    private Short active;
      
      
    private Lstsubcategorytreedto subcategoryId;

    public Regdepreciationbycategorydto() {
    }

    public Regdepreciationbycategorydto(Integer depreciationid) {
        this.depreciationid = depreciationid;
    }

    public Regdepreciationbycategorydto(Integer depreciationid, Date datecreated) {
        this.depreciationid = depreciationid;
        this.datecreated = datecreated;
    }

    public Integer getDepreciationid() {
        return depreciationid;
    }

    public void setDepreciationid(Integer depreciationid) {
        this.depreciationid = depreciationid;
    }

    public BigDecimal getDepreciationvalue() {
        return depreciationvalue;
    }

    public void setDepreciationvalue(BigDecimal depreciationvalue) {
        this.depreciationvalue = depreciationvalue;
    }

    public String getDepreciationPeriod() {
        return depreciationPeriod;
    }

    public void setDepreciationPeriod(String depreciationPeriod) {
        this.depreciationPeriod = depreciationPeriod;
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

    public Lstsubcategorytreedto getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Lstsubcategorytreedto subcategoryId) {
        this.subcategoryId = subcategoryId;
    }
    
}
