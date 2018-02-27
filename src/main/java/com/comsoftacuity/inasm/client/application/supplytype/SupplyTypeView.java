package com.comsoftacuity.inasm.client.application.supplytype;


import static com.comsoftacuity.inasm.client.util.ParameterUtil.ACTIVE;
import com.comsoftacuity.inasm.shared.dto.Lstmaindto;
import com.comsoftacuity.inasm.shared.dto.Lstsupplytypedto;
import com.comsoftacuity.inasm.shared.dto.Supplierdto;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.data.component.RowComponent;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.cell.TextColumn;
import gwt.material.design.client.ui.table.cell.WidgetColumn;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;

class SupplyTypeView extends ViewWithUiHandlers<SupplyTypeUiHandlers> implements SupplyTypePresenter.MyView {

    @Override
    public void setLstSupplyTypeList(List<Lstsupplytypedto> list) {
        if (list != null) {
           
            
            table.setVisibleRange(0, list.size());
            table.setRowData(0, list);
            table.setRedraw(true);
            table.refreshView();
            
        }else{
            Lstsupplytypedto empty = new Lstsupplytypedto();
            empty.setDescription("No Record Found!");
            List<Lstsupplytypedto> lists = new ArrayList<>();
            table.setVisibleRange(0, 1);
            table.setRowData(0, lists);
            table.setRedraw(true);
            table.refreshView();
        }
            
        
    }

   @UiField
   MaterialDataTable<Lstsupplytypedto> table = new MaterialDataTable<>();
   private final DateTimeFormat format = DateTimeFormat.getFormat("yyyy-MM-dd");
    private HashMap<Integer, String> maps;
    private boolean initDone = false;
    private Lstsupplytypedto dto;
    @UiField
    MaterialModal suptypemodal;
    @UiField
    MaterialButton btnCancel;
    @UiField
    MaterialTextBox txtdescription;
    
    @UiField
    MaterialDatePicker dtpcreated;
    @UiField
    MaterialComboBox<Lstmaindto> cbomain;
    @UiField
    MaterialComboBox<Supplierdto> cbosupplier;
    ///////////////////////////////////////////////////////////////////////////
    @UiField
    MaterialModal editsuptypemodal;
    @UiField
    MaterialButton editbtnCancel;
    @UiField
    MaterialTextBox edittxtdescription;
    
    @UiField
    MaterialDatePicker editdtpcreated;
     @UiField
    MaterialComboBox<Lstmaindto> editcbomain;
    @UiField
    MaterialComboBox<Supplierdto> editcbosupplier;

    @Override
    public void setSupplierList(List<Supplierdto> list) {
        if (list != null) {
             cbosupplier.clear();
            
            for (Supplierdto rs : list) {
                cbosupplier.addItem(rs.getName(),rs);
                 
            }
        }
    }

    @Override
    public void setTranmainList(List<Lstmaindto> list) {
        if (list != null) {
             cbomain.clear();
            
            for (Lstmaindto rs : list) {
                cbomain.addItem(rs.getDescription(),rs);
                 
            }
        }
    }

   
    interface Binder extends UiBinder<Widget, SupplyTypeView> {
    }
    
    @Inject
    SupplyTypeView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
       
    }

      protected void onAttach() {
       if (initDone) {
            return;
        }
 
        
        table.getTableTitle().setText("Supply Type Register");
        table.addColumn(new WidgetColumn<Lstsupplytypedto, MaterialIcon>() {
            @Override
            public MaterialIcon getValue(Lstsupplytypedto object) {
                MaterialIcon icon = new MaterialIcon(IconType.DELETE_FOREVER);

                icon.setCircle(true);
                icon.addClickHandler(new ClickHandler() {

                    @Override
                    public void onClick(ClickEvent event) {
                        dto = object;
                        boolean result = Window.confirm("Are you sure to delete?");
                        if (result) {
                          getUiHandlers().deleteSupplyType(object.getSubpplytypeid());
                          getUiHandlers().getSupplyTypeList(0, 50);
                            
                        }
                    }
                });
                return icon;
            }
        });

        table.addColumn(new WidgetColumn<Lstsupplytypedto, MaterialIcon>() {

            @Override
            public MaterialIcon getValue(Lstsupplytypedto object) {
                MaterialIcon icon = new MaterialIcon(IconType.EDIT);
                icon.addClickHandler((ClickEvent event) -> {
                    dto = object;
                    edittxtdescription.setValue(object.getDescription());
                    editsuptypemodal.open();
                });

                return icon;
            }
        });
        table.addColumn(new TextColumn<Lstsupplytypedto>() {
            @Override
            public Comparator<? super RowComponent<Lstsupplytypedto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getDescription().compareToIgnoreCase(o2.getData().getDescription());
            }
            
            @Override
            public String getValue(Lstsupplytypedto object) {
                if (object.getDescription() != null) {
                    return object.getDescription()+ "";
                }
                return "";
            }
        }, "Description");
        
        table.addColumn(new TextColumn<Lstsupplytypedto>() {
            @Override
            public Comparator<? super RowComponent<Lstsupplytypedto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getDateCreated().toString().compareToIgnoreCase(o2.getData().getDateCreated().toString());
            }
            
            @Override
            public String getValue(Lstsupplytypedto object) {
                if (object.getDateCreated() != null) {
                    return object.getDateCreated()+ "";
                }
                return "";
            }
        }, "Date");
        
       
        
        
        
        table.setRowFactory(new SupplyTypeRowFactory());
        table.setRenderer(new CustomRenderer<>());
        table.setVisibleRange(0, 1001);
        table.addRowSelectHandler((e, model, elem, selected) -> {
            
            dto = null;
            if (selected) {
                dto = model;
            }
            
            return true;
        });
        getUiHandlers().getSupplyTypeList(0, 50);
        initDone = true;
        
    }
      ////////
    @UiHandler("stbtnadd")
     public void openForm(ClickEvent e){
        suptypemodal.open();
  }
  
  @UiHandler("btnCancel")
     public void closeForm(ClickEvent e){
        suptypemodal.close();
  }
  @UiHandler("editbtnCancel")
     public void editcloseForm(ClickEvent e){
        editsuptypemodal.close();
  }
  @UiHandler("btnFinish")
  public void saveSupplyType(ClickEvent e){
     if(isRecordValid()) {
      Lstsupplytypedto type = new Lstsupplytypedto();
      type.setActive(ACTIVE);
      type.setDateCreated(dtpcreated.getValue());
      type.setDescription(txtdescription.getValue());
      type.setLstmainid(cbomain.getValue());
      type.setSupplyid(cbosupplier.getValue());
      getUiHandlers().createSupplyType(type);
      clearField();
      getUiHandlers().getSupplyTypeList(0, 50);
      }
  }
  
  public void clearField(){
      txtdescription.setValue(" ");
      cbomain.getValues().clear();
      cbosupplier.getValues().clear();
  }
    @UiHandler("editbtnFinish")
  public void updateSupplyType(ClickEvent e){
      Lstsupplytypedto type = new Lstsupplytypedto();
      type.setActive(ACTIVE);
      type.setDateCreated(dtpcreated.getValue());
      type.setDescription(txtdescription.getValue());
      type.setLstmainid(cbomain.getValue());
      type.setSupplyid(cbosupplier.getValue());
      getUiHandlers().updateSupplyType(type);
      getUiHandlers().getSupplyTypeList(0, 50);
  } 
  
  boolean isRecordValid() {
        if (dtpcreated.getValue()== null) {
            dtpcreated.setError("Invalid Value");
            return false;
       
        } else if (txtdescription.getValue() == null) {
            txtdescription.setError("Invalid Value");
            return false;
        } else if (cbomain.getValue()== null) {
            cbomain.setError("Invalid Value");
            return false;
        
        }else if(cbosupplier.getValue() == null){
            cbosupplier.setError("Invalid Value");
            return false;
        }
        return true;
    }
}
