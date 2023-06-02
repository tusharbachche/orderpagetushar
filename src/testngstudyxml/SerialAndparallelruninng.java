package testngstudyxml;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerialAndparallelruninng {
  @Test
  public void f() throws InterruptedException {	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/India");
	Thread.sleep(1000);
  }
}
