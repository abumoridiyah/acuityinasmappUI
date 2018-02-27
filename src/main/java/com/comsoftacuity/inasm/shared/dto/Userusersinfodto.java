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
  
@JsonRootName("userusersinfo") 
public class Userusersinfodto implements Dto {
   
    
    private Integer userid;
    
    private String institutioncode;
    
    private String username;
    
    private String password;
    
    private String firstname;
     
    private String middlename;
    
    private String lastname;
   
    private String contactmobile;
    
    private String contactemail;
   
    private Date datecreated;
      
    private Integer enteredbyid;
      
    private Short active;
      
    private List<Userassignedusergroupdto> userassignedusergroupList;

    public Userusersinfodto() {
    }

    public Userusersinfodto(Integer userid) {
        this.userid = userid;
    }

    public Userusersinfodto(Integer userid, Date datecreated) {
        this.userid = userid;
        this.datecreated = datecreated;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getInstitutioncode() {
        return institutioncode;
    }

    public void setInstitutioncode(String institutioncode) {
        this.institutioncode = institutioncode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactmobile() {
        return contactmobile;
    }

    public void setContactmobile(String contactmobile) {
        this.contactmobile = contactmobile;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
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

      
    public List<Userassignedusergroupdto> getUserassignedusergroupList() {
        return userassignedusergroupList;
    }

    public void setUserassignedusergroupList(List<Userassignedusergroupdto> userassignedusergroupList) {
        this.userassignedusergroupList = userassignedusergroupList;
    }

  
    
}
