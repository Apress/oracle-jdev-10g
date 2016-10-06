package com.jdevbook.chap6.ejbapp;
import javax.ejb.EJBLocalHome;
import javax.ejb.CreateException;
import javax.ejb.FinderException;
import java.util.Collection;

public interface CourseLocalHome extends EJBLocalHome 
{
  CourseLocal create() throws CreateException;

  CourseLocal findByPrimaryKey(Long primaryKey) throws FinderException;

  Collection findAll() throws FinderException;

  CourseLocal create(Long courseId) throws CreateException;
}