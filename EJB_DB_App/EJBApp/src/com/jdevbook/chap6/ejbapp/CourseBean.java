package com.jdevbook.chap6.ejbapp;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import java.util.Collection;

public abstract class CourseBean implements EntityBean 
{
  private EntityContext context;

  public Long ejbCreate()
  {
    return null;
  }

  public void ejbPostCreate()
  {
  }

  public Long ejbCreate(Long courseId)
  {
    setCourseId(courseId);
    return courseId;
  }

  public void ejbPostCreate(Long courseId)
  {
  }

  public void ejbActivate()
  {
  }

  public void ejbLoad()
  {
  }

  public void ejbPassivate()
  {
  }

  public void ejbRemove()
  {
  }

  public void ejbStore()
  {
  }

  public void setEntityContext(EntityContext ctx)
  {
    this.context = ctx;
  }

  public void unsetEntityContext()
  {
    this.context = null;
  }

  public abstract Long getCourseId();

  public abstract void setCourseId(Long newCourseId);

  public abstract String getCourseName();

  public abstract void setCourseName(String newCourseName);

  public abstract Collection getStudent_courseId();

  public abstract void setStudent_courseId(Collection newStudent_courseId);
}