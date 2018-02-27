package com.comsoftacuity.inasm.client.application.userpermission;

import com.comsoftacuity.inasm.client.application.supplytype.CustomRenderer;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ACTIVE;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ENTEREDBY;
import com.comsoftacuity.inasm.shared.dto.Appmodulesdto;
import com.comsoftacuity.inasm.shared.dto.Tranmaindto;
import com.comsoftacuity.inasm.shared.dto.Userpermissiondto;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.TextAlign;
import gwt.material.design.client.data.component.RowComponent;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialIntegerBox;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.cell.TextColumn;
import gwt.material.design.client.ui.table.cell.WidgetColumn;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class UserpermissionView extends ViewWithUiHandlers<UserpermissionUiHandlers> implements UserpermissionPresenter.MyView {

    @Override
    public void setUserpermissionList(List<Userpermissiondto> list) {
        if (list != null) {
           
            table.setVisibleRange(0, list.size());
            table.setRowData(0, list);
            table.setRedraw(true);
            table.refreshView();
            
        }else{
            Userpermissiondto empty = new Userpermissiondto();
            empty.setDescription("No Record Found!");
            List<Userpermissiondto> lists = new ArrayList<>();
            table.setVisibleRange(0, 1);
            table.setRowData(0, lists);
            table.setRedraw(true);
            table.refreshView();
        }
    }

    @Override
    public void setModuleList(List<Appmodulesdto> list) {
        if (list != null) {
            cbomodule.clear();
            cbomodule.setTextAlign(TextAlign.LEFT);
            editcbomodule.setTextAlign(TextAlign.LEFT);
            for (Appmodulesdto rs : list) {
                cbomodule.addItem(rs.getModuletype(),rs);
                editcbomodule.addItem(rs.getModuletype(),rs);
            }
        }
    }

    @Override
    public void setMainList(List<Tranmaindto> list) {
         if (list != null) {
            cbomain.clear();
            cbomain.setTextAlign(TextAlign.LEFT);
            editcbomain.setTextAlign(TextAlign.LEFT);
            for (Tranmaindto rs : list) {
                cbomain.addItem(rs.getSuppliername(),rs);
                editcbomain.addItem(rs.getSuppliername(),rs);
            }
        }
    }
    interface Binder extends UiBinder<Widget, UserpermissionView> {
    }
    @UiField
    MaterialDataTable<Userpermissiondto> table = new MaterialDataTable<>();
    private final DateTimeFormat format = DateTimeFormat.getFormat("yyyy-MM-dd");
    private HashMap<Integer, String> maps;
    private boolean initDone = false;
    private Userpermissiondto dto;
   @UiField
   MaterialComboBox<Tranmaindto> cbomain;
   @UiField
   MaterialComboBox<Appmodulesdto> cbomodule;
   @UiField
   MaterialTextBox txtpermission, txtdescription;
   @UiField
   MaterialModal userpermissionmodal;
 ///////////////////////////////////////////////////////////////////////////////
   @UiField
   MaterialComboBox editcbomodule,editcbomain;
   @UiField
   MaterialTextBox edittxtpermission, edittxtdescription;
   
   @UiField
   MaterialModal edituserpermissionmodal;

    @Inject
    UserpermissionView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
     @Override
    protected void onAttach() {
        if (initDone) {
            return;
        }

        
        table.getTableTitle().setText("User Permission");
        table.addColumn(new WidgetColumn<Userpermissiondto, MaterialIcon>() {
            @Override
            public MaterialIcon getValue(Userpermissiondto object) {
                MaterialIcon icon = new MaterialIcon(IconType.DELETE_FOREVER);

                icon.setCircle(true);
                icon.addClickHandler(new ClickHandler() {

                    @Override
                    public void onClick(ClickEvent event) {
                        dto = object;
                        boolean result = Window.confirm("Are you sure to delete?");
                        if (result) {
                          getUiHandlers().deleteUserpermission(object.getPermissionid());
                          getUiHandlers().getUserpermissionList(0, 50);
                            
                        }
                    }
                });
                return icon;
            }
        });

        table.addColumn(new WidgetColumn<Userpermissiondto, MaterialIcon>() {

            @Override
            public MaterialIcon getValue(Userpermissiondto object) {
                MaterialIcon icon = new MaterialIcon(IconType.EDIT);
                icon.addClickHandler((ClickEvent event) -> {
                    dto = object;
                    edittxtdescription.setValue(object.getDescription());
                    edittxtpermission.setValue(object.getPermission());
                    edituserpermissionmodal.open();
                });

                return icon;
            }
        });
        table.addColumn(new TextColumn<Userpermissiondto>() {
            @Override
            public Comparator<? super RowComponent<Userpermissiondto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getPermission().compareToIgnoreCase(o2.getData().getPermission());
            }
            
            @Override
            public String getValue(Userpermissiondto object) {
                if (object.getPermission()!= null) {
                    return object.getPermission()+ "";
                }
                return "";
            }
        }, "Permission");
        
        table.addColumn(new TextColumn<Userpermissiondto>() {
            @Override
            public Comparator<? super RowComponent<Userpermissiondto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getDescription().compareToIgnoreCase(o2.getData().getDescription());
            }
            
            @Override
            public String getValue(Userpermissiondto object) {
                if (object.getDescription() != null) {
                    return object.getDescription()+ "";
                }
                return "";
            }
        }, "Description");
        
        

        table.setRowFactory(new UserpermissionRowFactory());
        table.setRenderer(new CustomRenderer<>());
        table.setVisibleRange(0, 1001);
        table.addRowSelectHandler((e, model, elem, selected) -> {
            
            dto = null;
            if (selected) {
                dto = model;
            }
            
            return true;
        });
        getUiHandlers().getUserpermissionList(0, 50);
        initDone = true;
        
    }
    @UiHandler("stbtnadd")
     public void openForm(ClickEvent e){
        userpermissionmodal.open();
  } 
     
   @UiHandler("btnCancel")
     public void closeForm(ClickEvent e){
        userpermissionmodal.close();
  }
  
     
   @UiHandler("editbtnCancel")
     public void closeeditForm(ClickEvent e){
        edituserpermissionmodal.close();
  }
     
   @UiHandler("btnFinish")
  public void saveSupplyType(ClickEvent e){
      if(isRecordValid()) {
      Userpermissiondto user = new Userpermissiondto();
      user.setActive(ACTIVE);
      user.setDescription(txtdescription.getValue());
      user.setEnteredbyid(ENTEREDBY);
      user.setLstmainid(cbomain.getValue().getId());
      user.setModuleid(cbomodule.getValue());
      user.setPermission(txtpermission.getValue());
      user.setPermission(txtpermission.getValue());
      getUiHandlers().createUserpermission(user);
      clearField();
      getUiHandlers().getUserpermissionList(0, 50);
      }
  }
  
  @UiHandler("editbtnFinish")
  public void updateUserpermission(ClickEvent e){
     Userpermissiondto user = new Userpermissiondto();
      user.setActive(ACTIVE);
      user.setDescription(txtdescription.getValue());
      user.setEnteredbyid(ENTEREDBY);
      user.setLstmainid(cbomain.getValue().getId());
      user.setModuleid(cbomodule.getValue());
      user.setPermission(txtpermission.getValue());
      user.setPermission(txtpermission.getValue());
      getUiHandlers().updateUserpermission(user);
      clearField();
      getUiHandlers().getUserpermissionList(0, 50);
  }
  
  
  boolean isRecordValid() {
        if (txtdescription.getValue()== null) {
            txtdescription.setError("Invalid Value");
            return false;
       
        
        } else if (txtpermission.getValue().equals("")) {
            txtpermission.setError("Invalid Value");
            return false;
        }
        return true;
    }
  public void clearField(){
      txtdescription.setValue(" ");
      cbomain.getValues().clear();
      cbomodule.getValues().clear();
      txtpermission.setValue(" ");
  }
}