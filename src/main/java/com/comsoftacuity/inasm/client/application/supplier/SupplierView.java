/**
 * Date Created: May 23, 2016
 *
 */
package com.comsoftacuity.inasm.client.application.supplier;




import com.comsoftacuity.inasm.client.application.supplytype.CustomRenderer;
import com.comsoftacuity.inasm.shared.dto.Lstsupplytypedto;
import com.comsoftacuity.inasm.shared.dto.Supplierdto;
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
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.cell.TextColumn;
import gwt.material.design.client.ui.table.cell.WidgetColumn;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Yusuff Saliu Adediran
 */
public class SupplierView extends ViewWithUiHandlers<SupplierUiHandlers> implements SupplierPresenter.MyView {

    @Override
    public void setSupplierList(List<Supplierdto> list) {
        if (list != null) {
           
            table.setVisibleRange(0, list.size());
            table.setRowData(0, list);
            table.setRedraw(true);
            table.refreshView();
            
        }else{
            Supplierdto empty = new Supplierdto();
            empty.setName("No Record Found!");
            List<Supplierdto> lists = new ArrayList<>();
            table.setVisibleRange(0, 1);
            table.setRowData(0, lists);
            table.setRedraw(true);
            table.refreshView();
        }
    }

    @Override
    public List<Supplierdto> getSupplierCounter() {
        return supplierCounter;
    }

   public Integer getLastId() {
        Supplierdto rd = getSupplierCounter().get(getSupplierCounter().size() - 1);
        return rd.getSupplyid();
    }
   
    interface Binder extends UiBinder<Widget, SupplierView> {
    }
    @UiField
   MaterialDataTable<Supplierdto> table = new MaterialDataTable<>();
   private final DateTimeFormat format = DateTimeFormat.getFormat("yyyy-MM-dd");
    private HashMap<Integer, String> maps;
    private boolean initDone = false;
     private List<Supplierdto> supplierCounter;
    private Supplierdto dto;
    @UiField
    MaterialButton btnCancel, btnFinish;
    @UiField
    MaterialModal supplymodal;
    @UiField
    MaterialTextBox txtname, txtaddress, txtphone, txtmail,txtsupplytype;
    ////////////////////////////////////////////////////////////////
     @UiField
    MaterialButton editbtnCancel, editbtnFinish;
    @UiField
    MaterialModal editsupplymodal;
    @UiField
    MaterialTextBox edittxtname, edittxtaddress, edittxtphone, edittxtmail, edittxtsupplytype;
    @Inject
    SupplierView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
     
     
  
   @Override
    protected void onAttach() {
        if (initDone) {
            return;
        }
        table.getTableTitle().setText("Supplier Register");
        table.addColumn(new WidgetColumn<Supplierdto, MaterialIcon>() {
            @Override
            public MaterialIcon getValue(Supplierdto object) {
                MaterialIcon icon = new MaterialIcon(IconType.DELETE_FOREVER);

                icon.setCircle(true);
                icon.addClickHandler(new ClickHandler() {

                    @Override
                    public void onClick(ClickEvent event) {
                        dto = object;
                        boolean result = Window.confirm("Are you sure to delete?");
                        if (result) {
                          getUiHandlers().deleteSupplier(object.getSupplyid());
                          getUiHandlers().getSupplierList(0, 50);
                            
                        }
                    }
                });
                return icon;
            }
        });

        table.addColumn(new WidgetColumn<Supplierdto, MaterialIcon>() {

            @Override
            public MaterialIcon getValue(Supplierdto object) {
                MaterialIcon icon = new MaterialIcon(IconType.EDIT);
                icon.addClickHandler((ClickEvent event) -> {
                    dto = object;
                    edittxtaddress.setValue(object.getContact());
                    edittxtmail.setValue(object.getEmail());
                    edittxtname.setValue(object.getName());
                    edittxtphone.setValue(object.getPhone());
                    editsupplymodal.open();
                });

                return icon;
            }
        });
        table.addColumn(new TextColumn<Supplierdto>() {
            @Override
            public Comparator<? super RowComponent<Supplierdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getName().compareToIgnoreCase(o2.getData().getName());
            }
            
            @Override
            public String getValue(Supplierdto object) {
                if (object.getName() != null) {
                    return object.getName()+ "";
                }
                return "";
            }
        }, "Full Name");
        
        
        
        table.addColumn(new TextColumn<Supplierdto>() {
            @Override
            public Comparator<? super RowComponent<Supplierdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getContact().compareToIgnoreCase(o2.getData().getContact());
            }
            
            @Override
            public String getValue(Supplierdto object) {
                if (object.getContact() != null) {
                    return object.getContact()+ "";
                }
                return "";
            }
        }, "Contact");
        
        table.addColumn(new TextColumn<Supplierdto>() {
            @Override
            public Comparator<? super RowComponent<Supplierdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getPhone().compareToIgnoreCase(o2.getData().getPhone());
            }
            
            @Override
            public String getValue(Supplierdto object) {
                if (object.getPhone() != null) {
                    return object.getPhone()+ "";
                }
                return "";
            }
        }, "Phone");
        
       table.addColumn(new TextColumn<Supplierdto>() {
            @Override
            public Comparator<? super RowComponent<Supplierdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getEmail().compareToIgnoreCase(o2.getData().getEmail());
            }
            
            @Override
            public String getValue(Supplierdto object) {
                if (object.getEmail() != null) {
                    return object.getEmail()+ "";
                }
                return "";
            }
        }, "E-Mail");
        
        
        
        table.setRowFactory(new SupplierRowFactory());
        table.setRenderer(new CustomRenderer<>());
        table.setVisibleRange(0, 1001);
        table.addRowSelectHandler((e, model, elem, selected) -> {
            
            dto = null;
            if (selected) {
                dto = model;
            }
            
            return true;
        });
        getUiHandlers().getSupplierList(0, 50);
        initDone = true;
        
    }
        
      
   @UiHandler("stbtnadd")
     public void openForm(ClickEvent e){
        supplymodal.open();
  } 
     
   @UiHandler("btnCancel")
     public void closeForm(ClickEvent e){
        supplymodal.close();
  }
  
     
   @UiHandler("editbtnCancel")
     public void closeeditForm(ClickEvent e){
        editsupplymodal.close();
  }
     
  @UiHandler("btnFinish")
  public void saveSupplyType(ClickEvent e){
      if(isRecordValid()) {
      Supplierdto type = new Supplierdto();
      Lstsupplytypedto sup = new Lstsupplytypedto();
      sup.setActive(Short.parseShort("1"));
      sup.setDateCreated(new Date());
      sup.setDescription(txtsupplytype.getValue());
      sup.setSupplyid(type);
      getUiHandlers().craeteSupplyType(sup);
      
      type.setContact(txtaddress.getValue());
      type.setEmail(txtmail.getValue());
      type.setName(txtname.getValue());
      type.setPhone(txtphone.getValue());
      getUiHandlers().createSupplier(type);
      clearField();
      getUiHandlers().getSupplierList(0, 50);
      
      }
  }
  public void saveSupplierType(){
      Integer lastId = getLastId();
      Lstsupplytypedto sup = new Lstsupplytypedto();
      Supplierdto lst = new Supplierdto(lastId);
      sup.setActive(Short.parseShort("1"));
      sup.setDateCreated(new Date());
      sup.setDescription(txtsupplytype.getValue());
      sup.setSupplyid(lst);
      getUiHandlers().craeteSupplyType(sup);
    
  }
   @UiHandler("editbtnFinish")
  public void updateSupplyType(ClickEvent e){
      
      Supplierdto type = new Supplierdto();
      type.setContact(edittxtaddress.getValue());
      type.setEmail(edittxtmail.getValue());
      type.setName(edittxtname.getText());
      type.setPhone(edittxtphone.getValue());
      getUiHandlers().updateSupplier(type);
      clearField();
      getUiHandlers().getSupplierList(0, 50);
      
  }
  
  
  boolean isRecordValid() {
        if (txtname.getValue().equals("")) {
            txtname.setError("Invalid Value");
            return false;
       
        } else if (txtmail.getValue().equals("")) {
            txtmail.setError("Invalid Value");
            return false;
        } else if (txtaddress.getValue().equals("")) {
            txtaddress.setError("Invalid Value");
            return false;
        }else if(txtsupplytype.getValue().equals("")){
            txtsupplytype.setError("Invalid Value");
             return false;
        }
        return true;
    }
  
  public void clearField(){
      txtname.setValue(" ");
      txtmail.setValue(" ");
      txtphone.setValue(" ");
      txtaddress.setValue(" ");
      txtsupplytype.setValue("");
  }
   
}
