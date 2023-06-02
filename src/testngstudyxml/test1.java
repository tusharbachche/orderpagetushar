package testngstudyxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
  
 
	  @Test
	  public void a() {
		  Reporter.log("test a is running", true);
	  }
	  @Test
	  public void b()
	  {
		  Reporter.log("test b is running", true);
	  }
	  @Test
	  public void c()
	  {
		  Reporter.log("test c is running", false);
	  }
	  @Test
	  public void d()
	  {
		  Reporter.log("test d is running", true);
	  }
  }

