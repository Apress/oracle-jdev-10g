package com.jdevbook.chap6.model;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class DateEJBBean implements SessionBean 
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

  public String getCurrentTime()
  {
    return "" + new java.util.Date();
  }
}