package testngAssertverification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class isselected {
  @Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='Radio4']"));
		Assert.assertTrue(radiobutton.isSelected(), "RadioButton not  selected therefore Tc is Failed");
  }
}
