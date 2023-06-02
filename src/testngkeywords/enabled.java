package testngkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
  @Test
  public void b() 
  {
	 Reporter.log("String b is running", true); 
  }
  
	  @Test(enabled = false)
	  public void d() 
	  {
		  Reporter.log(null, false);
	  }
	  @Test(priority=-3)
	  public void c()
	  {
		  Reporter.log("test c is running", true);
	  }
	  @Test
	  public void a()
	  {
		  Reporter.log("test a is running", false);
	  }
  }

