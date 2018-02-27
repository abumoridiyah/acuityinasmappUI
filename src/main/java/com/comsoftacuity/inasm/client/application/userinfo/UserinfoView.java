package com.comsoftacuity.inasm.client.application.userinfo;

import com.comsoftacuity.inasm.client.application.supplytype.CustomRenderer;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ACTIVE;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ENTEREDBY;
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
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.data.component.RowComponent;
import gwt.material.design.client.ui.MaterialButton;
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

class UserinfoView extends ViewWithUiHandlers<UserinfoUiHandlers> implements UserinfoPresenter.MyView {

    @Override
    public void setUserinfoList(List<Userusersinfodto> list) {
        if (list != null) {
         
            table.setVisibleRange(0, list.size());
            table.setRowData(0, list);
            table.setRedraw(true);
            table.refreshView();
            
        }else{
            Userusersinfodto empty = new Userusersinfodto();
            empty.setFirstname("No Record Found!");
            List<Userusersinfodto> lists = new ArrayList<>();
            table.setVisibleRange(0, 1);
            table.setRowData(0, lists);
            table.setRedraw(true);
            table.refreshView();
        }
    }
    interface Binder extends UiBinder<Widget, UserinfoView> {
    }
     @UiField
   MaterialDataTable<Userusersinfodto> table = new MaterialDataTable<>();
    private final DateTimeFormat format = DateTimeFormat.getFormat("yyyy-MM-dd");
    private HashMap<Integer, String> maps;
    private boolean initDone = false;
    private Userusersinfodto dto;
    @UiField
    MaterialButton btnCancel, btnFinish;
    
   @UiField
   MaterialTextBox txtfirstname,txtmiddlename,txtlastname,txtmobileno,txtmail;
   @UiField
   MaterialTextBox txtinstitution, txtusername, txtpassword;
   
   @UiField
   MaterialDatePicker dptcreated;
   
   @UiField
   MaterialModal userinfomodal;
////////////////////////////////////////////////////////////////////////////////
    @UiField
    MaterialButton editbtnCancel, editbtnFinish;
    
   @UiField
   MaterialTextBox edittxtfirstname,edittxtmiddlename,edittxtlastname,edittxtmobileno,edittxtmail;
   @UiField
   MaterialTextBox edittxtinstitution, edittxtusername, edittxtpassword;
   
   @UiField
   MaterialDatePicker editdptcreated;
   
   @UiField
   MaterialModal edituserinfomodal;
   

    @Inject
    UserinfoView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
     protected void onAttach() {
       if (initDone) {
            return;
        }

        
        table.getTableTitle().setText("User Register");
        table.addColumn(new WidgetColumn<Userusersinfodto, MaterialIcon>() {
            @Override
            public MaterialIcon getValue(Userusersinfodto object) {
                MaterialIcon icon = new MaterialIcon(IconType.DELETE_FOREVER);

                icon.setCircle(true);
                icon.addClickHandler(new ClickHandler() {

                    @Override
                    public void onClick(ClickEvent event) {
                        dto = object;
                        boolean result = Window.confirm("Are you sure to delete?");
                        if (result) {
                          getUiHandlers().deleteUserinfo(object.getUserid());
                          getUiHandlers().getUserinfoList(0, 50);
                            
                        }
                    }
                });
                return icon;
            }
        });

        table.addColumn(new WidgetColumn<Userusersinfodto, MaterialIcon>() {

            @Override
            public MaterialIcon getValue(Userusersinfodto object) {
                MaterialIcon icon = new MaterialIcon(IconType.EDIT);
                icon.addClickHandler((ClickEvent event) -> {
                    dto = object;
                   edittxtfirstname.setValue(object.getFirstname());
                   edittxtmiddlename.setValue(object.getMiddlename());
                   edittxtlastname.setValue(object.getLastname());
                   edittxtinstitution.setValue(object.getInstitutioncode());
                   edittxtmail.setValue(object.getContactemail());
                   edittxtmobileno.setValue(object.getContactmobile());
                   edittxtusername.setValue(object.getUsername());
                   edittxtpassword.setValue(object.getPassword());
                   editdptcreated.setValue(object.getDatecreated());
                   edituserinfomodal.open();
                });

                return icon;
            }
        });
        table.addColumn(new TextColumn<Userusersinfodto>() {
            @Override
            public Comparator<? super RowComponent<Userusersinfodto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getFirstname().compareToIgnoreCase(o2.getData().getFirstname());
            }
            
            @Override
            public String getValue(Userusersinfodto object) {
                if (object.getFirstname() != null) {
                    return object.getFirstname()+ " "+ object.getMiddlename()+" "+object.getLastname();
                }
                return "";
            }
        }, "Full Name");
        
        table.addColumn(new TextColumn<Userusersinfodto>() {
            @Override
            public Comparator<? super RowComponent<Userusersinfodto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getInstitutioncode().compareToIgnoreCase(o2.getData().getInstitutioncode());
            }
            
            @Override
            public String getValue(Userusersinfodto object) {
                if (object.getInstitutioncode() != null) {
                    return object.getInstitutioncode()+ "";
                }
                return "";
            }
        }, "Institution Code");
        
       table.addColumn(new TextColumn<Userusersinfodto>() {
            @Override
            public Comparator<? super RowComponent<Userusersinfodto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getDatecreated().toString().compareToIgnoreCase(o2.getData().getDatecreated().toString());
            }
            
            @Override
            public String getValue(Userusersinfodto object) {
                if (object.getDatecreated() != null) {
                    return object.getDatecreated()+ "";
                }
                return "";
            }
        }, "Date");
        
        
        
        table.setRowFactory(new UserinfoRowFactory());
        table.setRenderer(new CustomRenderer<>());
        table.setVisibleRange(0, 1001);
        table.addRowSelectHandler((e, model, elem, selected) -> {
            
            dto = null;
            if (selected) {
                dto = model;
            }
            
            return true;
        });
        getUiHandlers().getUserinfoList(0, 50);
        initDone = true;
        
    }
     
     
     @UiHandler("stbtnadd")
     public void openForm(ClickEvent e){
        userinfomodal.open();
  } 
     
   @UiHandler("btnCancel")
     public void closeForm(ClickEvent e){
        userinfomodal.close();
  }
  
  @UiHandler("editbtnCancel")
     public void closeeditForm(ClickEvent e){
        edituserinfomodal.close();
  }
     
   
  @UiHandler("btnFinish")
  public void saveSupplyType(ClickEvent e){
      if(isRecordValid()) {
      Userusersinfodto user = new Userusersinfodto();
      user.setActive(ACTIVE);
      user.setContactemail(txtmail.getValue());
      user.setContactmobile(txtmobileno.getValue());
      user.setDatecreated(dptcreated.getValue());
      user.setFirstname(txtfirstname.getValue());
      user.setInstitutioncode(txtinstitution.getValue());
      user.setLastname(txtlastname.getValue());
      user.setMiddlename(txtmiddlename.getValue());
      user.setPassword(txtpassword.getValue());
      user.setUsername(txtusername.getValue());
      user.setEnteredbyid(ENTEREDBY);
      getUiHandlers().createUserinfo(user);
      clearField();
      getUiHandlers().getUserinfoList(0, 50);
      }
  }
  @UiHandler("editbtnFinish")
  public void updateUserpermission(ClickEvent e){
      Userusersinfodto user = new Userusersinfodto();
      user.setActive(ACTIVE);
      user.setContactemail(txtmail.getValue());
      user.setContactmobile(txtmobileno.getValue());
      user.setDatecreated(dptcreated.getValue());
      user.setFirstname(txtfirstname.getValue());
      user.setInstitutioncode(txtinstitution.getValue());
      user.setLastname(txtlastname.getValue());
      user.setMiddlename(txtmiddlename.getValue());
      user.setPassword(txtpassword.getValue());
      user.setUsername(txtusername.getValue());
      user.setEnteredbyid(ENTEREDBY);
      getUiHandlers().updateUserinfo(user);
      clearField();
      getUiHandlers().getUserinfoList(0, 50);
  }
  public void clearField(){
      txtfirstname.setValue(" ");
      txtinstitution.setValue(" ");
      txtlastname.setValue(" ");
      txtmail.setValue(" ");
      txtmiddlename.setValue(" ");
      txtmobileno.setValue(" ");
      txtusername.setValue(" ");
      txtpassword.setValue(" ");
  }
  
    boolean isRecordValid() {
        if (txtfirstname.getValue().equals("")) {
            txtfirstname.setError("Invalid Value");
            return false;
      
        } else if (txtinstitution.getValue().equals("")) {
            txtinstitution.setError("Invalid Value");
            return false;
        } else if (txtlastname.getValue().equals("")) {
            txtlastname.setError("Invalid Value");
            return false;
        }else if(txtmail.getValue().equals("")){
            txtmail.setError("Invalid Value");
        }else if(txtmiddlename.getValue().equals("")){
            txtmiddlename.setError("Invalid Value");
        }else if(txtmobileno.getValue().equals("")){
            txtmobileno.setError("Invalid Value");
        }else if(txtusername.getValue().equals("")){
            txtusername.setError("Invalid Value");
        }else if(txtpassword.getValue().equals("")){
            txtpassword.setError("Invalid Value");
        }
        return true;
    }
}