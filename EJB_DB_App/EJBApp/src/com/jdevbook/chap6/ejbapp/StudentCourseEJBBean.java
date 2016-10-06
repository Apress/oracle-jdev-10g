package com.jdevbook.chap6.ejbapp;
import javax.ejb.*;
import javax.naming.*;
import javax.naming.NamingException;

public class StudentCourseEJBBean implements SessionBean 
{
  public void ejbCreate()
  {
  }

  public void ejbActivate()
  {
  }

  public void ejbPassivate()
  {
  }

  public void ejbRemove()
  {
  }

  public void setSessionContext(SessionContext ctx)
  {
  }
  public void newStudent(String studentId, String studentName, String courseId)
    throws CreateException, FinderException, NamingException
  {
    //Get Local Home reference
    StudentLocalHome stLocHome= getStudentLocalHome();
    //Create new Student
    StudentLocal stLoc= stLocHome.create(new Long(studentId));
    //Set Student Name
    stLoc.setStudentName(studentName);
    
    //Get Course Local Home Reference
    CourseLocalHome courseLocHome= getCourseLocalHome();
    //Find Course By Id
    CourseLocal courLoc= courseLocHome.findByPrimaryKey(new Long(courseId));
    //Set Course For Student
    stLoc.setCourse_courseId(courLoc);
  }

  public void newCourse(String courseId, String courseName)
    throws NamingException, CreateException
  {
    //Get Course Local Home Reference
    CourseLocalHome coursLocHome= getCourseLocalHome();
    //Create New Course
    CourseLocal courLoc= coursLocHome.create(new Long(courseId));
    //Set Course Name
    courLoc.setCourseName(courseName);
  }

  private CourseLocalHome getCourseLocalHome() throws NamingException
  {
    final InitialContext context = new InitialContext();
    return (CourseLocalHome)context.lookup("java:comp/env/ejb/local/Course");
  }

  private StudentLocalHome getStudentLocalHome() throws NamingException
  {
    final InitialContext context = new InitialContext();
    return (StudentLocalHome)context.lookup("java:comp/env/ejb/local/Student");
  }
}