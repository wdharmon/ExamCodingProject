package com.cisc181.core;

import com.cisc181.eNums.eTitle;
import java.util.Date;

public class Staff extends Employee
{
  private eTitle Title;
  
  public Staff(eTitle title)
  {
    Title = title;
  }
  
  public void setTitle(eTitle title) {
    Title = title;
  }
  
  public eTitle getTitle() { 
	  return Title; 
	  }
  
  public Staff(String FirstName, String MiddleName, String LastName, Date DOB, String Address, String Phone_number, String Email, String officeHours, int rank, double salary, Date hireDate, eTitle Title)
    throws PersonException
  {
    super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email, officeHours, salary, hireDate);
    
    this.Title = Title;
  }
}
