package com.comsoftacuity.inasm.client.application.usergroup;

import com.comsoftacuity.inasm.client.application.supplytype.CustomRenderer;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ACTIVE;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ENTEREDBY;
import com.comsoftacuity.inasm.shared.dto.Lstmaindto;
import com.comsoftacuity.inasm.shared.dto.Userusergroupdto;
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

class UsergrouppermissionView extends ViewWithUiHandlers<UsergrouppermissionUiHandlers> implements UsergrouppermissionPresenter.MyView {

    @Override
    public void setUsergroupList(List<Userusergroupdto> list) {
        if (list != null) {
            cbomain.setTextAlign(TextAlign.LEFT);
            editcbomain.setTextAlign(TextAlign.LEFT);
            table.setVisibleRange(0, list.size());
            table.setRowData(0, list);
            table.setRedraw(true);
            table.refreshView();
            
        }else{
            Userusergroupdto empty = new Userusergroupdto();
            empty.setComment("No Record Found!");
            List<Userusergroupdto> lists = new ArrayList<>();
            table.setVisibleRange(0, 1);
            table.setRowData(0, lists);
            table.setRedraw(true);
            table.refreshView();
        }
    }

    @Override
    public void setMainList(List<Lstmaindto> list) {
        if(list != null){
            for(Lstmaindto rs:list){
                cbomain.addItem(rs.getDescription(),rs);
            }
        }
    }
    interface Binder extends UiBinder<Widget, UsergrouppermissionView> {
    }

    @UiField
    MaterialDataTable<Userusergroupdto> table = new MaterialDataTable<>();
    private final DateTimeFormat format = DateTimeFormat.getFormat("yyyy-MM-dd");
    private HashMap<Integer, String> maps;
    private boolean initDone = false;
    private Userusergroupdto dto;
    @UiField
    MaterialModal usergroupmodal;
    @UiField
    MaterialComboBox<Lstmaindto>  cbomain;
    @UiField
    MaterialDatePicker dptcreated;
    @UiField
    MaterialTextBox txtcomment, txtgroupname;
    
    ///////////////////////////////////////////////////////////////////////////
    @UiField
    MaterialModal editusergroupmodal;
    @UiField
    MaterialComboBox<Lstmaindto>  editcbomain;
    @UiField
    MaterialDatePicker editdptcreated;
    
    @UiField
    MaterialTextBox edittxtcomment, edittxtgroupname;
    @Inject
    UsergrouppermissionView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    @Override
    protected void onAttach() {
        if (initDone) {
            return;
        }

        
        table.getTableTitle().setText("Group Permission Register");
        table.addColumn(new WidgetColumn<Userusergroupdto, MaterialIcon>() {
            @Override
            public MaterialIcon getValue(Userusergroupdto object) {
                MaterialIcon icon = new MaterialIcon(IconType.DELETE_FOREVER);

                icon.setCircle(true);
                icon.addClickHandler(new ClickHandler() {

                    @Override
                    public void onClick(ClickEvent event) {
                        dto = object;
                        boolean result = Window.confirm("Are you sure to delete?");
                        if (result) {
                          getUiHandlers().deleteUsergroup(object.getUsergrpid());
                          getUiHandlers().getUsergroupList(0, 50);
                            
                        }
                    }
                });
                return icon;
            }
        });

        table.addColumn(new WidgetColumn<Userusergroupdto, MaterialIcon>() {

            @Override
            public MaterialIcon getValue(Userusergroupdto object) {
                MaterialIcon icon = new MaterialIcon(IconType.EDIT);
                icon.addClickHandler((ClickEvent event) -> {
                    dto = object;
                    edittxtcomment.setValue(object.getComment());
                    edittxtgroupname.setValue(object.getGroupname());
                    editdptcreated.setValue(object.getDatecreated());
                    editusergroupmodal.open();
                });

                return icon;
            }
        });
        table.addColumn(new TextColumn<Userusergroupdto>() {
            @Override
            public Comparator<? super RowComponent<Userusergroupdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getGroupname().compareToIgnoreCase(o2.getData().getGroupname());
            }
            
            @Override
            public String getValue(Userusergroupdto object) {
                if (object.getGroupname()!= null) {
                    return object.getGroupname()+ "";
                }
                return "";
            }
        }, "Group Name");
        
        table.addColumn(new TextColumn<Userusergroupdto>() {
            @Override
            public Comparator<? super RowComponent<Userusergroupdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getDatecreated().toString().compareToIgnoreCase(o2.getData().getDatecreated().toString());
            }
            
            @Override
            public String getValue(Userusergroupdto object) {
                if (object.getDatecreated() != null) {
                    return object.getDatecreated()+ "";
                }
                return "";
            }
        }, "Date Created");
        
        table.addColumn(new TextColumn<Userusergroupdto>() {
            @Override
            public Comparator<? super RowComponent<Userusergroupdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getComment().compareToIgnoreCase(o2.getData().getComment());
            }
            
            @Override
            public String getValue(Userusergroupdto object) {
                if (object.getComment() != null) {
                    return object.getComment()+ "";
                }
                return "";
            }
        }, "Comment");

        table.setRowFactory(new UsergrouppermissionRowFactory());
        table.setRenderer(new CustomRenderer<>());
        table.setVisibleRange(0, 1001);
        table.addRowSelectHandler((e, model, elem, selected) -> {
            
            dto = null;
            if (selected) {
                dto = model;
            }
            
            return true;
        });
        getUiHandlers().getUsergroupList(0, 50);
        initDone = true;
        
    }
    @UiHandler("stbtnadd")
     public void openForm(ClickEvent e){
        usergroupmodal.open();
  } 
     
   @UiHandler("btnCancel")
     public void closeForm(ClickEvent e){
        usergroupmodal.close();
  }
  
  @UiHandler("editbtnCancel")
     public void closeeditForm(ClickEvent e){
        editusergroupmodal.close();
  }
     
     
  @UiHandler("btnFinish")
  public void saveSupplyType(ClickEvent e){
      if(isRecordValid()) {
      Userusergroupdto user = new Userusergroupdto();
      user.setActive(ACTIVE);
      user.setComment(txtcomment.getValue());
      user.setDatecreated(dptcreated.getValue());
      user.setGroupname(txtgroupname.getValue());
      user.setLstmainid(cbomain.getValue());
      user.setEnteredbyid(ENTEREDBY);
      getUiHandlers().createUsergroup(user);
      clearField();
      getUiHandlers().getUsergroupList(0, 50);
      }
  }
  
  public void clearField(){
     txtcomment.setValue(" ");
     txtgroupname.setValue(" ");
       }
  
   boolean isRecordValid() {
        if (txtcomment.getValue().equals("")) {
            txtcomment.setError("Invalid Value");
            return false;
       
        } else if (txtgroupname.getValue().equals("")) {
            txtgroupname.setError("Invalid Value");
            return false;
        } else if (cbomain.getValue().equals("")) {
            cbomain.setError("Invalid Value");
            return false;
        }  
        return true;
    }
   
   @UiHandler("editbtnFinish")
  public void updateSupplyType(ClickEvent e){
     Userusergroupdto user = new Userusergroupdto();
      user.setActive(ACTIVE);
      user.setComment(edittxtcomment.getValue());
      user.setDatecreated(editdptcreated.getValue());
      user.setGroupname(edittxtgroupname.getValue());
      user.setLstmainid(editcbomain.getValue());
      user.setEnteredbyid(ENTEREDBY);
      getUiHandlers().updateUsergroup(user);
      clearField();
      getUiHandlers().getUsergroupList(0, 50);
  }
}