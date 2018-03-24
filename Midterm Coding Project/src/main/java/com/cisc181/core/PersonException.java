package com.cisc181.core;

public class PersonException extends Exception {
  private Person person;
  
  public PersonException(String x, Person person) { 
	super(x);
    this.person = person;
  }
  
  public Person getPerson() { 
	  return person; 
	  }
  
  public void setPerson(Person person) {
    this.person = person;
  }
}

