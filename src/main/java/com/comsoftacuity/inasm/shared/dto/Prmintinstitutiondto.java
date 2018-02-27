/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;
import java.util.List;

@JsonRootName("prmintinstitution")
public class Prmintinstitutiondto implements Dto {
  
    private Integer institutionid;
    
    private String institutioncode;
    
    private String institutionname;
    
    private String address;
    
    private String contactdetails;
    
    private Boolean havebranches;
    
    private String contactmobile;
    
    private String contactemail;
    
    private Integer licensemodel;
    
    private String license;
    
    private Date datecreated;
    
    private Integer enteredbyid;
    
    private Short active;
    
    
    private Prmintinstitutiontypedto institutiontypeid;
    
    private List<Trandepreciationdto> trandepreciationList;
    
    private List<Tranlogsdto> tranlogsList;
    
    private List<Applogalertsdto> applogalertsList;
    
    private List<Prmintsuborganisationtypedto> prmintsuborganisationtypeList;
    
    private List<Regitemsdto> regitemsList;
    
    private List<Lstmaindto> lstmainList;
    
    private List<Appmodulesdto> appmodulesList;

    public Prmintinstitutiondto() {
    }

    public Prmintinstitutiondto(Integer institutionid) {
        this.institutionid = institutionid;
    }

    public Prmintinstitutiondto(Integer institutionid, Date datecreated) {
        this.institutionid = institutionid;
        this.datecreated = datecreated;
    }

    public Integer getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Integer institutionid) {
        this.institutionid = institutionid;
    }
 public String getInstitutioncode() {
        return institutioncode;
    }

    public void setInstitutioncode(String institutioncode) {
        this.institutioncode = institutioncode;
    }

    public String getInstitutionname() {
        return institutionname;
    }

    public void setInstitutionname(String institutionname) {
        this.institutionname = institutionname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactdetails() {
        return contactdetails;
    }

    public void setContactdetails(String contactdetails) {
        this.contactdetails = contactdetails;
    }

    public Boolean getHavebranches() {
        return havebranches;
    }

    public void setHavebranches(Boolean havebranches) {
        this.havebranches = havebranches;
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

    public Integer getLicensemodel() {
        return licensemodel;
    }

    public void setLicensemodel(Integer licensemodel) {
        this.licensemodel = licensemodel;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
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

    public Prmintinstitutiontypedto getInstitutiontypeid() {
        return institutiontypeid;
    }

    public void setInstitutiontypeid(Prmintinstitutiontypedto institutiontypeid) {
        this.institutiontypeid = institutiontypeid;
    }

    
    public List<Trandepreciationdto> getTrandepreciationList() {
        return trandepreciationList;
    }

    public void setTrandepreciationList(List<Trandepreciationdto> trandepreciationList) {
        this.trandepreciationList = trandepreciationList;
    }

    
    public List<Tranlogsdto> getTranlogsList() {
        return tranlogsList;
    }

    public void setTranlogsList(List<Tranlogsdto> tranlogsList) {
        this.tranlogsList = tranlogsList;
    }

    
    public List<Applogalertsdto> getApplogalertsList() {
        return applogalertsList;
    }

    public void setApplogalertsList(List<Applogalertsdto> applogalertsList) {
        this.applogalertsList = applogalertsList;
    }

    
    public List<Prmintsuborganisationtypedto> getPrmintsuborganisationtypeList() {
        return prmintsuborganisationtypeList;
    }

    public void setPrmintsuborganisationtypeList(List<Prmintsuborganisationtypedto> prmintsuborganisationtypeList) {
        this.prmintsuborganisationtypeList = prmintsuborganisationtypeList;
    }

    
    public List<Regitemsdto> getRegitemsList() {
        return regitemsList;
    }

    public void setRegitemsList(List<Regitemsdto> regitemsList) {
        this.regitemsList = regitemsList;
    }

    
    public List<Lstmaindto> getLstmainList() {
        return lstmainList;
    }

    public void setLstmainList(List<Lstmaindto> lstmainList) {
        this.lstmainList = lstmainList;
    }

    
    public List<Appmodulesdto> getAppmodulesList() {
        return appmodulesList;
    }

    public void setAppmodulesList(List<Appmodulesdto> appmodulesList) {
        this.appmodulesList = appmodulesList;
    }

    
}
