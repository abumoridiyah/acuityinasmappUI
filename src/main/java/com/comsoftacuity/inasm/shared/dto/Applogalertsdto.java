/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;

@JsonRootName("applogalerts")
public class Applogalertsdto implements Dto {
   
    private Integer logalerid;
      
    private Integer staffid;
    
    private String mobileno;
   
    private String email;
      
    private Integer logtypeId;
    
    private Date datecreated;
      
    private Short enteredbyid;
      
    private Short active;
      
      
    private Prmintinstitutiondto institutionid;

    public Applogalertsdto() {
    }

    public Applogalertsdto(Integer logalerid) {
        this.logalerid = logalerid;
    }

    public Applogalertsdto(Integer logalerid, Date datecreated) {
        this.logalerid = logalerid;
        this.datecreated = datecreated;
    }

    public Integer getLogalerid() {
        return logalerid;
    }

    public void setLogalerid(Integer logalerid) {
        this.logalerid = logalerid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLogtypeId() {
        return logtypeId;
    }

    public void setLogtypeId(Integer logtypeId) {
        this.logtypeId = logtypeId;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Short getEnteredbyid() {
        return enteredbyid;
    }

    public void setEnteredbyid(Short enteredbyid) {
        this.enteredbyid = enteredbyid;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Prmintinstitutiondto getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Prmintinstitutiondto institutionid) {
        this.institutionid = institutionid;
    }

}
