package com.cisc181.core;

import com.cisc181.eNums.eMajor;
import java.io.PrintStream;
import java.util.Date;
import java.util.UUID;

public class Student extends Person
{
  private UUID StudentID;
  private eMajor eMajor;
  
  public eMajor geteMajor()
  {
    return eMajor;
  }
  
  public void seteMajor(eMajor eMajor) {
    this.eMajor = eMajor;
  }
  
  public UUID getStudentID() {
    return StudentID;
  }
  
  public Student(String FirstName, String MiddleName, String LastName, Date DOB, String Major, String Address, String Phone_number, String Email)
    throws PersonException
  {
    super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
    StudentID = UUID.randomUUID();
  }
  


  public void PrintName()
  {
    System.out.println(getLastName() + "," + getFirstName() + ' ' + getMiddleName());
  }
  
  public void PrintName(boolean bnormal)
  {
    super.PrintName();
  }
}
