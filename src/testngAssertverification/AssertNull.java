package testngAssertverification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void f() {
	  String a="a";
	  Assert.assertNull(a, "a value is not null,Tc is failed");
  }
  
}
