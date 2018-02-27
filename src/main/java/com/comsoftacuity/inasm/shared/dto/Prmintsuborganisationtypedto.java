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
@JsonRootName("prmintsuborganisationtype") 
public class Prmintsuborganisationtypedto implements Dto {
   
    private Integer suborgtypeid;
      
    private String suborganisationtype;
    
    private Date datecreated;
      
    private Short active;
      
    private List<Prmintsuborganisationdto> prmintsuborganisationList;
      
      
    private Prmintinstitutiondto institutionid;

    public Prmintsuborganisationtypedto() {
    }

    public Prmintsuborganisationtypedto(Integer suborgtypeid) {
        this.suborgtypeid = suborgtypeid;
    }

    public Prmintsuborganisationtypedto(Integer suborgtypeid, Date datecreated) {
        this.suborgtypeid = suborgtypeid;
        this.datecreated = datecreated;
    }

    public Integer getSuborgtypeid() {
        return suborgtypeid;
    }

    public void setSuborgtypeid(Integer suborgtypeid) {
        this.suborgtypeid = suborgtypeid;
    }

    public String getSuborganisationtype() {
        return suborganisationtype;
    }

    public void setSuborganisationtype(String suborganisationtype) {
        this.suborganisationtype = suborganisationtype;
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

      
    public List<Prmintsuborganisationdto> getPrmintsuborganisationList() {
        return prmintsuborganisationList;
    }

    public void setPrmintsuborganisationList(List<Prmintsuborganisationdto> prmintsuborganisationList) {
        this.prmintsuborganisationList = prmintsuborganisationList;
    }

    public Prmintinstitutiondto getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitutiondto institutionid) {
        this.institutionid = institutionid;
    }
    
}
