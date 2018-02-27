/**
 * Date Created: Mar 7, 2017
 *
 */
package com.comsoftacuity.inasm.client.application.item;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import gwt.material.design.addins.client.menubar.MaterialMenuBar;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconPosition;
import gwt.material.design.client.constants.IconSize;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDropDown;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialModal;

/**
 *
 * @author Mohammed Sadiq
 */
public class ItemRegisterView extends ViewWithUiHandlers<ItemRegisterUiHandlers> implements ItemRegisterPresenter.MyView {

    public interface Binder extends UiBinder<Widget, ItemRegisterView> {
    }

    @UiField
    MaterialMenuBar menuBar;
    @UiField
    MaterialModal itemregModal;

    @Inject
    ItemRegisterView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        createMenu();
    }

    private void createMenu() {
        MaterialButton button = new MaterialButton();
        button.setText("View");
        button.setBackgroundColor(Color.BLUE_LIGHTEN_3);
        button.setIconType(IconType.ARROW_DROP_DOWN);
        button.setIconSize(IconSize.TINY);
        button.setIconPosition(IconPosition.RIGHT);
        button.setTextColor(Color.WHITE);
        button.setActivates("dp-file");

        MaterialMenuBar mnubar = new MaterialMenuBar();
        MaterialDropDown drp = new MaterialDropDown("dp-file");

        MaterialLink menuenuone = new MaterialLink("Menu One");
        menuenuone.setId("Accounttype");
        menuenuone.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
//                do something

            }
        });
        drp.add(menuenuone);

        MaterialLink menuetwo = new MaterialLink("Menu One");
        menuetwo.setId("Accounttype");
        menuetwo.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
//                do something

            }
        });
        drp.add(menuetwo);

        button.add(drp);
        menuBar.add(button);
        mnubar.setFloat(Style.Float.LEFT);
    }

    @UiHandler("stbtnadd")
    void onAddInventory(ClickEvent e) {
        itemregModal.open();
    }

    @UiHandler("btnCancel")
    void onCloseInventory(ClickEvent e) {
        itemregModal.close();
    }

}
