package testngkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethod {
  @Test(enabled = false)
  public void b() 
  {
	  Reporter.log("tc a is running", true);
  }
  @Test(dependsOnMethods= {"b"})
  public void a()
  {
	  Reporter.log("Tc a is running", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("test c is running", false);
  }
}

