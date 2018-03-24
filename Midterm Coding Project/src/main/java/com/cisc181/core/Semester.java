package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester
{
  UUID SemesterID = UUID.randomUUID();
  Date StartDate = new Date();
  Date EndDate = new Date();
  
  public Semester() {}
}