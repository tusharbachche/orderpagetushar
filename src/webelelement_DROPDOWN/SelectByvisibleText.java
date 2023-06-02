package webelelement_DROPDOWN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByvisibleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(10000);
		WebElement day = driver.findElement(By.id("day"));
		Select s=new  Select(day);
		s.selectByVisibleText("12");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(5);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2=new Select(year);
		s2.selectByValue("2010");
		

	}

}