package listenerStudy;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import neostoxBase.Base;

public class MyTesting2 {
  @Test
  public void p() {
	  Reporter.log("Tc p is running", true);
  }
  @Test
  public void Q()
  {
	  Assert.fail();
	  Reporter.log("Tc Q is running", true);
  }
  @Test (dependsOnMethods="Q")
  public void R()
  {
	  Reporter.log("Tc R is running" , true);
  }
}
