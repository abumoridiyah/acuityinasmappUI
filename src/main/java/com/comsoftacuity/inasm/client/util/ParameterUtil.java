/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comsoftacuity.inasm.client.util;

import gwt.material.design.client.ui.MaterialToast;
import java.util.Date;

/**
 *
 * @author Yusuff Saliu Adediran
 */
public class ParameterUtil {
  public static Short ACTIVE =1;
  public static Integer ENTEREDBY=1;
  public static Date DATECREATED=new Date();
  public static String SAVEMESSAGE="Record Created Successfully";
  public static String UPDATEMESSAGE ="Record Updated Successfully";
  public static String DELETEMESSAGE="Record Deleted Successfully";
  public static String ERRORMESSAGE ="An Error Occur please contact the administrator";
  
  public static void printMessage(String message){
      MaterialToast.fireToast(message, "rounded");
  }
}
