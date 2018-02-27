/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.shared.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 *   
 */
@JsonRootName("trandepreciation")
public class Trandepreciationdto implements Dto {
   
    private Integer id;
      
    private Integer monthid;
      
    private Integer yearid;
    
    private Date trandate;
    
    private BigDecimal amount;
    
    private Regitemsdto itemid;
    
    private Prmintinstitutiondto instutionid;

    public Trandepreciationdto() {
    }

    public Trandepreciationdto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonthid() {
        return monthid;
    }

    public void setMonthid(Integer monthid) {
        this.monthid = monthid;
    }

    public Integer getYearid() {
        return yearid;
    }

    public void setYearid(Integer yearid) {
        this.yearid = yearid;
    }

    public Date getTrandate() {
        return trandate;
    }

    public void setTrandate(Date trandate) {
        this.trandate = trandate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Regitemsdto getItemid() {
        return itemid;
    }

    public void setItemid(Regitemsdto itemid) {
        this.itemid = itemid;
    }

    public Prmintinstitutiondto getInstutionid() {
        return instutionid;
    }

    public void setInstutionid(Prmintinstitutiondto instutionid) {
        this.instutionid = instutionid;
    }

}
