package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://neostox.com/");
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("8208893597");
		Thread.sleep(1000);
		driver.findElement(By.id("lnk_signup1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_accesspin")).sendKeys("3108");
		driver.findElement(By.xpath("//a[text ()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
		Thread.sleep(1000);
		String actualtext = driver.findElement(By.id("lbl_username")).getText();
		System.out.println(actualtext);
		String expectedtext="Hi tushar bachche";
		if(actualtext.equals(expectedtext))
		{
			System.out.println("correct username");
		}
		else {
			System.out.println("incorrect username");
		}
  }
}
