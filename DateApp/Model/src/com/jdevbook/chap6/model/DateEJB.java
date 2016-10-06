package com.jdevbook.chap6.model;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface DateEJB extends EJBObject 
{
  String getCurrentTime() throws RemoteException;
}