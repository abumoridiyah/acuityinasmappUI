package com.comsoftacuity.inasm.client.application.userassignedusergroup;

import com.comsoftacuity.inasm.client.application.supplytype.CustomRenderer;
import com.comsoftacuity.inasm.client.util.MessageHandler;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ACTIVE;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ENTEREDBY;
import com.comsoftacuity.inasm.shared.dto.Userassignedusergroupdto;
import com.comsoftacuity.inasm.shared.dto.Userpermissiondto;
import com.comsoftacuity.inasm.shared.dto.Userusergroupdto;
import com.comsoftacuity.inasm.shared.dto.Userusersinfodto;
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
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialIntegerBox;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.cell.TextColumn;
import gwt.material.design.client.ui.table.cell.WidgetColumn;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class UserassignedusergroupView extends ViewWithUiHandlers<UserassignedusergroupUiHandlers> implements UserassignedusergroupPresenter.MyView {

    @Override
    public void setUserassignedusergroupList(List<Userassignedusergroupdto> list) {
         if (list != null) {
           
            table.setVisibleRange(0, list.size());
            table.setRowData(0, list);
            table.setRedraw(true);
            table.refreshView();
            
        }else{
            Userassignedusergroupdto empty = new Userassignedusergroupdto();
            List<Userassignedusergroupdto> lists = new ArrayList<>();
            table.setVisibleRange(0, 1);
            table.setRowData(0, lists);
            table.setRedraw(true);
            table.refreshView();
        }
    }

    @Override
    public void setUsergroupList(List<Userusergroupdto> list) {
        if (list != null) {
            cbousergroup.clear();
            cbousergroup.setTextAlign(TextAlign.LEFT);
            editcbousergroup.setTextAlign(TextAlign.LEFT);
            for (Userusergroupdto rs : list) {
                cbousergroup.addItem(rs.getGroupname(),rs);
                editcbousergroup.addItem(rs.getGroupname(),rs); 
            }
        }
    }

    @Override
    public void setUserpermissionList(List<Userpermissiondto> list) {
        if (list != null) {
            cbouserpermission.clear();
            cbouserpermission.setTextAlign(TextAlign.LEFT);
            editcbouserpermission.setTextAlign(TextAlign.LEFT);
            for (Userpermissiondto rs : list) {
                cbouserpermission.addItem(rs.getDescription(),rs);
                editcbouserpermission.addItem(rs.getDescription(),rs);
            }
        }
    }

    @Override
    public void setUserinfoList(List<Userusersinfodto> list) {
         if (list != null) {
             cbouserid.clear();
             cbouserid.setTextAlign(TextAlign.LEFT);
             editcbouserid.setTextAlign(TextAlign.LEFT);
            for (Userusersinfodto rs : list) {
                cbouserid.addItem(rs.getFirstname()+ " "+ rs.getMiddlename()+" "+rs.getLastname(),rs);
                editcbouserid.addItem(rs.getFirstname()+ " "+ rs.getMiddlename()+" "+rs.getLastname(),rs);
            }
        }
    }
    interface Binder extends UiBinder<Widget, UserassignedusergroupView> {
    }
    
    @UiField
   MaterialDataTable<Userassignedusergroupdto> table = new MaterialDataTable<>();
   private final DateTimeFormat format = DateTimeFormat.getFormat("yyyy-MM-dd");
    private HashMap<Integer, String> maps;
    private boolean initDone = false;
    private Userassignedusergroupdto dto;
    @UiField
    MaterialComboBox<Userusersinfodto> cbouserid;
    @UiField
    MaterialComboBox<Userusergroupdto> cbousergroup;
    @UiField
    MaterialComboBox<Userpermissiondto> cbouserpermission;
    
    @UiField
    MaterialDatePicker dtpcreated;
    
    
    @UiField
    MaterialModal userassignedmodal;
    ///////////////////////////////////////////////////////////////////////////
    @UiField
    MaterialComboBox<Userusersinfodto> editcbouserid;
    @UiField
    MaterialComboBox<Userusergroupdto> editcbousergroup;
    @UiField
    MaterialComboBox<Userpermissiondto> editcbouserpermission;
    @UiField
    MaterialDatePicker editdtpcreated;
    
    @UiField
    MaterialModal edituserassignedmodal;
    @Inject
    UserassignedusergroupView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
   @Override
    protected void onAttach() {
        if (initDone) {
            return;
        }

        
        table.getTableTitle().setText("User Group Register");
        table.addColumn(new WidgetColumn<Userassignedusergroupdto, MaterialIcon>() {
            @Override
            public MaterialIcon getValue(Userassignedusergroupdto object) {
                MaterialIcon icon = new MaterialIcon(IconType.DELETE_FOREVER);

                icon.setCircle(true);
                icon.addClickHandler(new ClickHandler() {

                    @Override
                    public void onClick(ClickEvent event) {
                        dto = object;
                        boolean result = Window.confirm("Are you sure to delete?");
                        if (result) {
                          getUiHandlers().deleteUserassignedgroup(object.getAsignuserid());
                          getUiHandlers().getUserassignedgroupList(0, 50);
                            
                        }
                    }
                });
                return icon;
            }
        });

        table.addColumn(new WidgetColumn<Userassignedusergroupdto, MaterialIcon>() {

            @Override
            public MaterialIcon getValue(Userassignedusergroupdto object) {
                MaterialIcon icon = new MaterialIcon(IconType.EDIT);
                icon.addClickHandler((ClickEvent event) -> {
                    dto = object;
                    edituserassignedmodal.open();
                });

                return icon;
            }
        });
        table.addColumn(new TextColumn<Userassignedusergroupdto>() {
            @Override
            public Comparator<? super RowComponent<Userassignedusergroupdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getUserid().getFirstname().compareToIgnoreCase(o2.getData().getUserid().getFirstname());
            }
            
            @Override
            public String getValue(Userassignedusergroupdto object) {
                if (object.getUserid().getFirstname() != null) {
                    return object.getUserid().getFirstname()+ "";
                }
                return "";
            }
        }, "Full Name");
        
        table.addColumn(new TextColumn<Userassignedusergroupdto>() {
            @Override
            public Comparator<? super RowComponent<Userassignedusergroupdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getGroupid().getGroupname().compareToIgnoreCase(o2.getData().getGroupid().getGroupname());
            }
            
            @Override
            public String getValue(Userassignedusergroupdto object) {
                if (object.getGroupid().getGroupname() != null) {
                    return object.getGroupid().getGroupname()+ "";
                }
                return "";
            }
        }, "Group Name");
        
        table.addColumn(new TextColumn<Userassignedusergroupdto>() {
            @Override
            public Comparator<? super RowComponent<Userassignedusergroupdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getDatecreated().toString().compareToIgnoreCase(o2.getData().getDatecreated().toString());
            }
            
            @Override
            public String getValue(Userassignedusergroupdto object) {
                if (object.getDatecreated() != null) {
                    return object.getDatecreated()+ "";
                }
                return "";
            }
        }, "Date Created");
      
        table.setRowFactory(new UserassignedRowFactory());
        table.setRenderer(new CustomRenderer<>());
        table.setVisibleRange(0, 1001);
        table.addRowSelectHandler((e, model, elem, selected) -> {
            
            dto = null;
            if (selected) {
                dto = model;
            }
            
            return true;
        });
        getUiHandlers().getUserassignedgroupList(0, 50);
        initDone = true;
        
    }
        
      
   @UiHandler("stbtnadd")
     public void openForm(ClickEvent e){
        userassignedmodal.open();
  } 
     
   @UiHandler("btnCancel")
     public void closeForm(ClickEvent e){
        userassignedmodal.close();
  }
  
     
   @UiHandler("editbtnCancel")
     public void closeeditForm(ClickEvent e){
        edituserassignedmodal.close();
  }
     
  @UiHandler("btnFinish")
  public void saveSupplyType(ClickEvent e){
      if(isRecordValid()) {
      Userassignedusergroupdto user = new Userassignedusergroupdto();
      user.setActive(ACTIVE);
      user.setDatecreated(dtpcreated.getValue());
      user.setEnteredbyId(ENTEREDBY);
      user.setGroupid(cbousergroup.getValue());
      user.setPrmissionId(cbouserpermission.getValue());
      user.setUserid(cbouserid.getValue());
      getUiHandlers().createUserassignedgroup(user);
      clearField();
      getUiHandlers().getUserassignedgroupList(0, 50);
      }
  }
  
  @UiHandler("editbtnFinish")
  public void updateSupplyType(ClickEvent e){
     Userassignedusergroupdto user = new Userassignedusergroupdto();
      user.setActive(ACTIVE);
      user.setDatecreated(editdtpcreated.getValue());
      user.setEnteredbyId(ENTEREDBY);
      user.setGroupid(editcbousergroup.getValue());
      user.setPrmissionId(editcbouserpermission.getValue());
      user.setUserid(editcbouserid.getValue());
      getUiHandlers().updateUserassignedgroup(user);
      clearField();
      getUiHandlers().getUserassignedgroupList(0, 50);
  }
  public void clearField(){
      cbousergroup.getValues().clear();
      cbouserid.getValues().clear();
      cbouserpermission.getValues().clear();
     
  }
   boolean isRecordValid() {
        if (cbousergroup.getValue().equals("")) {
            cbousergroup.setError("Invalid Value");
            return false;
        }else if(cbouserid.getValue().equals("")){
            cbouserid.setError("Invalid Value");
            return false;
        }else if(cbouserpermission.getValue().equals("")){
            cbouserpermission.setError("Invalid Value");
            return false;
        }
        return true;
    }
}