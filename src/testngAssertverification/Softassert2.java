package testngAssertverification;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert2 {
	SoftAssert soft= new SoftAssert();
  @Test
  public void f() {
	  boolean a=true;
	  boolean b=false;
	  soft.assertTrue(b, "b is false,tc is failed");
	  soft.assertFalse(a, " a is true,tc is failed");
	  soft.assertAll();
	  
  }
  @Test
  public void softassert() {
	  String a="abc";
	  String b="abc";
	  
	  soft.assertNull(a, "a is null test case failed");
	  soft.assertNotEquals(a ,b, " a and b are equal test case is failed");
	  soft.assertAll();
}
}
