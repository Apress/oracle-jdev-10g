package com.jdevbook.chap6.ejbapp;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import com.jdevbook.chap6.ejbapp.StudentCourseEJB;
import com.jdevbook.chap6.ejbapp.StudentCourseEJBHome;
import javax.naming.NamingException;

public class StudentCourseEJBClient 
{
  public static void main(String [] args)
  {
    StudentCourseEJBClient studentCourseEJBClient = new StudentCourseEJBClient();
    try
    {
      Context context = getInitialContext();
      StudentCourseEJBHome studentCourseEJBHome = (StudentCourseEJBHome)PortableRemoteObject.narrow(context.lookup("StudentCourseEJB"), StudentCourseEJBHome.class);
      StudentCourseEJB studentCourseEJB;

      // Use one of the create() methods below to create a new instance
      studentCourseEJB = studentCourseEJBHome.create();

      // Call any of the Remote methods below to access the EJB
      
      studentCourseEJB.newCourse( "11", "J2EE" );
      studentCourseEJB.newStudent( "333", "Boris Becker", "11" );
      
      System.out.println("New Course and Student inserted");

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