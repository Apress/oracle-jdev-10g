package com.jdevbook.chap6.ejbapp;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;

public abstract class StudentBean implements EntityBean 
{
  private EntityContext context;

  public Long ejbCreate()
  {
    return null;
  }

  public void ejbPostCreate()
  {
  }

  public Long ejbCreate(Long studentId)
  {
    setStudentId(studentId);
    return studentId;
  }

  public void ejbPostCreate(Long studentId)
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

  public abstract Long getStudentId();

  public abstract void setStudentId(Long newStudentId);

  public abstract String getStudentName();

  public abstract void setStudentName(String newStudentName);

  public abstract CourseLocal getCourse_courseId();

  public abstract void setCourse_courseId(CourseLocal newCourse_courseId);
}