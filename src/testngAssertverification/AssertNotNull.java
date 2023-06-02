package testngAssertverification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void f() {
	  String a=null;
	  Assert.assertNotNull(a, "a value is not null,Tc is failed");
  }
  
}
