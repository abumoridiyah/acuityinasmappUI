/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;
import java.util.List;

@JsonRootName("appmodules")
public class Appmodulesdto implements Dto {
 
    private Integer moduleid;
    
    private String moduletype;
    
    private String statuscode;
    
    private Date datecreated;
      
    private Integer enteredbyid;
      
    private Short active;
      
    private List<Appapprulesdto> appapprulesList;
      
    private List<Userpermissiondto> userpermissionList;
      
      
    private Prmintinstitutiondto institutionid;

    public Appmodulesdto() {
    }

    public Appmodulesdto(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public Appmodulesdto(Integer moduleid, Date datecreated) {
        this.moduleid = moduleid;
        this.datecreated = datecreated;
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public String getModuletype() {
        return moduletype;
    }

    public void setModuletype(String moduletype) {
        this.moduletype = moduletype;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
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

      
    public List<Appapprulesdto> getAppapprulesList() {
        return appapprulesList;
    }

    public void setAppapprulesList(List<Appapprulesdto> appapprulesList) {
        this.appapprulesList = appapprulesList;
    }

      
    public List<Userpermissiondto> getUserpermissionList() {
        return userpermissionList;
    }

    public void setUserpermissionList(List<Userpermissiondto> userpermissionList) {
        this.userpermissionList = userpermissionList;
    }

    public Prmintinstitutiondto getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitutiondto institutionid) {
        this.institutionid = institutionid;
    }

       
}
