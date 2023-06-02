package testngkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
  @Test(timeOut=500)
  public void testing() throws InterruptedException {
	  Thread.sleep(100);
	  Reporter.log("TC testing is running", true);
  }
}
