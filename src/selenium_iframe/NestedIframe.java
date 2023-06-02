package selenium_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		 driver.findElement(By.tagName("input")).sendKeys("Hi");
		 Thread.sleep(100);
		 driver.switchTo().frame("frame3");
		 driver.findElement(By.xpath("//input[@id='a']")).click();
		 driver.switchTo().defaultContent();
		 Thread.sleep(100);
		 driver.switchTo().frame("frame2");
		WebElement Animals = driver.findElement(By.id("animals"));
		Thread.sleep(1000);
		Select s =new Select(Animals);
		s.selectByValue("avatar");
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(text);
			}
	


}