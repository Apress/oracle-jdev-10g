package com.jdevbook.chap5;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;

public class LoginAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   * @return 
   * @throws IOException
   * @throws ServletException
   */
  public ActionForward execute(ActionMapping mapping
    , ActionForm form
    , HttpServletRequest request
    , HttpServletResponse response) throws IOException, ServletException
  {
      String userId=((LoginForm)form).getUserId();
      String password=((LoginForm)form).getPassword();    

      String accessFlag="NO";
    
      if("neo".equals(userId) && "trinity".equals(password) )
      {
          accessFlag="YES";
      }

      request.setAttribute("ACCESS", accessFlag);    
      return mapping.findForward("success");
  }
}