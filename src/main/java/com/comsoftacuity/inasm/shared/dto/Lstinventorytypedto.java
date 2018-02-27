/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;

@JsonRootName("lstinventorytype")
public class Lstinventorytypedto implements Dto {
    private Integer inventorytypeid;
    private String inventorytype;
    private Date datecreated;
    private Short active;
    private Lstmaindto lstmainid;

    public Lstinventorytypedto() {
    }

    public Lstinventorytypedto(Integer inventorytypeid) {
        this.inventorytypeid = inventorytypeid;
    }

    public Lstinventorytypedto(Integer inventorytypeid, String inventorytype) {
        this.inventorytypeid = inventorytypeid;
        this.inventorytype = inventorytype;
    }

    public Integer getInventorytypeid() {
        return inventorytypeid;
    }

    public void setInventorytypeid(Integer inventorytypeid) {
        this.inventorytypeid = inventorytypeid;
    }

    public String getInventorytype() {
        return inventorytype;
    }

    public void setInventorytype(String inventorytype) {
        this.inventorytype = inventorytype;
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
