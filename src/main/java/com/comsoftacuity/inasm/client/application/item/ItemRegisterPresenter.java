/**
 * Date Created: Mar 7, 2017
 *
 */
package com.comsoftacuity.inasm.client.application.item;

import com.comsoftacuity.inasm.client.application.ApplicationPresenter;
import com.comsoftacuity.inasm.client.place.NameTokens;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

/**
 *
 * @author Mohammed Sadiq
 */
public class ItemRegisterPresenter extends Presenter<ItemRegisterPresenter.MyView, ItemRegisterPresenter.MyProxy> implements ItemRegisterUiHandlers {

    public interface MyView extends View, HasUiHandlers<ItemRegisterUiHandlers> {
    }

    @NameToken(NameTokens.REGITEM)
    @ProxyCodeSplit
    public interface MyProxy extends ProxyPlace<ItemRegisterPresenter> {
    }

    @Inject
    ItemRegisterPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
    }

    @Override
    protected void onBind() {
        super.onBind();
    }

    @Override
    protected void onHide() {
        super.onHide();
    }

}
