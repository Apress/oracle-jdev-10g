package com.jdevbook.chap6.ejbapp;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.naming.NamingException;
import javax.ejb.FinderException;

public interface StudentCourseEJB extends EJBObject 
{
  void newCourse(String courseId, String courseName) throws RemoteException, CreateException, NamingException;

  void newStudent(String studentId, String studentName, String courseId) throws RemoteException, CreateException, FinderException, NamingException;
}