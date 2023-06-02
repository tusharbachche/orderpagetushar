package testngAssertverification;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
  @Test
  public void f() {
	  String a="abc";
	  String b="abc";
	  SoftAssert soft=new SoftAssert();
	  soft.assertNull(a, "a is null test case failed");
	  soft.assertNotEquals(a ,b, " a and b are equal test case is failed");
	  soft.assertAll();
  }
}
