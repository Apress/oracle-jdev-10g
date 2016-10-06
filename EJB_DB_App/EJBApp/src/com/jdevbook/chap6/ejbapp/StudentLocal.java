package com.jdevbook.chap6.ejbapp;
import javax.ejb.EJBLocalObject;

public interface StudentLocal extends EJBLocalObject 
{
  Long getStudentId();

  String getStudentName();

  void setStudentName(String newStudentName);

  CourseLocal getCourse_courseId();

  void setCourse_courseId(CourseLocal newCourse_courseId);
}