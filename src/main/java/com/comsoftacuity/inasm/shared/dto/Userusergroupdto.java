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
@JsonRootName("userusergroup") 
public class Userusergroupdto implements Dto {
   
   
    private Integer usergrpid;
     
    private String groupname;
    
    private Date datecreated;
      
    private Integer enteredbyid;
      
    private Short active;
     
    private String comment;
     
    private Lstmaindto lstmainid;
      
    private List<Userusergrouppermissiondto> userusergrouppermissionList;
      
    private List<Userassignedusergroupdto> userassignedusergroupList;

    public Userusergroupdto() {
    }

    public Userusergroupdto(Integer usergrpid) {
        this.usergrpid = usergrpid;
    }

    public Userusergroupdto(Integer usergrpid, Date datecreated) {
        this.usergrpid = usergrpid;
        this.datecreated = datecreated;
    }

    public Integer getUsergrpid() {
        return usergrpid;
    }

    public void setUsergrpid(Integer usergrpid) {
        this.usergrpid = usergrpid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Lstmaindto getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmaindto lstmainid) {
        this.lstmainid = lstmainid;
    }

      
    public List<Userusergrouppermissiondto> getUserusergrouppermissionList() {
        return userusergrouppermissionList;
    }

    public void setUserusergrouppermissionList(List<Userusergrouppermissiondto> userusergrouppermissionList) {
        this.userusergrouppermissionList = userusergrouppermissionList;
    }

      
    public List<Userassignedusergroupdto> getUserassignedusergroupList() {
        return userassignedusergroupList;
    }

    public void setUserassignedusergroupList(List<Userassignedusergroupdto> userassignedusergroupList) {
        this.userassignedusergroupList = userassignedusergroupList;
    }

    
}
