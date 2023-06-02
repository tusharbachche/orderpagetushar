package testngAssertverification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void f() {
	  boolean a= false;
	  Assert.assertFalse(a,"a value is not false ,Tc is failed");
  }
}
