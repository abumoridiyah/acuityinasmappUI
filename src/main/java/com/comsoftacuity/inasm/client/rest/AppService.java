/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.client.rest;

import static com.comsoftacuity.inasm.client.rest.ApiPaths.ID;
import static com.comsoftacuity.inasm.client.rest.ApiPaths.LIMIT;
import static com.comsoftacuity.inasm.client.rest.ApiPaths.OFFSET;
import static com.comsoftacuity.inasm.client.rest.ApiPaths.PARAMTYPE;
import static com.comsoftacuity.inasm.client.rest.ApiPaths.PATH_ID;
import com.comsoftacuity.inasm.shared.dto.Appapprulesdto;
import com.comsoftacuity.inasm.shared.dto.Applogalertsdto;
import com.comsoftacuity.inasm.shared.dto.Appmodulesdto;
import com.comsoftacuity.inasm.shared.dto.Lstcategoryleveltypedto;
import com.comsoftacuity.inasm.shared.dto.Lstinventorytypedto;
import com.comsoftacuity.inasm.shared.dto.Lstmaindto;
import com.comsoftacuity.inasm.shared.dto.Lstmeasurepackdto;
import com.comsoftacuity.inasm.shared.dto.Lstmeasureunitdto;
import com.comsoftacuity.inasm.shared.dto.Lststockleveltypedto;
import com.comsoftacuity.inasm.shared.dto.Lststockoutreceipttypedto;
import com.comsoftacuity.inasm.shared.dto.Lststockouttypedto;
import com.comsoftacuity.inasm.shared.dto.Lststoresdto;
import com.comsoftacuity.inasm.shared.dto.Lstsubcategorytreedto;
import com.comsoftacuity.inasm.shared.dto.Lstsupplytypedto;
import com.comsoftacuity.inasm.shared.dto.Parameterlistdto;
import com.comsoftacuity.inasm.shared.dto.Prmintinstitutiondto;
import com.comsoftacuity.inasm.shared.dto.Prmintinstitutiontypedto;
import com.comsoftacuity.inasm.shared.dto.Prmintsuborganisationdto;
import com.comsoftacuity.inasm.shared.dto.Prmintsuborganisationtypedto;
import com.comsoftacuity.inasm.shared.dto.Regdepreciationbycategorydto;
import com.comsoftacuity.inasm.shared.dto.Regitemsdto;
import com.comsoftacuity.inasm.shared.dto.ServiceResult;
import com.comsoftacuity.inasm.shared.dto.Supplierdto;
import com.comsoftacuity.inasm.shared.dto.Trandepreciationdto;
import com.comsoftacuity.inasm.shared.dto.Trandisposaldto;
import com.comsoftacuity.inasm.shared.dto.Tranlogsdto;
import com.comsoftacuity.inasm.shared.dto.Tranmaindto;
import com.comsoftacuity.inasm.shared.dto.Transtockindto;
import com.comsoftacuity.inasm.shared.dto.Transtockleveldto;
import com.comsoftacuity.inasm.shared.dto.Transtockoutdto;
import com.comsoftacuity.inasm.shared.dto.Transtocktakingdto;
import com.comsoftacuity.inasm.shared.dto.Trantransfersdto;
import com.comsoftacuity.inasm.shared.dto.Userassignedusergroupdto;
import com.comsoftacuity.inasm.shared.dto.Userpermissiondto;
import com.comsoftacuity.inasm.shared.dto.Userusergroupdto;
import com.comsoftacuity.inasm.shared.dto.Userusergrouppermissiondto;
import com.comsoftacuity.inasm.shared.dto.Userusersinfodto;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

/**
 *
 * @author Yusuff Saliu Adediran
 */
@Path("/inventory")
public interface AppService extends RestService {

    @GET
    @Path("/list/appapprules")
    void getAppappruless(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Appapprulesdto>> list);

    @POST
    @Path("/add/appapprules")
    void addAppapprules(Appapprulesdto appapprules, MethodCallback<Appapprulesdto> list);

    @PUT
    @Path("/update/appapprules")
    void updateAppapprules(Appapprulesdto appapprules, MethodCallback<Appapprulesdto> list);

    @GET
    @Path("/appapprules" + PATH_ID)
    void getAppapprules(@PathParam(ID) Integer id, MethodCallback<Appapprulesdto> list);

    @DELETE
    @Path("/appapprules" + PATH_ID)
    void deleteAppapprules(@PathParam(ID) Integer id, MethodCallback<ServiceResult> list);

    /////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/applogalerts")
    void getApplogalertss(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Applogalertsdto>> list);

    @POST
    @Path("/add/applogalerts")
    void addApplogalerts(Applogalertsdto applogalerts, MethodCallback<Applogalertsdto> result);

    @PUT
    @Path("/update/applogalerts")
    void updateApplogalerts(Applogalertsdto applogalerts, MethodCallback<Applogalertsdto> result);

    @GET
    @Path("/applogalerts" + PATH_ID)
    void getApplogalerts(@PathParam(ID) Integer id, MethodCallback<Applogalertsdto> result);

    @DELETE
    @Path("/applogalerts" + PATH_ID)
    void deleteApplogalerts(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/appmodules")
    void getAppmoduless(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Appmodulesdto>> result);

    @POST
    @Path("/add/appmodules")
    void addAppmodules(Appmodulesdto appmodules, MethodCallback<Appmodulesdto> result);

    @PUT
    @Path("/update/appmodules")
    void updateAppmodules(Appmodulesdto appmodules, MethodCallback<Appmodulesdto> result);

    @GET
    @Path("/appmodules" + PATH_ID)
    void getAppmodules(@PathParam(ID) Integer id, MethodCallback<Appmodulesdto> result);

    @DELETE
    @Path("/appmodules" + PATH_ID)
    void deleteAppmodules(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/lstcategoryleveltype")
    void getLstcategoryleveltypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lstcategoryleveltypedto>> result);

    @POST
    @Path("/add/lstcategoryleveltype")
    void addLstcategoryleveltype(Lstcategoryleveltypedto lstcategoryleveltype, MethodCallback<Lstcategoryleveltypedto> result);

    @PUT
    @Path("/update/lstcategoryleveltype")
    void updateLstcategoryleveltype(Lstcategoryleveltypedto lstcategoryleveltype, MethodCallback<Lstcategoryleveltypedto> result);

    @GET
    @Path("/lstcategoryleveltype" + PATH_ID)
    void getLstcategoryleveltype(@PathParam(ID) Integer id, MethodCallback<Lstcategoryleveltypedto> result);

    @DELETE
    @Path("/lstcategoryleveltype" + PATH_ID)
    void deleteLstcategoryleveltype(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/lstinventorytype")
    void getLstinventorytypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lstinventorytypedto>> result);

    @POST
    @Path("/add/lstinventorytype")
    void addLstinventorytype(Lstinventorytypedto lstinventorytype, MethodCallback<Lstinventorytypedto> result);

    @PUT
    @Path("/update/lstinventorytype")
    void updateLstinventorytype(Lstinventorytypedto lstinventorytype, MethodCallback<Lstinventorytypedto> result);

    @GET
    @Path("/lstinventorytype" + PATH_ID)
    void getLstinventorytype(@PathParam(ID) Integer id, MethodCallback<Lstinventorytypedto> result);

    @DELETE
    @Path("/lstinventorytype" + PATH_ID)
    void deleteLstinventorytype(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/lstmain")
    void getLstmains(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lstmaindto>> result);

    @POST
    @Path("/add/lstmain")
    void addLstmain(Lstmaindto lstmain, MethodCallback<Lstmaindto> result);

    @PUT
    @Path("/update/lstmain")
    void updateLstmain(Lstmaindto lstmain, MethodCallback<Lstmaindto> result);

    @GET
    @Path("/lstmain" + PATH_ID)
    void getLstmain(@PathParam(ID) Integer id, MethodCallback<Lstmaindto> result);

    @DELETE
    @Path("/lstmain" + PATH_ID)
    void deleteLstmain(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/lstmeasurepack")
    void getLstmeasurepacks(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lstmeasurepackdto>> result);

    @POST
    @Path("/add/lstmeasurepack")
    void addLstmeasurepack(Lstmeasurepackdto lstmeasurepack, MethodCallback<Lstmeasurepackdto> result);

    @PUT
    @Path("/update/lstmeasurepack")
    void updateLstmeasurepack(Lstmeasurepackdto lstmeasurepack, MethodCallback<Lstmeasurepackdto> result);

    @GET
    @Path("/lstmeasurepack" + PATH_ID)
    void getLstmeasurepack(@PathParam(ID) Integer id, MethodCallback<Lstmeasurepackdto> result);

    @DELETE
    @Path("/lstmeasurepack" + PATH_ID)
    void deleteLstmeasurepack(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/lstmeasureunit")
    void getLstmeasureunits(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lstmeasureunitdto>> result);

    @POST
    @Path("/add/lstmeasureunit")
    void addLstmeasureunit(Lstmeasureunitdto lstmeasurepack, MethodCallback<Lstmeasureunitdto> result);

    @PUT
    @Path("/update/lstmeasureunit")
    void updateLstmeasureunit(Lstmeasureunitdto lstmeasurepack, MethodCallback<Lstmeasureunitdto> result);

    @GET
    @Path("/lstmeasureunit" + PATH_ID)
    void getLstmeasureunit(@PathParam(ID) Integer id, MethodCallback<Lstmeasureunitdto> result);

    @DELETE
    @Path("/lstmeasureunit" + PATH_ID)
    void deleteLstmeasureunit(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/lststockleveltype")
    void getLststockleveltypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lststockleveltypedto>> result);

    @POST
    @Path("/add/lststockleveltype")
    void addLststockleveltype(Lststockleveltypedto lstmeasurepack, MethodCallback<Lststockleveltypedto> result);

    @PUT
    @Path("/update/lststockleveltype")
    void updateLststockleveltype(Lststockleveltypedto lstmeasurepack, MethodCallback<Lststockleveltypedto> result);

    @GET
    @Path("/lststockleveltype" + PATH_ID)
    void getLststockleveltype(@PathParam(ID) Integer id, MethodCallback<Lststockleveltypedto> result);

    @DELETE
    @Path("/lststockleveltype" + PATH_ID)
    void deleteLststockleveltype(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/lststockoutreceipttype")
    void getLststockoutreceipttypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lststockoutreceipttypedto>> list);

    @POST
    @Path("/add/lststockoutreceipttype")
    void addLststockoutreceipttype(Lststockoutreceipttypedto lstmeasurepack, MethodCallback<Lststockoutreceipttypedto> result);

    @PUT
    @Path("/update/lststockoutreceipttype")
    void updateLststockoutreceipttype(Lststockoutreceipttypedto lstmeasurepack, MethodCallback<Lststockoutreceipttypedto> result);

    @GET
    @Path("/lststockoutreceipttype" + PATH_ID)
    void getLststockoutreceipttype(@PathParam(ID) Integer id, MethodCallback<Lststockoutreceipttypedto> result);

    @DELETE
    @Path("/lststockoutreceipttype" + PATH_ID)
    void deleteLststockoutreceipttype(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/lststockouttype")
    void getLststockouttypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lststockouttypedto>> list);

    @POST
    @Path("/add/lststockouttype")
    void addLststockouttype(Lststockouttypedto lstmeasurepack, MethodCallback<Lststockouttypedto> result);

    @PUT
    @Path("/update/lststockouttype")
    void updateLststockouttype(Lststockouttypedto lstmeasurepack, MethodCallback<Lststockouttypedto> result);

    @GET
    @Path("/lststockouttype" + PATH_ID)
    void getLststockouttype(@PathParam(ID) Integer id, MethodCallback<Lststockouttypedto> result);

    @DELETE
    @Path("/lststockouttype" + PATH_ID)
    void deleteLststockouttype(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/lststores")
    void getLststoress(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lststoresdto>> result);

    @POST
    @Path("/add/lststores")
    void addLststores(Lststoresdto lstmeasurepack, MethodCallback<Lststoresdto> result);

    @PUT
    @Path("/update/lststores")
    void updateLststores(Lststoresdto lstmeasurepack, MethodCallback<Lststoresdto> result);

    @GET
    @Path("/lststores" + PATH_ID)
    void getLststores(@PathParam(ID) Integer id, MethodCallback<Lststoresdto> result);

    @DELETE
    @Path("/lststores" + PATH_ID)
    void deleteLststores(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/lstsubcategorytree")
    void getLstsubcategorytrees(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lstsubcategorytreedto>> list);

    @POST
    @Path("/add/lstsubcategorytree")
    void addLstsubcategorytree(Lstsubcategorytreedto lstmeasurepack, MethodCallback<Lstsubcategorytreedto> result);

    @PUT
    @Path("/update/lstsubcategorytree")
    void updateLstsubcategorytree(Lstsubcategorytreedto lstmeasurepack, MethodCallback<Lstsubcategorytreedto> result);

    @GET
    @Path("/lstsubcategorytree" + PATH_ID)
    void getLstsubcategorytree(@PathParam(ID) Integer id, MethodCallback<Lstsubcategorytreedto> result);

    @DELETE
    @Path("/lstsubcategorytree" + PATH_ID)
    void deleteLstsubcategorytree(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/lstsupplytype")
    void getLstsupplytypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Lstsupplytypedto>> result);

    @POST
    @Path("/add/lstsupplytype")
    void addLstsupplytype(Lstsupplytypedto lstmeasurepack, MethodCallback<Lstsupplytypedto> result);

    @PUT
    @Path("/update/lstsupplytype")
    void updateLstsupplytype(Lstsupplytypedto lstmeasurepack, MethodCallback<Lstsupplytypedto> result);

    @GET
    @Path("/lstsupplytype" + PATH_ID)
    void getLstsupplytype(@PathParam(ID) Integer id, MethodCallback<Lstsupplytypedto> result);

    @DELETE
    @Path("/lstsupplytype" + PATH_ID)
    void deleteLstsupplytype(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/prmintinstitution")
    void getPrmintinstitutions(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Prmintinstitutiondto>> result);

    @POST
    @Path("/add/prmintinstitution")
    void addPrmintinstitution(Prmintinstitutiondto lstmeasurepack, MethodCallback<Prmintinstitutiondto> result);

    @PUT
    @Path("/update/prmintinstitution")
    void updatePrmintinstitution(Prmintinstitutiondto lstmeasurepack, MethodCallback<Prmintinstitutiondto> result);

    @GET
    @Path("/prmintinstitution" + PATH_ID)
    void getPrmintinstitution(@PathParam(ID) Integer id, MethodCallback<Prmintinstitutiondto> result);

    @DELETE
    @Path("/prmintinstitution" + PATH_ID)
    void deletePrmintinstitution(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////

    @GET
    @Path("/list/prmintinstitutiontype")
    void getPrmintinstitutiontypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Prmintinstitutiontypedto>> result);

    @POST
    @Path("/add/prmintinstitutiontype")
    void addPrmintinstitutiontype(Prmintinstitutiontypedto lstmeasurepack, MethodCallback<Prmintinstitutiontypedto> result);

    @PUT
    @Path("/update/prmintinstitutiontype")
    void updatePrmintinstitutiontype(Prmintinstitutiontypedto lstmeasurepack, MethodCallback<Prmintinstitutiontypedto> result);

    @GET
    @Path("/prmintinstitutiontype" + PATH_ID)
    void getPrmintinstitutiontype(@PathParam(ID) Integer id, MethodCallback<Prmintinstitutiontypedto> result);

    @DELETE
    @Path("/prmintinstitutiontype" + PATH_ID)
    void deletePrmintinstitutiontype(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/prmintsuborganisation")
    void getPrmintsuborganisations(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Prmintsuborganisationdto>> result);

    @POST
    @Path("/add/prmintsuborganisation")
    void addPrmintsuborganisation(Prmintsuborganisationdto lstmeasurepack, MethodCallback<Prmintsuborganisationdto> result);

    @PUT
    @Path("/update/prmintsuborganisation")
    void updatePrmintsuborganisation(Prmintsuborganisationdto lstmeasurepack, MethodCallback<Prmintsuborganisationdto> result);

    @GET
    @Path("/prmintsuborganisation" + PATH_ID)
    void getPrmintsuborganisation(@PathParam(ID) Integer id, MethodCallback<Prmintsuborganisationdto> result);

    @DELETE
    @Path("/prmintsuborganisation" + PATH_ID)
    void deletePrmintsuborganisation(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/prmintsuborganisationtype")
    void getPrmintsuborganisationtypes(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Prmintsuborganisationtypedto>> result);

    @POST
    @Path("/add/prmintsuborganisationtype")
    void addPrmintsuborganisationtype(Prmintsuborganisationtypedto lstmeasurepack, MethodCallback<Prmintsuborganisationtypedto> result);

    @PUT
    @Path("/update/prmintsuborganisationtype")
    void updatePrmintsuborganisationtype(Prmintsuborganisationtypedto lstmeasurepack, MethodCallback<Prmintsuborganisationtypedto> result);

    @GET
    @Path("/prmintsuborganisationtype" + PATH_ID)
    void getPrmintsuborganisationtype(@PathParam(ID) Integer id, MethodCallback<Prmintsuborganisationtypedto> result);

    @DELETE
    @Path("/prmintsuborganisationtype" + PATH_ID)
    void deletePrmintsuborganisationtype(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GET
    @Path("/list/regdepreciationbycategory")
    void getRegdepreciationbycategorys(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Regdepreciationbycategorydto>> result);

    @POST
    @Path("/add/regdepreciationbycategory")
    void addRegdepreciationbycategory(Regdepreciationbycategorydto lstmeasurepack, MethodCallback<Regdepreciationbycategorydto> result);

    @PUT
    @Path("/update/regdepreciationbycategory")
    void updateRegdepreciationbycategory(Regdepreciationbycategorydto lstmeasurepack, MethodCallback<Regdepreciationbycategorydto> result);

    @GET
    @Path("/regdepreciationbycategory" + PATH_ID)
    void getRegdepreciationbycategory(@PathParam(ID) Integer id, MethodCallback<Regdepreciationbycategorydto> result);

    @DELETE
    @Path("/regdepreciationbycategory" + PATH_ID)
    void deleteRegdepreciationbycategory(@PathParam(ID) Integer id, MethodCallback<ServiceResult> result);

     ////////////////////////////////////////////////////////////////////////////////////////////
    @POST
    @Path("/delete/parameterlist")
    void deleteParameterlist(Parameterlistdto p, @QueryParam(PARAMTYPE) String type, MethodCallback<Integer> result);

    @POST
    @Path("/add/parameterlist")
    void createParameterlist(Parameterlistdto p, @QueryParam(PARAMTYPE) String type, MethodCallback<Integer> result);

    @POST
    @Path("/update/parameterlist")
    void updateParameterlist(Parameterlistdto p, @QueryParam(PARAMTYPE) String type, MethodCallback<Integer> result);
////////////////////////////////////////////////////////////////////////////
     @GET
  @Path("/list/userusersinfo")
  void getUseruserinfoList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Userusersinfodto>> results);
  
  @POST
  @Path("/add/userusesrinfo")
  void addUserinfo(Userusersinfodto training, MethodCallback<Userusersinfodto> result);

  @PUT
  @Path("/update/userusesrinfo")
  void updateUserinfo(Userusersinfodto training, MethodCallback<Userusersinfodto> result);

  @GET
  @Path("/userusersinfo" + PATH_ID)
  void getUserinfo(@PathParam(ID) Integer id, MethodCallback<Userusersinfodto> result);

  @DELETE
  @Path("/userusersinfo" + PATH_ID)
  void deleteUserinfo(@PathParam(ID) Integer id, MethodCallback<Userusersinfodto> result);
  //////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/userusergrouppermission")
  void getUsergrouppermissionList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Userusergrouppermissiondto>> results);
  
  @POST
  @Path("/add/userusergrouppermission")
  void addUsergrouppermission(Userusergrouppermissiondto training, MethodCallback<Userusergrouppermissiondto> result);
  
  @PUT
  @Path("/update/userusergrouppermission")
  void updateUsergrouppermission(Userusergrouppermissiondto training, MethodCallback<Userusergrouppermissiondto> result);
  
  @GET
  @Path("/userusergrouppermission" + PATH_ID)
  void getUsergrouppermission(@PathParam(ID) Integer id, MethodCallback<Userusergrouppermissiondto> result);
  
  @DELETE
  @Path("/userusergrouppermission" + PATH_ID)
  void deleteUsergrouppermission(@PathParam(ID) Integer id, MethodCallback<Userusergrouppermissiondto> result);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/userusergroup")
  void getUsergroupList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Userusergroupdto>> results);
  
  @POST
  @Path("/add/userusergroup")
  void addUsergroup(Userusergroupdto training, MethodCallback<Userusergroupdto> result);
  
  @PUT
  @Path("/update/userusergroup")
  void updateUsergroup(Userusergroupdto training, MethodCallback<Userusergroupdto> result);
  
  @GET
  @Path("/userusergroup"+ PATH_ID)
  void getUsergroup(@PathParam(ID) Integer id, MethodCallback<Userusergroupdto> result);
  
  @DELETE
  @Path("/userusergroup"+ PATH_ID)
  void deleteUsergroup(@PathParam(ID) Integer id, MethodCallback<Userusergroupdto> result);
  ////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/userpermission")
  void getUserpermissionList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Userpermissiondto>> results);
  
  @POST
  @Path("/add/userpermission")
  void addUserpermission(Userpermissiondto training, MethodCallback<Userpermissiondto> result);
  
  @PUT
  @Path("/update/userpermission")
  void updateUserpermission(Userpermissiondto training, MethodCallback<Userpermissiondto> result);
  
  @GET
  @Path("/userpermission"+ PATH_ID)
  void getUserpermission(@PathParam(ID) Integer id, MethodCallback<Userpermissiondto> result);
  
  @DELETE
  @Path("/userpermission"+ PATH_ID)
  void deleteUserpermission(@PathParam(ID) Integer id, MethodCallback<Userpermissiondto> result);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/userassignedusergroup")
  void getUserassignedusergroupList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Userassignedusergroupdto>> results);
  
  @POST
  @Path("/add/userassignedusergroup")
  void addUserassignedusergroup(Userassignedusergroupdto training, MethodCallback<Userassignedusergroupdto> result);
  
  @PUT
  @Path("/update/userassignedusergroup")
  void updateUserassignedusergroup(Userassignedusergroupdto training, MethodCallback<Userassignedusergroupdto> result);
  
  @GET
  @Path("/userassignedusergroup"+ PATH_ID)
  void getUserassignedusergroup(@PathParam(ID) Integer id, MethodCallback<Userassignedusergroupdto> result);
  
  @DELETE
  @Path("/userassignedusergroup"+ PATH_ID)
  void deleteUserassignedusergroup(@PathParam(ID) Integer id, MethodCallback<Userassignedusergroupdto> result);
  //////////////////////////////////////////////////////////////////////////
  
  @GET
  @Path("/list/trantransfers")
  void getTrantransfersList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Trantransfersdto>> results);
  
  @POST
  @Path("/add/trantransfers")
  void addTrantransfers(Userpermissiondto training, MethodCallback<Trantransfersdto> result);
  
  @PUT
  @Path("/update/trantransfers")
  void updateTrantransfers(Userpermissiondto training, MethodCallback<Trantransfersdto> result);
  
  @GET
  @Path("/trantransfers"+ PATH_ID)
  void getTrantransfers(@PathParam(ID) Integer id, MethodCallback<Trantransfersdto> result);
  
  @DELETE
  @Path("/trantransfers"+ PATH_ID)
  void deleteTrantransfers(@PathParam(ID) Integer id, MethodCallback<Trantransfersdto> result);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/transtocktaking")
  void getTranstocktakingList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Transtocktakingdto>> results);
  
  @POST
  @Path("/add/transtocktaking")
  void addTranstocktaking(Transtocktakingdto training, MethodCallback<Transtocktakingdto> result);
  
  @PUT
  @Path("/update/transtocktaking")
  void updateTranstocktaking(Transtocktakingdto training, MethodCallback<Transtocktakingdto> result);
  
  @GET
  @Path("/transtocktaking"+ PATH_ID)
  void getTranstocktaking(@PathParam(ID) Integer id, MethodCallback<Transtocktakingdto> result);
  
  @DELETE
  @Path("/transtocktaking"+ PATH_ID)
  void deleteTranstocktaking(@PathParam(ID) Integer id, MethodCallback<Transtocktakingdto> result);
  //////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/transtockout")
  void getTranstockoutList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Transtockoutdto>> results);
  
  @POST
  @Path("/add/transtockout")
  void addTranstockout(Transtockoutdto training, MethodCallback<Transtockoutdto> result);
  
  @PUT
  @Path("/update/transtockout")
  void updateTranstockout(Transtockoutdto training, MethodCallback<Transtockoutdto> result);
  
  @GET
  @Path("/transtockout"+ PATH_ID)
  void getTranstockout(@PathParam(ID) Integer id, MethodCallback<Transtockoutdto> result);
  
  @DELETE
  @Path("/transtockout"+ PATH_ID)
  void deleteTranstockout(@PathParam(ID) Integer id, MethodCallback<Transtockoutdto> result);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/transtocklevel")
  void getTranstocklevelList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Transtockleveldto>> results);
  
  @POST
  @Path("/add/transtocklevel")
  void addTranstocklevel(Transtockleveldto training, MethodCallback<Transtockleveldto> result);
  
  @PUT
  @Path("/update/transtocklevel")
  void updateTranstocklevel(Transtockleveldto training, MethodCallback<Transtockleveldto> result);
  
  @GET
  @Path("/transtocklevel"+ PATH_ID)
  void getTranstocklevel(@PathParam(ID) Integer id, MethodCallback<Transtockleveldto> result);
  
  @DELETE
  @Path("/transtocklevel"+ PATH_ID)
  void deleteTranstocklevel(@PathParam(ID) Integer id, MethodCallback<Transtockleveldto> result);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/transtockin")
  void getTranstockinList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Transtockindto>> results);
  
  @POST
  @Path("/add/transtockin")
  void addTranstockin(Transtockindto training, MethodCallback<Transtockindto> result);
  
  @PUT
  @Path("/update/transtockin")
  void updateTranstockin(Transtockindto training, MethodCallback<Transtockindto> result);
  
  @GET
  @Path("/transtockin"+ PATH_ID)
  void getTranstockin(@PathParam(ID) Integer id, MethodCallback<Transtockindto> result);
  
  @DELETE
  @Path("/transtockin"+ PATH_ID)
  void deleteTranstockin(@PathParam(ID) Integer id, MethodCallback<Transtockindto> result);
  /////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/tranlogs")
  void getTranlogsList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Tranlogsdto>> results);
  
  @POST
  @Path("/add/tranlogs")
  void addTranlogs(Tranlogsdto training, MethodCallback<Tranlogsdto> result);
  
  @PUT
  @Path("/update/tranlogs")
  void updateTranlogs(Tranlogsdto training, MethodCallback<Tranlogsdto> result);
  
  @GET
  @Path("/tranlogs"+ PATH_ID)
  void getTranlogs(@PathParam(ID) Integer id, MethodCallback<Tranlogsdto> result);
  
  @DELETE
  @Path("/tranlogs"+ PATH_ID)
  void deleteTranlogs(@PathParam(ID) Integer id, MethodCallback<Tranlogsdto> result);
  //////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/trandisposal")
  void getTrandisposalList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Trandisposaldto>> results);
  
  @POST
  @Path("/add/trandisposal")
  void addTrandisposal(Trandisposaldto training, MethodCallback<Trandisposaldto> result);
  
  @PUT
  @Path("/update/trandisposal")
  void updateTrandisposal(Trandisposaldto training, MethodCallback<Trandisposaldto> result);
  
  @GET
  @Path("/trandisposal"+ PATH_ID)
  void getTrandisposal(@PathParam(ID) Integer id, MethodCallback<Trandisposaldto> result);
  
  @DELETE
  @Path("/trandisposal"+ PATH_ID)
  void deleteTrandisposal(@PathParam(ID) Integer id, MethodCallback<Trandisposaldto> result);
  ///////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/trandepreciation")
  void getTrandepreciationList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Trandepreciationdto>> results);
  
  @POST
  @Path("/add/trandepreciation")
  void addTrandepreciation(Trandepreciationdto training, MethodCallback<Trandepreciationdto> result);
  
  @PUT
  @Path("/update/trandepreciation")
  void updateTrandepreciation(Trandepreciationdto training, MethodCallback<Trandepreciationdto> result);
  
  @GET
  @Path("/trandepreciation"+ PATH_ID)
  void getTrandepreciation(@PathParam(ID) Integer id, MethodCallback<Trandepreciationdto> result);
  
  @DELETE
  @Path("/trandepreciation"+ PATH_ID)
  void deleteTrandepreciation(@PathParam(ID) Integer id, MethodCallback<Trandepreciationdto> result);
  //////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/regitems")
  void getRegitemsList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Regitemsdto>> results);
  
  @POST
  @Path("/add/regitems")
  void addRegitems(Regitemsdto training, MethodCallback<Regitemsdto> result);
  
  @PUT
  @Path("/update/regitems")
  void updateRegitems(Regitemsdto training, MethodCallback<Regitemsdto> result);
  
  @GET
  @Path("/regitems"+ PATH_ID)
  void getRegitems(@PathParam(ID) Integer id, MethodCallback<Regitemsdto> result);
  
  @DELETE
  @Path("/regitems"+ PATH_ID)
  void deleteRegitems(@PathParam(ID) Integer id, MethodCallback<Regitemsdto> result);
  //////////////////////////////////////////////////////////////////////////////
  @GET
  @Path("/list/tranmain")
  void getTranmainList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Tranmaindto>> results);
  
  @POST
  @Path("/add/tranmain")
  void addTranmain(Tranmaindto training, MethodCallback<Tranmaindto> result);
  
  @PUT
  @Path("/update/tranmain")
  void updateTranmain(Tranmaindto training, MethodCallback<Tranmaindto> result);
  
  @GET
  @Path("/tranmain"+ PATH_ID)
  void getTranmain(@PathParam(ID) Integer id, MethodCallback<Tranmaindto> result);
  
  @DELETE
  @Path("/tranmain"+ PATH_ID)
  void deleteTranmain(@PathParam(ID) Integer id, MethodCallback<Tranmaindto> result);
  /////////////////////////////////////////////////////////
   @GET
  @Path("/list/supplier")
  void getSupplierList(@DefaultValue("0") @QueryParam(OFFSET) int offset,
            @DefaultValue("20") @QueryParam(LIMIT) int limit, MethodCallback<List<Supplierdto>> results);
  
  @POST
  @Path("/add/supplier")
  void addSupplier(Supplierdto training, MethodCallback<Supplierdto> result);

  @PUT
  @Path("/update/supplier")
  void updateSupplier(Supplierdto training, MethodCallback<Supplierdto> result);

  @GET
  @Path("/supplier" + PATH_ID)
  void getSupplier(@PathParam(ID) Integer id, MethodCallback<Supplierdto> result);
  
  
  @DELETE
  @Path("/supplier" + PATH_ID)
  void deleteSupplier(@PathParam(ID) Integer id, MethodCallback<Supplierdto> result);
}
