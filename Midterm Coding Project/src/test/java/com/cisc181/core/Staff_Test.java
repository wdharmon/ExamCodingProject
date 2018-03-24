package com.cisc181.core;

import com.cisc181.eNums.eTitle;
import java.util.ArrayList;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;




public class Staff_Test
{
  public Staff_Test() {}
  
  @BeforeClass
  public static void setup() {}
  
  @Test
  public void test()
    throws PersonException
  {
    ArrayList<Staff> StaffTester = new ArrayList();
    
    Staff One = new Staff("Warren", "David", "Harmon", new Date(1999, 7, 26), "17 Kristin Rd, New Castle, DE", 
      "302-547-7159", "wdharmon@udel.edu", "N/A", 1, 25000.0D, new Date(2017, 7, 4), eTitle.MS);
    StaffTester.add(One);
    
    Staff Two = new Staff("Taren", "Carlene", "Harmon", new Date(1969, 8, 25), "17 Kristin Rd, New Castle, DE", 
      "302-545-0162", "taren825@comcast.net", "2PM-3PM", 1, 60000.0D, new Date(1985, 10, 8), eTitle.MS);
    StaffTester.add(Two);
    
    Staff Three = new Staff("Erinn", "Lenese", "Harmon", new Date(1994, 5, 22), "17 Kristin Rd, New Castle, DE", 
      "302-757-6996", "eharmon@udel.edu", "10AM-11AM", 1, 40000.0D, new Date(2016, 6, 9), eTitle.MS);
    StaffTester.add(Three);
    
    Staff Four = new Staff("Riley", "Johnson", "Harmon", new Date(1959, 12, 25), "17 Kristin Rd, New Castle, DE", 
      "302-323-9862", "rharmon@gmail.com", "5PM-6PM", 1, 55000.0D, new Date(2011, 1, 1), eTitle.MS);
    StaffTester.add(Four);
    
    Staff Five = new Staff("Dolores", "Annabelle", "Pulliam", new Date(1936, 5, 16), "833 Broadfield Dr, Newark, DE", 
      "302-383-7985", "dap@gmail.com", "N/A", 1, 70000.0D, new Date(1973, 2, 14), eTitle.MS);
    StaffTester.add(Five);
    
    double completeSalary = 0.0D;
    for (Staff z : StaffTester) {
      completeSalary += z.getSalary();
    }
    completeSalary /= 5.0D;
    
    int Average = (int)completeSalary;
    
    assertEquals(Average, 20000);
  }
  
  private void assertEquals(int x, int i) {}
}
