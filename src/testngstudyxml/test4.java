package testngstudyxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test4 {
  
  @Test
  public void f() {
	  Reporter.log("test f is running", true);
  }
  @Test(groups="sanity")
  public void i()
  {
	  Reporter.log("test i is running", true);
  }
  @Test
  public void j()
  {
	  Reporter.log("test j is running", true);
  }
  @Test(groups="Reg")
  public void k()
  {
	  Reporter.log("k is running", true);
  }
  }

