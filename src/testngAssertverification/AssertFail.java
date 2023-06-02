package testngAssertverification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void f() {
	  Assert.fail();
	  Reporter.log("hi  good evrening", true);
  }
}
