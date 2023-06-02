package keybord_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBord_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		 WebElement button = driver.findElement(By.xpath("//a[contains(@id, 'u_0_0')]"));
		 
	
		
		Actions act=new Actions (driver);
		act.click(button).perform();
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		//act.sendKeys(firstname, "Tushar").perform();
		
		Thread.sleep(500);
		
		act.keyDown(firstname, Keys.SHIFT).sendKeys("y").keyUp(Keys.SHIFT).sendKeys("ogendra").build().perform();
	}

}
