package com.jdevbook.chap6.model;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import com.jdevbook.chap6.model.DateEJB;
import com.jdevbook.chap6.model.DateEJBHome;
import javax.naming.NamingException;

public class DateEJBClient 
{
  public static void main(String [] args)
  {
    DateEJBClient dateEJBClient = new DateEJBClient();
    try
    {
      Context context = getInitialContext();
      DateEJBHome dateEJBHome = (DateEJBHome)PortableRemoteObject.narrow(context.lookup("DateEJB"), DateEJBHome.class);
      DateEJB dateEJB;

      // Use one of the create() methods below to create a new instance
      dateEJB = dateEJBHome.create();

      // Call any of the Remote methods below to access the EJB
      System.out.println("Date & Time >>>"+ dateEJB.getCurrentTime(  ));

    }
    catch(Throwable ex)
    {
      ex.printStackTrace();
    }

  }

  private static Context getInitialContext() throws NamingException
  {
    // Get InitialContext for Embedded OC4J.
    // The embedded server must be running for lookups to succeed.
    return new InitialContext();
  }
}