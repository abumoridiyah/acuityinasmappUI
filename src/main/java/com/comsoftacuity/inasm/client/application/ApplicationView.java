package com.comsoftacuity.inasm.client.application;

import com.comsoftacuity.inasm.client.place.NameTokens;
import com.comsoftacuity.inasm.client.resources.AppClientBundle;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.event.dom.client.ClickEvent;
import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.client.ui.MaterialPanel;

public class ApplicationView extends ViewWithUiHandlers<AppUiHandler> implements ApplicationPresenter.MyView {

    interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @UiField
    MaterialPanel contentPannel;

    @Inject
    ApplicationView(
            Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        StyleInjector.inject(AppClientBundle.INSTANCE.appCss().getText());

    }

    @Override
    public void setInSlot(Object slot, IsWidget content) {
        if (slot == ApplicationPresenter.SLOT_MAIN) {
            contentPannel.clear();
            if (content != null) {
                contentPannel.add(content);
            }

        } else {
            super.setInSlot(slot, content);
        }
    }

//   @UiHandler("supplytype")
//   public void openItem(ClickEvent e){
//       History.newItem(NameTokens.institution);
//   }
   
   @UiHandler("supplier")
   public void openSupplier(ClickEvent e){
       History.newItem(NameTokens.supplier);
   }
   
   @UiHandler("store")
   public void openStore(ClickEvent e){
       History.newItem(NameTokens.store);
   }
   
    @UiHandler("stockleveltype")
   public void openStockleveltype(ClickEvent e){
       History.newItem(NameTokens.stockleveltype);
   }
   
   
   @UiHandler("trandepreciation")
   public void openTrandepreciation(ClickEvent e){
       History.newItem(NameTokens.trandepreciation);
   }
   
   @UiHandler("userassignedgroup")
   public void openUserassined(ClickEvent e){
       History.newItem(NameTokens.userassignedusergroup);
   }
   
   
   @UiHandler("usergrouppermission")
   public void openUsergroup(ClickEvent e){
       History.newItem(NameTokens.usergrouppermission);
   }
   
   @UiHandler("userinfo")
   public void openUserinfo(ClickEvent e){
       History.newItem(NameTokens.userinfo);
   }
   
   @UiHandler("userpermission")
   public void openUserpermission(ClickEvent e){
       History.newItem(NameTokens.userpermission);
   } 
   
}
