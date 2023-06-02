package webelelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getdisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		driver.findElement(By.id("show-textbox")).click();
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		
			textbox.sendKeys("good morning");
			textbox.clear();
			Thread.sleep(1000);
			driver.findElement(By.id("hide-textbox")).click();
			Thread.sleep(1000);
			if(textbox.isDisplayed())
			{
				textbox.sendKeys("hello");
				
			}
			else
			{
				driver.findElement(By.id("show-textbox")).click();
				WebElement textbox1 = driver.findElement(By.id("displayed-text"));
				textbox1.sendKeys("bye");
			}
		
		
	}

}
