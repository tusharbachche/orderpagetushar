package testngkeywords;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class InnovationCount {
  @Test(invocationCount=5)
  public void mytest() {
	  Reporter.log("my test is running", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("after method is running", true);
  }

}
