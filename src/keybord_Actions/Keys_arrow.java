package keybord_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_arrow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id, 'u_0_0_')]")).click();
		Thread.sleep(1000);
		Actions act =new Actions (driver);
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		
		//act.click(day).perform();
		act.click(day).sendKeys(day, Keys.ENTER).build().perform();
		
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(500);
	//	act.sendKeys(Keys.ARROW_DOWN).perform();
	//	Thread.sleep(500);
	//	act.sendKeys(Keys.ENTER).perform();
		for(int i=1;i<=8;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		act.sendKeys(Keys.ENTER).perform();
	}

}
