package com.comsoftacuity.inasm.client.application.trandepreciation;

import com.comsoftacuity.inasm.client.application.supplytype.CustomRenderer;
import com.comsoftacuity.inasm.shared.dto.Prmintinstitutiondto;
import com.comsoftacuity.inasm.shared.dto.Regitemsdto;
import com.comsoftacuity.inasm.shared.dto.Trandepreciationdto;
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
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialDoubleBox;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.cell.TextColumn;
import gwt.material.design.client.ui.table.cell.WidgetColumn;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class TrandepreciationView extends ViewWithUiHandlers<TrandepreciationUiHandlers> implements TrandepreciationPresenter.MyView {

    @Override
    public void setTrandepreciationList(List<Trandepreciationdto> list) {
        if (list != null) {
           
            table.setVisibleRange(0, list.size());
            table.setRowData(0, list);
            table.setRedraw(true);
            table.refreshView();
            
        }else{
            Trandepreciationdto empty = new Trandepreciationdto();
            List<Trandepreciationdto> lists = new ArrayList<>();
            table.setVisibleRange(0, 1);
            table.setRowData(0, lists);
            table.setRedraw(true);
            table.refreshView();
        }
    }

    @Override
    public void setRegitemsList(List<Regitemsdto> list) {
        if (list != null) {
            cboitem.clear();
            cboitem.setTextAlign(TextAlign.LEFT);
            editcboitem.setTextAlign(TextAlign.LEFT);
            for (Regitemsdto rs : list) {
                cboitem.addItem(rs.getItemname(),rs);
            }
        }
    }

    @Override
    public void setPrminstitutionList(List<Prmintinstitutiondto> list) {
        cboinstitution.clear();
        cboinstitution.setTextAlign(TextAlign.LEFT);
        editcboinstitution.setTextAlign(TextAlign.LEFT);
        if (list != null) {
            for (Prmintinstitutiondto rs : list) {
                cboinstitution.addItem(rs.getInstitutionname(),rs);
            }
        }
    }
    interface Binder extends UiBinder<Widget, TrandepreciationView> {
    }
    @UiField
    MaterialDataTable<Trandepreciationdto> table = new MaterialDataTable<>();
    private final DateTimeFormat format = DateTimeFormat.getFormat("yyyy-MM-dd");
    private HashMap<Integer, String> maps;
    private boolean initDone = false;
    private Trandepreciationdto dto;
    @UiField
    MaterialButton btnCancel, btnFinish;
    @UiField
    MaterialComboBox<Prmintinstitutiondto> cboinstitution;
    @UiField
    MaterialComboBox<Regitemsdto> cboitem;
    @UiField
    MaterialComboBox<Integer> cbomonth, cboyear;
    @UiField
    MaterialDatePicker dpttrandate;
    @UiField
    MaterialDoubleBox txtamount;
    @UiField
    MaterialModal tranmodal;
    
    
    ////////////////////////////////////////////////////////////////////////
    @UiField
    MaterialComboBox<Trandepreciationdto> editcboitem,editcboinstitution;
    @UiField
    MaterialComboBox<Integer> editcbomonth, editcboyear;
    @UiField
    MaterialDatePicker editdpttrandate;
    @UiField
    MaterialDoubleBox edittxtamount;
    @UiField
    MaterialModal edittranmodal;
     @UiField
    MaterialButton editbtnCancel, editbtnFinish;
    
   

    @Inject
    TrandepreciationView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
   @Override
    protected void onAttach() {
        if (initDone) {
            return;
        }
        init();
        populateMonth();
        populateYear();
        table.getTableTitle().setText("Transacton Register");
        table.addColumn(new WidgetColumn<Trandepreciationdto, MaterialIcon>() {
            @Override
            public MaterialIcon getValue(Trandepreciationdto object) {
                MaterialIcon icon = new MaterialIcon(IconType.DELETE_FOREVER);

                icon.setCircle(true);
                icon.addClickHandler(new ClickHandler() {

                    @Override
                    public void onClick(ClickEvent event) {
                        dto = object;
                        boolean result = Window.confirm("Are you sure to delete?");
                        if (result) {
                          getUiHandlers().deleteTrandepreciation(object.getId());
                          getUiHandlers().getTrandepreciationList(0, 50);
                            
                        }
                    }
                });
                return icon;
            }
        });

        table.addColumn(new WidgetColumn<Trandepreciationdto, MaterialIcon>() {

            @Override
            public MaterialIcon getValue(Trandepreciationdto object) {
                MaterialIcon icon = new MaterialIcon(IconType.EDIT);
                icon.addClickHandler((ClickEvent event) -> {
                    dto = object;
                    edittranmodal.open();
                });

                return icon;
            }
        });
        table.addColumn(new TextColumn<Trandepreciationdto>() {
            @Override
            public Comparator<? super RowComponent<Trandepreciationdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getItemid().getItemname().compareToIgnoreCase(o2.getData().getItemid().getItemname());
            }
            
            @Override
            public String getValue(Trandepreciationdto object) {
                if (object.getItemid().getItemname() != null) {
                    return object.getItemid().getItemname()+ "";
                }
                return "";
            }
        }, "Item Name");
        
        table.addColumn(new TextColumn<Trandepreciationdto>() {
            @Override
            public Comparator<? super RowComponent<Trandepreciationdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getInstutionid().getInstitutionname().compareToIgnoreCase(o2.getData().getInstutionid().getInstitutionname());
            }
            
            @Override
            public String getValue(Trandepreciationdto object) {
                if (object.getInstutionid().getInstitutionname() != null) {
                    return object.getInstutionid().getInstitutionname()+ "";
                }
                return "";
            }
        }, "Institution Name");
        
        table.addColumn(new TextColumn<Trandepreciationdto>() {
            @Override
            public Comparator<? super RowComponent<Trandepreciationdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getTrandate().toString().compareToIgnoreCase(o2.getData().getTrandate().toString());
            }
            
            @Override
            public String getValue(Trandepreciationdto object) {
                if (object.getTrandate() != null) {
                    return object.getTrandate()+ "";
                }
                return "";
            }
        }, "Transaction Date");
        
      
        
        table.setRowFactory(new TrandepreciationRowFactory());
        table.setRenderer(new CustomRenderer<>());
        table.setVisibleRange(0, 1001);
        table.addRowSelectHandler((e, model, elem, selected) -> {
            
            dto = null;
            if (selected) {
                dto = model;
            }
            
            return true;
        });
        getUiHandlers().getTrandepreciationList(0, 50);
        initDone = true;
        
    } 
    
    @UiHandler("btnFinish")
  public void saveSupplyType(ClickEvent e){
      if(isRecordValid()) {
      Trandepreciationdto type = new Trandepreciationdto();
      type.setAmount(new BigDecimal(txtamount.getValue()));
      type.setInstutionid(cboinstitution.getValue());
      type.setItemid(cboitem.getValue());
      type.setMonthid(cbomonth.getValue());
      type.setTrandate(dpttrandate.getValue());
      type.setYearid(cboyear.getValue());
      getUiHandlers().createTrandepreciation(type);
      clearField();
      getUiHandlers().getTrandepreciationList(0, 50);
      }
  }
  
   boolean isRecordValid() {
        if (txtamount.getValue().equals("")) {
            txtamount.setError("Invalid Value");
            return false;
       
        } else if (cboinstitution.getValue().equals("")) {
            cboinstitution.setError("Invalid Value");
            return false;
        } else if (cboitem.getValue().equals("")) {
            cboitem.setError("Invalid Value");
            return false;
        }
        return true;
    }
  public void clearField(){
      cboinstitution.getValues().clear();
      cboitem.getValues().clear();
      cbomonth.getValues().clear();
      cboyear.getValues().clear();
  }
  @UiHandler("editbtnFinish")
  public void updateSupplyType(ClickEvent e){
      Trandepreciationdto type = new Trandepreciationdto();
      type.setAmount(new BigDecimal(edittxtamount.getValue()));
      type.setInstutionid(editcboinstitution.getValue().getInstutionid());
      type.setItemid(editcboitem.getValue().getItemid());
      type.setMonthid(editcbomonth.getValue());
      type.setTrandate(editdpttrandate.getValue());
      type.setYearid(editcboyear.getValue());
      getUiHandlers().updateTrandepreciation(type);
      getUiHandlers().getTrandepreciationList(0, 50);
  }
  @UiHandler("stbtnadd")
     public void openForm(ClickEvent e){
        tranmodal.open();
  } 
     
   @UiHandler("btnCancel")
     public void closeForm(ClickEvent e){
        tranmodal.close();
  }
  
     
   @UiHandler("editbtnCancel")
     public void closeeditForm(ClickEvent e){
        edittranmodal.close();
  }
  void init() {
        maps = new HashMap<>();
        maps.put(1, "JANUARY");
        maps.put(2, "FEBRUARY");
        maps.put(3, "MARCH");
        maps.put(4, "APRIL");
        maps.put(5, "MAY");
        maps.put(6, "JUNE");
        maps.put(7, "JULY");
        maps.put(8, "AUGUST");
        maps.put(9, "SEPTEMBER");
        maps.put(10, "OCTOMBER");
        maps.put(11, "NOVEMBER");
        maps.put(12, "DECEMBER");
    }
    void populateMonth() {
        cbomonth.setTextAlign(TextAlign.LEFT);
        cbomonth.addItem("JANUARY", 1);
        cbomonth.addItem("FEBRUARY", 2);
        cbomonth.addItem("MARCH", 3);
        cbomonth.addItem("APRIL", 4);
        cbomonth.addItem("MAY", 5);
        cbomonth.addItem("JUNE", 6);
        cbomonth.addItem("JULY", 7);
        cbomonth.addItem("AUGUST", 8);
        cbomonth.addItem("SEPTEMBER", 9);
        cbomonth.addItem("OCTOMBER", 10);
        cbomonth.addItem("NOVEMBER", 11);
        cbomonth.addItem("DECEMBER", 12);
        
        editcbomonth.setTextAlign(TextAlign.LEFT);
        editcbomonth.addItem("JANUARY", 1);
        editcbomonth.addItem("FEBRUARY", 2);
        editcbomonth.addItem("MARCH", 3);
        editcbomonth.addItem("APRIL", 4);
        editcbomonth.addItem("MAY", 5);
        editcbomonth.addItem("JUNE", 6);
        editcbomonth.addItem("JULY", 7);
        editcbomonth.addItem("AUGUST", 8);
        editcbomonth.addItem("SEPTEMBER", 9);
        editcbomonth.addItem("OCTOMBER", 10);
        editcbomonth.addItem("NOVEMBER", 11);
        editcbomonth.addItem("DECEMBER", 12);

    } 
    void populateYear(){
        cboyear.setTextAlign(TextAlign.LEFT);
        editcboyear.setTextAlign(TextAlign.LEFT);
        int max = 2020;
        for (int i = 2000; i <= max; i++) {
            cboyear.addItem(i);
            editcboyear.addItem(i);
        }
    }
}