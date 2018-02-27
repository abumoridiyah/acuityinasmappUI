package com.comsoftacuity.inasm.client.application.stockleveltype;

import com.comsoftacuity.inasm.client.application.supplytype.CustomRenderer;
import static com.comsoftacuity.inasm.client.util.ParameterUtil.ACTIVE;
import com.comsoftacuity.inasm.shared.dto.Lststockleveltypedto;
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

class StockleveltypeView extends ViewWithUiHandlers<StockleveltypeUiHandlers> implements StockleveltypePresenter.MyView {

    @Override
    public void setLststockleveltypeList(List<Lststockleveltypedto> list) {
         if (list != null) {
            
           
            cbomain.clear();
            for (Lststockleveltypedto rs : list) {
               
                cbomain.addItem(rs.getLstmainid().getDescription(), rs);
               
            }
            
            table.setVisibleRange(0, list.size());
            table.setRowData(0, list);
            table.setRedraw(true);
            table.refreshView();
            
        }else{
            Lststockleveltypedto empty = new Lststockleveltypedto();
            empty.setDescription("No Record Found!");
            List<Lststockleveltypedto> lists = new ArrayList<>();
            table.setVisibleRange(0, 1);
            table.setRowData(0, lists);
            table.setRedraw(true);
            table.refreshView();
        }
    }
    interface Binder extends UiBinder<Widget, StockleveltypeView> {
    }
    @UiField
   MaterialDataTable<Lststockleveltypedto> table = new MaterialDataTable<>();
   private final DateTimeFormat format = DateTimeFormat.getFormat("yyyy-MM-dd");
    private HashMap<Integer, String> maps;
    private boolean initDone = false;
    private Lststockleveltypedto dto;
    @UiField
    MaterialButton btnCancel, btnFinish;
    @UiField
    MaterialModal stocklevelmodal;
   @UiField
   MaterialComboBox<Lststockleveltypedto>  cbomain;
   @UiField
   MaterialTextBox txtdescription;
   @UiField
   MaterialDatePicker dtpcreated;
   
   //////////////////////////////////////////////////////////
   @UiField
    MaterialButton editbtnCancel, editbtnFinish;
    @UiField
    MaterialModal editstocklevelmodal;
   @UiField
   MaterialComboBox<Lststockleveltypedto>  editcbomain;
   @UiField
   MaterialTextBox edittxtdescription;
   @UiField
   MaterialDatePicker editdtpcreated;
   
   
   
    @Inject
    StockleveltypeView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
   @UiHandler("stbtnadd")
     public void openForm(ClickEvent e){
        stocklevelmodal.open();
  } 
     
    @UiHandler("btnCancel")
     public void closeForm(ClickEvent e){
        stocklevelmodal.close();
  } 
  
  @UiHandler("editbtnCancel")
     public void editcloseForm(ClickEvent e){
        editstocklevelmodal.close();
  }    
     
     
 protected void onAttach() {
       if (initDone) {
            return;
        }

        
        table.getTableTitle().setText("Stock Register");
        table.addColumn(new WidgetColumn<Lststockleveltypedto, MaterialIcon>() {
            @Override
            public MaterialIcon getValue(Lststockleveltypedto object) {
                MaterialIcon icon = new MaterialIcon(IconType.DELETE_FOREVER);

                icon.setCircle(true);
                icon.addClickHandler(new ClickHandler() {

                    @Override
                    public void onClick(ClickEvent event) {
                        dto = object;
                        boolean result = Window.confirm("Are you sure to delete?");
                        if (result) {
                          getUiHandlers().deleteStockleveltype(object.getStoretypeid());
                          getUiHandlers().getStockleveltypeList(0, 50);
                            
                        }
                    }
                });
                return icon;
            }
        });

        table.addColumn(new WidgetColumn<Lststockleveltypedto, MaterialIcon>() {

            @Override
            public MaterialIcon getValue(Lststockleveltypedto object) {
                MaterialIcon icon = new MaterialIcon(IconType.EDIT);
                icon.addClickHandler((ClickEvent event) -> {
                    dto = object;
                    edittxtdescription.setValue(object.getDescription());
                    editstocklevelmodal.open();
                });

                return icon;
            }
        });
        table.addColumn(new TextColumn<Lststockleveltypedto>() {
            @Override
            public Comparator<? super RowComponent<Lststockleveltypedto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getDescription().compareToIgnoreCase(o2.getData().getDescription());
            }
            
            @Override
            public String getValue(Lststockleveltypedto object) {
                if (object.getDescription() != null) {
                    return object.getDescription()+ "";
                }
                return "";
            }
        }, "Description");
        
        table.addColumn(new TextColumn<Lststockleveltypedto>() {
            @Override
            public Comparator<? super RowComponent<Lststockleveltypedto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getDatecreated().toString().compareToIgnoreCase(o2.getData().getDatecreated().toString());
            }
            
            @Override
            public String getValue(Lststockleveltypedto object) {
                if (object.getDatecreated() != null) {
                    return object.getDatecreated()+ "";
                }
                return "";
            }
        }, "Date Created");
        
       table.addColumn(new TextColumn<Lststockleveltypedto>() {
            @Override
            public Comparator<? super RowComponent<Lststockleveltypedto>> getSortComparator() {
                return (o1, o2) -> o1.getData().getLstmainid().getDescription().compareToIgnoreCase(o2.getData().getLstmainid().getDescription());
            }
            
            @Override
            public String getValue(Lststockleveltypedto object) {
                if (object.getLstmainid().getDescription() != null) {
                    return object.getLstmainid().getDescription()+ "";
                }
                return "";
            }
        }, "Main");
        
        
        
        table.setRowFactory(new StockleveltypeRowFactory());
        table.setRenderer(new CustomRenderer<>());
        table.setVisibleRange(0, 1001);
        table.addRowSelectHandler((e, model, elem, selected) -> {
            
            dto = null;
            if (selected) {
                dto = model;
            }
            
            return true;
        });
        getUiHandlers().getStockleveltypeList(0, 50);
        initDone = true;
        
    }
    boolean isRecordValid() {
        if (txtdescription.getValue()== null) {
            txtdescription.setError("Invalid Value");
            return false;
      
        }else if(cbomain.getValue()== null){
            cbomain.setError("Invalid Value");
        }
        return true;
    }
    
    @UiHandler("btnFinish")
    public void saveStockleveltype(ClickEvent e){
      if(isRecordValid()) {
      Lststockleveltypedto st = new Lststockleveltypedto();
      st.setActive(ACTIVE);
      st.setDatecreated(dtpcreated.getValue());
      st.setLstmainid(cbomain.getSelectedValue().getLstmainid());
      st.setDescription(txtdescription.getValue());
      getUiHandlers().createStockleveltype(st);
      clearField();
      getUiHandlers().getStockleveltypeList(0, 50);
      }
  }
   
    @UiHandler("editbtnFinish")
    public void updateStockleveltype(ClickEvent e){
      if(isRecordValid()) {
      Lststockleveltypedto st = new Lststockleveltypedto();
      st.setActive(ACTIVE);
      st.setDatecreated(editdtpcreated.getValue());
      st.setLstmainid(editcbomain.getSelectedValue().getLstmainid());
      st.setDescription(edittxtdescription.getValue());
      getUiHandlers().updateStocklevel(st);
      clearField();
      getUiHandlers().getStockleveltypeList(0, 50);
      }
  }
    
   public void clearField(){
       cbomain.getValues().clear();
       txtdescription.setValue(" ");
   }
}