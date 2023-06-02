package testngkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priroty {
  @Test(priority=-4)
  public void b() {
	  Reporter.log("test B is running", true);
  }
  @Test(priority=-3)
  public void c()
  {
	  Reporter.log("test c is running", true);
  }
  @Test
  public void a()
  {
	  Reporter.log("test a is running", false);
  }
}
