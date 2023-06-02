package TESTNGCBtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	
		
		
	  System.setProperty("webdriver.gecko.driver","D:\\tusharbachche\\chromedriver_win32\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	driver.get("https://paytm.com/");
		
  }
}
