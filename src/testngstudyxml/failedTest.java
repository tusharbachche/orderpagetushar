package testngstudyxml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failedTest {
  
 
	  @Test
	  public void a() {
		  //Assert.fail();
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
		 // Assert.fail();
		  Reporter.log("test d is running", true);
	  }
  }

