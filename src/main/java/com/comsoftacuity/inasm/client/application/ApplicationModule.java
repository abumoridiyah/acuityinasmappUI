/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.comsoftacuity.inasm.client.application;

import com.comsoftacuity.inasm.client.application.home.HomeModule;
import com.comsoftacuity.inasm.client.application.item.ItemRegisterModule;
import com.comsoftacuity.inasm.client.application.supplier.SupplierModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.comsoftacuity.inasm.client.application.supplytype.SupplyTypeModule;
import com.comsoftacuity.inasm.client.application.store.StoreModule;
import com.comsoftacuity.inasm.client.application.stockleveltype.StockleveltypeModule;
import com.comsoftacuity.inasm.client.application.stockoutreceipttype.StockoutreceipttypeModule;
import com.comsoftacuity.inasm.client.application.stockouttype.StockouttypeModule;
import com.comsoftacuity.inasm.client.application.trandepreciation.TrandepreciationModule;
import com.comsoftacuity.inasm.client.application.userassignedusergroup.UserassignedusergroupModule;
import com.comsoftacuity.inasm.client.application.userpermission.UserpermissionModule;
import com.comsoftacuity.inasm.client.application.userinfo.UserinfoModule;
import com.comsoftacuity.inasm.client.application.usergroup.UsergrouppermissionModule;

public class ApplicationModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
	       
		install(new UsergrouppermissionModule());
		install(new UserinfoModule());
		install(new UserpermissionModule());
		install(new UserassignedusergroupModule());
		install(new TrandepreciationModule());
		install(new StockouttypeModule());
		install(new StockoutreceipttypeModule());
		install(new StockleveltypeModule());
		install(new StoreModule());
		install(new SupplyTypeModule());
		install(new HomeModule());
               install(new ItemRegisterModule());
               install(new SupplierModule());
	
        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
