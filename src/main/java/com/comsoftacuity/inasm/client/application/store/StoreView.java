package com.comsoftacuity.inasm.client.application.store;

import com.comsoftacuity.inasm.client.application.supplytype.CustomRenderer;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ACTIVE;
import com.comsoftacuity.inasm.shared.dto.Lststoresdto;
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

class StoreView extends ViewWithUiHandlers<StoreUiHandlers> implements StorePresenter.MyView {

    @Override
    public void setStoreList(List<Lststoresdto> list) {
        if (list != null) {
            
            cbostoretype.clear();
            cbostoretype.setTextAlign(TextAlign.LEFT);
            editcbostoretype.setTextAlign(TextAlign.LEFT);
            cboparent.clear();
            cboparent.setTextAlign(TextAlign.LEFT);
            editcboparent.setTextAlign(TextAlign.LEFT);
            cbomain.clear();
            cbomain.setTextAlign(TextAlign.LEFT);
            editcbomain.setTextAlign(TextAlign.LEFT);
            for (Lststoresdto rs : list) {
                cbostoretype.addItem(rs.getStoretypeid().getDescription(), rs);
                editcbostoretype.addItem(rs.getStoretypeid().getDescription(), rs);
                cbomain.addItem(rs.getLstmainid().getDescription(), rs);
                editcbomain.addItem(rs.getLstmainid().getDescription(), rs);
            }
            
            table.setVisibleRange(0, list.size());
            table.setRowData(0, list);
            table.setRedraw(true);
            table.refreshView();
            
        }else{
            Lststoresdto empty = new Lststoresdto();
            empty.setStorelevelname("No Record Found!");
            List<Lststoresdto> lists = new ArrayList<>();
            table.setVisibleRange(0, 1);
            table.setRowData(0, lists);
            table.setRedraw(true);
            table.refreshView();
        }
            
    }
    interface Binder extends UiBinder<Widget, StoreView> {
    }

   
   @UiField
   MaterialDataTable<Lststoresdto> table = new MaterialDataTable<>();
   private final DateTimeFormat format = DateTimeFormat.getFormat("yyyy-MM-dd");
    private HashMap<Integer, String> maps;
    private boolean initDone = false;
    private Lststoresdto dto;
    @UiField
    MaterialButton btnCancel, btnFinish;
    
    @UiField
    MaterialTextBox txtstorelevel;
    @UiField
    MaterialComboBox<Lststoresdto> cbostoretype,cboparent, cbomain;
    @UiField
    MaterialDatePicker dtpcreated;
    
    @UiField
    MaterialModal storemodal;
    ///////////////////////////////////////////////////////////////////////////
    @UiField
    MaterialButton editbtnCancel, editbtnFinish;
    
    @UiField
    MaterialTextBox edittxtstorelevel;
    @UiField
    MaterialComboBox<Lststoresdto> editcbostoretype,editcboparent, editcbomain;
    @UiField
    MaterialDatePicker editdtpcreated;
    
    @UiField
    MaterialModal editstoremodal;

    @Inject
    StoreView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
     @UiHandler("stbtnadd")
     public void openForm(ClickEvent e){
        storemodal.open();
  } 
     
    @UiHandler("btnCancel")
     public void closeForm(ClickEvent e){
        storemodal.close();
  }
  
  @UiHandler("editbtnCancel")
     public void editcloseForm(ClickEvent e){
        editstoremodal.close();
  }
  
     
  protected void onAttach() {
       if (initDone) {
            return;
        }

        
        table.getTableTitle().setText("Store Register");
        table.addColumn(new WidgetColumn<Lststoresdto, MaterialIcon>() {
            @Override
            public MaterialIcon getValue(Lststoresdto object) {
                MaterialIcon icon = new MaterialIcon(IconType.DELETE_FOREVER);

                icon.setCircle(true);
                icon.addClickHandler(new ClickHandler() {

                    @Override
                    public void onClick(ClickEvent event) {
                        dto = object;
                        boolean result = Window.confirm("Are you sure to delete?");
                        if (result) {
                          getUiHandlers().deleteStore(object.getStoreid());
                          getUiHandlers().getStoreList(0, 50);
                            
                        }
                    }
                });
                return icon;
            }
        });

        table.addColumn(new WidgetColumn<Lststoresdto, MaterialIcon>() {

            @Override
            public MaterialIcon getValue(Lststoresdto object) {
                MaterialIcon icon = new MaterialIcon(IconType.EDIT);
                icon.addClickHandler((ClickEvent event) -> {
                    dto = object;
                   edittxtstorelevel.setValue(object.getStorelevelname());
                   editstoremodal.open();
                });

                return icon;
            }
        });
        table.addColumn(new TextColumn<Lststoresdto>() {
            @Override
            public Comparator<? super RowComponent<Lststoresdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getParentId().toString().compareToIgnoreCase(o2.getData().getParentId().toString());
            }
            
            @Override
            public String getValue(Lststoresdto object) {
                if (object.getParentId() != null) {
                    return object.getParentId()+ "";
                }
                return "";
            }
        }, "Parent Name");
        
        table.addColumn(new TextColumn<Lststoresdto>() {
            @Override
            public Comparator<? super RowComponent<Lststoresdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getStorelevelname().compareToIgnoreCase(o2.getData().getStorelevelname());
            }
            
            @Override
            public String getValue(Lststoresdto object) {
                if (object.getStorelevelname() != null) {
                    return object.getStorelevelname()+ "";
                }
                return "";
            }
        }, "Store Level Name");
        
       table.addColumn(new TextColumn<Lststoresdto>() {
            @Override
            public Comparator<? super RowComponent<Lststoresdto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getDatecreated().toString().compareToIgnoreCase(o2.getData().getDatecreated().toString());
            }
            
            @Override
            public String getValue(Lststoresdto object) {
                if (object.getDatecreated() != null) {
                    return object.getDatecreated()+ "";
                }
                return "";
            }
        }, "Date");
        
        
        
        table.setRowFactory(new StoreRowFactory());
        table.setRenderer(new CustomRenderer<>());
        table.setVisibleRange(0, 1001);
        table.addRowSelectHandler((e, model, elem, selected) -> {
            
            dto = null;
            if (selected) {
                dto = model;
            }
            
            return true;
        });
        getUiHandlers().getStoreList(0, 50);
        initDone = true;
        
    }
    boolean isRecordValid() {
        if (txtstorelevel.getValue().equals("")) {
            txtstorelevel.setError("Invalid Value");
            return false;
      
        } else if (cbostoretype.getValue().equals("")) {
            cbostoretype.setError("Invalid Value");
            return false;
        } else if (cboparent.getValue().equals("")) {
            cboparent.setError("Invalid Value");
            return false;
        }else if(cbomain.getValue().equals("")){
            cbomain.setError("Invalid Value");
        }
        return true;
    }
    
    @UiHandler("btnFinish")
  public void saveStores(ClickEvent e){
      if(isRecordValid()) {
      Lststoresdto st = new Lststoresdto();
      st.setActive(ACTIVE);
      st.setDatecreated(dtpcreated.getValue());
      st.setLstmainid(cbomain.getSelectedValue().getLstmainid());
      st.setStoretypeid(cbostoretype.getSelectedValue().getStoretypeid());
      getUiHandlers().createStore(st);
      clearField();
      getUiHandlers().getStoreList(0, 50);
      }
  }
  
  public void clearField(){
      txtstorelevel.setValue(" ");
      cbomain.getValues().clear();
      cboparent.getValues().clear();
      cbostoretype.getValues().clear();
 }
  
  @UiHandler("editbtnFinish")
    public void updateStockleveltype(ClickEvent e){
      if(isRecordValid()) {
      Lststoresdto st = new Lststoresdto();
      st.setActive(ACTIVE);
      st.setDatecreated(editdtpcreated.getValue());
      st.setLstmainid(editcbomain.getSelectedValue().getLstmainid());
      st.setStorelevelname(edittxtstorelevel.getValue());
      getUiHandlers().updateStore(st);
      clearField();
      getUiHandlers().getStoreList(0, 50);
      }
  }
}