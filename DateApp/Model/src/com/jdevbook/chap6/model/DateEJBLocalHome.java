package com.jdevbook.chap6.model;
import javax.ejb.EJBLocalHome;
import javax.ejb.CreateException;

public interface DateEJBLocalHome extends EJBLocalHome 
{
  DateEJBLocal create() throws CreateException;
}