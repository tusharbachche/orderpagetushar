package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import neostoxBase.Base;

public class Mytesting {
  @Test
  public void A()
  {
	  Reporter.log("TC A is running", true);
  }
  @Test
  public void B()
  { 
	  Assert.fail();
	  Reporter.log("Tc B is running", true);
	  
  }
  @Test(dependsOnMethods="B")
  public void C()
  {
	  Reporter.log("Tc c is running", true);
	  
  }
}
