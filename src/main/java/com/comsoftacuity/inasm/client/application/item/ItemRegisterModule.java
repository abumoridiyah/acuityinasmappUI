/**
 * Date Created: Mar 7, 2017
 *
 */
package com.comsoftacuity.inasm.client.application.item;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

/**
 *
 * @author Mohammed Sadiq
 */
public class ItemRegisterModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
        bindPresenter(ItemRegisterPresenter.class,
                ItemRegisterPresenter.MyView.class, ItemRegisterView.class,
                ItemRegisterPresenter.MyProxy.class);
    }
}
