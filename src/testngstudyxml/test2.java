package testngstudyxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
  
  @Test
  public void f() {
	  Reporter.log("test a is running", true);
  }
  @Test
  public void i()
  {
	  Reporter.log("test b is running", true);
  }
  @Test
  public void j()
  {
	  Reporter.log("test c is running", false);
  }
  public void k()
  {
	  Reporter.log("test d is running", true);
  }
  }

