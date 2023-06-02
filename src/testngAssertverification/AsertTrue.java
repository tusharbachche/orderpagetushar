package testngAssertverification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsertTrue {
  @Test
  public void f() {
	  boolean a=true;
	  Assert.assertTrue(a, "a valueis not true ,Tc Failed");
  }
}
