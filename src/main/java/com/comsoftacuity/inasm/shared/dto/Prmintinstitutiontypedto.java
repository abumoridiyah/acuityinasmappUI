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
@JsonRootName("prmintinstitutiontype") 
public class Prmintinstitutiontypedto implements Dto {
   
    
    private Integer institutiontypeid;
    
    private String description;
    
    private Date datcreated;
      
    private Short active;
      
    private List<Prmintinstitutiondto> prmintinstitutionList;

    public Prmintinstitutiontypedto() {
    }

    public Prmintinstitutiontypedto(Integer institutiontypeid) {
        this.institutiontypeid = institutiontypeid;
    }

    public Prmintinstitutiontypedto(Integer institutiontypeid, Date datcreated) {
        this.institutiontypeid = institutiontypeid;
        this.datcreated = datcreated;
    }

    public Integer getInstitutiontypeid() {
        return institutiontypeid;
    }

    public void setInstitutiontypeid(Integer institutiontypeid) {
        this.institutiontypeid = institutiontypeid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatcreated() {
        return datcreated;
    }

    public void setDatcreated(Date datcreated) {
        this.datcreated = datcreated;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

      
    public List<Prmintinstitutiondto> getPrmintinstitutionList() {
        return prmintinstitutionList;
    }

    public void setPrmintinstitutionList(List<Prmintinstitutiondto> prmintinstitutionList) {
        this.prmintinstitutionList = prmintinstitutionList;
    }
    
}
