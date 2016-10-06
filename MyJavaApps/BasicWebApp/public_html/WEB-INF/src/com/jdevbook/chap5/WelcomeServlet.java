package com.jdevbook.chap5;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet 
{
  private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

  public void init(ServletConfig config) throws ServletException
  {
    super.init(config);
  }

  /**
   * Process the HTTP doGet request.
   */
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    /*
    First name
    */
    String strFname = "";
    /*
    Last name
    */
    String strLname = "";
    try
    {
      strFname = request.getParameter("fname");
      strLname = request.getParameter("lname");
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }

    response.setContentType(CONTENT_TYPE);
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>WelcomeServlet</title></head>");
    out.println("<body>");
    out.println("<p>The servlet has received a GET. This is the reply.</p>");
    //Use the First and Last name received as part of the request.
    out.println("<p>Welcome "+strFname+" "+strLname+"</p>");
    out.println("</body></html>");
    out.close();
  }
}