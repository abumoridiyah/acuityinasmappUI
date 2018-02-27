/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.client.application.supplytype;

/**
 *
 * @author JIDEX
 */
import gwt.material.design.client.constants.CheckBoxType;
import gwt.material.design.client.data.BaseRenderer;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.table.TableData;

public class CustomRenderer<T> extends BaseRenderer<T> {

    @Override
    public TableData drawSelectionCell() {
        TableData td = new TableData();
        td.setId("col0");
        MaterialCheckBox checkBox = new MaterialCheckBox(td.getElement());
        checkBox.setType(CheckBoxType.FILLED);
        return td;
    }
    
}