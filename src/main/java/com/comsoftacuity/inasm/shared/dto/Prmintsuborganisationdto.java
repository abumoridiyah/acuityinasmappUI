/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;
@JsonRootName("prmintsuborganisation")  
public class Prmintsuborganisationdto implements Dto {
   
    private Integer suborgid;
     
    private String suborganisationname;
      
    private Integer parentid;
    
    private Date datecreated;
      
    private Short active;
      
      
    private Prmintsuborganisationtypedto suborganisationtypeid;

    public Prmintsuborganisationdto() {
    }

    public Prmintsuborganisationdto(Integer suborgid) {
        this.suborgid = suborgid;
    }

    public Prmintsuborganisationdto(Integer suborgid, Date datecreated) {
        this.suborgid = suborgid;
        this.datecreated = datecreated;
    }

    public Integer getSuborgid() {
        return suborgid;
    }

    public void setSuborgid(Integer suborgid) {
        this.suborgid = suborgid;
    }

    public String getSuborganisationname() {
        return suborganisationname;
    }

    public void setSuborganisationname(String suborganisationname) {
        this.suborganisationname = suborganisationname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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

    public Prmintsuborganisationtypedto getSuborganisationtypeid() {
        return suborganisationtypeid;
    }

    public void setSuborganisationtypeid(Prmintsuborganisationtypedto suborganisationtypeid) {
        this.suborganisationtypeid = suborganisationtypeid;
    }

   
}
