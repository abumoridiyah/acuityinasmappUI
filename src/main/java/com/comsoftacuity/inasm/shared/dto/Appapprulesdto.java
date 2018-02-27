/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;

@JsonRootName("appaprules")      
public class Appapprulesdto implements  Dto {
   
  
    private Integer appruleid;
    
    private String institutioncode;
    
    private String rule;
      
    private Boolean status;
    
    private Date datecreated;
      
    private Integer enteredbyid;
      
    private Short active;
      
      
    private Appmodulesdto moduleId;

    public Appapprulesdto() {
    }

    public Appapprulesdto(Integer appruleid) {
        this.appruleid = appruleid;
    }

    public Appapprulesdto(Integer appruleid, Date datecreated) {
        this.appruleid = appruleid;
        this.datecreated = datecreated;
    }

    public Integer getAppruleid() {
        return appruleid;
    }

    public void setAppruleid(Integer appruleid) {
        this.appruleid = appruleid;
    }

    public String getInstitutioncode() {
        return institutioncode;
    }

    public void setInstitutioncode(String institutioncode) {
        this.institutioncode = institutioncode;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public Appmodulesdto getModuleId() {
        return moduleId;
    }

    public void setModuleId(Appmodulesdto moduleId) {
        this.moduleId = moduleId;
    }
     
}
