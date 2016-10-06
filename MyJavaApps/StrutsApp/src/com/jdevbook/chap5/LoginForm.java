package com.jdevbook.chap5;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class LoginForm extends ActionForm 
{
  private String userId;
  private String password;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    //return super.validate(mapping, request);
      ActionErrors actErrors= new ActionErrors();
      if(userId==null || "".equals(userId))
      {
          actErrors.add("userId", new ActionError("error.userid"));
      }
      if(password == null || "".equals(password))
      {
          actErrors.add("password", new ActionError("error.password"));
      }
      return actErrors;
  }

  public String getUserId()
  {
    return userId;
  }

  public void setUserId(String newUserId)
  {
    userId = newUserId;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String newPassword)
  {
    password = newPassword;
  }
  
}