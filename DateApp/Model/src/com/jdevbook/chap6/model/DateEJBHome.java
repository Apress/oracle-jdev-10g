package com.jdevbook.chap6.model;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;
import javax.ejb.CreateException;

public interface DateEJBHome extends EJBHome 
{
  DateEJB create() throws RemoteException, CreateException;
}