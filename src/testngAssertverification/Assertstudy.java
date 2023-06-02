package testngAssertverification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertstudy {
  @Test
  public void f() {
	  String a="abc";
	  String b="abc";
	  Assert.assertEquals(a, b," test case failed assert not equal");
  }
}
