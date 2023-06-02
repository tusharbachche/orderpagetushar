package webelelement_DROPDOWN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleselected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		Thread.sleep(1000);
		WebElement fruits = driver.findElement(By.id("fruits"));
	Select s=new Select(fruits);
	s.selectByValue("banana");
	Thread.sleep(100);
	s.selectByVisibleText("Orange");
	Thread.sleep(100);
	s.selectByIndex(3);
	Thread.sleep(100);
	s.deselectByIndex(3);
	Thread.sleep(100);
	s.deselectByVisibleText("Orange");
	Thread.sleep(100);
	s.deselectByValue("banana");
		
	}

}
