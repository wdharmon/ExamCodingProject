package com.cisc181.core;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person implements Serializable
{
  private Date DOB;
  private String FirstName;
  private String MiddleName;
  private String LastName;
  private String address;
  private String phone_number;
  private String email_address;
  
  public String getFirstName()
  {
    return FirstName;
  }
  
  public void setFirstName(String FirstName) {
    this.FirstName = FirstName;
  }
  
  public String getMiddleName() {
    return MiddleName;
  }
  
  public void setMiddleName(String MiddleName) {
    this.MiddleName = MiddleName;
  }
  
  public String getLastName() {
    return LastName;
  }
  
  public void setLastName(String LastName) {
    this.LastName = LastName;
  }
  
  public Date getDOB() {
    return DOB;
  }
  
  public void setDOB(Date DOB) throws PersonException {
    this.DOB = DOB;
    if (PrintAge() > 100) {
      throw new PersonException("DOB Not In Range", this);
    }
  }
  

  public void setAddress(String newAddress)
  {
    address = newAddress;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setPhone(String newPhone_number) throws PersonException {
    List<String> phoneNumbers = new ArrayList();
    phoneNumbers.add("1234567890");
    phoneNumbers.add("123-456-7890");
    phoneNumbers.add("123.456.7890");
    phoneNumbers.add("123 456 7890");
    phoneNumbers.add("(123) 456 7890");
    

    phoneNumbers.add("12345678");
    phoneNumbers.add("12-12-111");
    
    String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
    
    Pattern pattern = Pattern.compile(regex);
    
    for (String phone_number : phoneNumbers)
    {
      Matcher matcher = pattern.matcher(phone_number);
      

      if (matcher.matches())
      {
        System.out.println(matcher.replaceFirst("($1) $2-$3"));
      }
    }
  }
  
  public String getPhone() {
    return phone_number;
  }
  
  public void setEmail(String newEmail) {
    email_address = newEmail;
  }
  
  public String getEmail() {
    return email_address;
  }
  





  public Person() {}
  




  public Person(String FirstName, String MiddleName, String LastName, Date DOB, String Address, String Phone_number, String Email)
    throws PersonException
  {
    this.FirstName = FirstName;
    this.MiddleName = MiddleName;
    this.LastName = LastName;
    setDOB(DOB);
    address = Address;
    setPhone(Phone_number);
    email_address = Email;
  }
  
  public void PrintName()
  {
    System.out.println(FirstName + ' ' + MiddleName + ' ' + 
      LastName);
  }
  
  public void PrintDOB() {
    System.out.println(DOB);
  }
  
  public int PrintAge() {
    Calendar today = Calendar.getInstance();
    Calendar birthDate = Calendar.getInstance();
    
    int age = 0;
    birthDate.setTime(DOB);
    if (birthDate.after(today)) {
      throw new IllegalArgumentException("Can't be born in the future");
    }
    age = today.get(1) - birthDate.get(1);
    



    if ((birthDate.get(6) - today.get(6) > 3) || 
      (birthDate.get(2) > today.get(2))) {
      age--;


    }
    else if (birthDate.get(2) == today.get(2))
    {
      if (birthDate.get(5) > today.get(5)) {
        age--;
      }
    }
    System.out.println("age is " + age);
    
    return age;
  }
}