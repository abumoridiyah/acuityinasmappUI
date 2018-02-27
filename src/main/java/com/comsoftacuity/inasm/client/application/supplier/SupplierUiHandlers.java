/**
 * Date Created: May 23, 2016
 *
 */
package com.comsoftacuity.inasm.client.application.supplier;




import com.comsoftacuity.inasm.shared.dto.Lstsupplytypedto;
import com.comsoftacuity.inasm.shared.dto.Supplierdto;
import com.gwtplatform.mvp.client.UiHandlers;

/**
 *
 * @author Yusuff Saliu Adediran
 */
public interface SupplierUiHandlers extends UiHandlers {
   void createSupplier(Supplierdto supply);
   void craeteSupplyType(Lstsupplytypedto supply);
    public void updateSupplier(Supplierdto supply);
    public void getSupplier(int id);
    public void deleteSupplier(int id);
    void getSupplierList(int offset, int limit);
}
