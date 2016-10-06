package com.jdevbook.chap4;

public abstract class Vehicle 
{
  protected String color;
  protected String regcode;
  protected abstract void move();
  protected abstract void stop();
}