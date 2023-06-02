package webelelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_keys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
				WebDriver driver=(WebDriver) new ChromeDriver();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver.findElement(By.id("email")).sendKeys("bachchetushar@gmai.com");
				Thread.sleep(2000);
				driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("bachchetushar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Rutuja@99");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
		
		
	
				
					}

	}


