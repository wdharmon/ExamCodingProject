package com.cisc181.core;

import java.util.UUID;

public class Enrollment
{
  UUID SectionID = UUID.randomUUID();
  UUID StudentID = UUID.randomUUID();
  UUID EnrollmentID = UUID.randomUUID();
  
  double Grade;
  

  public Enrollment(UUID StudentID, UUID SectionID)
  {
    EnrollmentID = this.EnrollmentID;
  }
  
  private void setGrade(double grade)
  {
    Grade = grade;
  }
}
