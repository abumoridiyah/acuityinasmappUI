/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;

@JsonRootName("lstmeasureunit")
public class Lstmeasureunitdto implements Dto {
    private Integer mesureunitid;
    
    private String measureunit;
    
    private Date datecreated;
      
    private Short active;
      
      
    private Lstmaindto lstmainid;

    public Lstmeasureunitdto() {
    }

    public Lstmeasureunitdto(Integer mesureunitid) {
        this.mesureunitid = mesureunitid;
    }

    public Lstmeasureunitdto(Integer mesureunitid, Date datecreated) {
        this.mesureunitid = mesureunitid;
        this.datecreated = datecreated;
    }

    public Integer getMesureunitid() {
        return mesureunitid;
    }

    public void setMesureunitid(Integer mesureunitid) {
        this.mesureunitid = mesureunitid;
    }

    public String getMeasureunit() {
        return measureunit;
    }

    public void setMeasureunit(String measureunit) {
        this.measureunit = measureunit;
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

    public Lstmaindto getLstmainid() {
        return lstmainid;
    }

    public void setLstmainid(Lstmaindto lstmainid) {
        this.lstmainid = lstmainid;
    }

    
}
