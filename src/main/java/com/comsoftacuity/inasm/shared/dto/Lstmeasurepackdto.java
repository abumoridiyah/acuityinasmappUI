/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;
import java.util.Date;

 @JsonRootName("lstmeasurepack")
public class Lstmeasurepackdto implements Dto {
    private Integer measureid;
    
    private String measurepack;
     
    private Date datecreated;
     
    private Short active;
    
    private Lstmaindto lstmainid;

    public Lstmeasurepackdto() {
    }

    public Lstmeasurepackdto(Integer measureid) {
        this.measureid = measureid;
    }

    public Lstmeasurepackdto(Integer measureid, String measurepack) {
        this.measureid = measureid;
        this.measurepack = measurepack;
    }

    public Integer getMeasureid() {
        return measureid;
    }

    public void setMeasureid(Integer measureid) {
        this.measureid = measureid;
    }

    public String getMeasurepack() {
        return measurepack;
    }

    public void setMeasurepack(String measurepack) {
        this.measurepack = measurepack;
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
