package com.jdevbook.chap6.ejbapp;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;
import javax.ejb.CreateException;

public interface StudentCourseEJBHome extends EJBHome 
{
  StudentCourseEJB create() throws RemoteException, CreateException;
}