package com.jdevbook.chap6.model;
import javax.ejb.EJBLocalObject;

public interface DateEJBLocal extends EJBLocalObject 
{
  String getCurrentTime();
}