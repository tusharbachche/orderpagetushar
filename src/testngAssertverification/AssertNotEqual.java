package testngAssertverification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqual {
  @Test
  public void f() {
	  String a="abc";
	  String b="abcd";
	  Assert.assertNotEquals(a, b,"Assert are equal therefore test case fail");
	  
  }
}
