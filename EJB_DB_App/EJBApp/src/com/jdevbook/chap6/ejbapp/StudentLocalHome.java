package com.jdevbook.chap6.ejbapp;
import javax.ejb.EJBLocalHome;
import javax.ejb.CreateException;
import javax.ejb.FinderException;
import java.util.Collection;

public interface StudentLocalHome extends EJBLocalHome 
{
  StudentLocal create() throws CreateException;

  StudentLocal findByPrimaryKey(Long primaryKey) throws FinderException;

  Collection findAll() throws FinderException;

  StudentLocal create(Long studentId) throws CreateException;
}