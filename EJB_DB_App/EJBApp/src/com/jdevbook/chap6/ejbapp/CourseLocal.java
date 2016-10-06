package com.jdevbook.chap6.ejbapp;
import javax.ejb.EJBLocalObject;
import java.util.Collection;

public interface CourseLocal extends EJBLocalObject 
{
  Long getCourseId();

  String getCourseName();

  void setCourseName(String newCourseName);

  Collection getStudent_courseId();

  void setStudent_courseId(Collection newStudent_courseId);
}