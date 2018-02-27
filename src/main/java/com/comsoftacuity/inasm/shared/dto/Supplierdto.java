/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Abu Moridiyah
 */
@JsonRootName("supplier")
public class Supplierdto implements Dto {
    private static final long serialVersionUID = 1L;
    
    private Integer supplyid;
    
    private String name;
    
    private String contact;
   
    private String phone;
    
    private String email;
    private List<Lstsupplytypedto> lstsupplytypeList;

    public Supplierdto() {
    }

    public Supplierdto(Integer supplyid) {
        this.supplyid = supplyid;
    }

    public Integer getSupplyid() {
        return supplyid;
    }

    public void setSupplyid(Integer supplyid) {
        this.supplyid = supplyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public List<Lstsupplytypedto> getLstsupplytypeList() {
        return lstsupplytypeList;
    }

    public void setLstsupplytypeList(List<Lstsupplytypedto> lstsupplytypeList) {
        this.lstsupplytypeList = lstsupplytypeList;
    }

    
}
