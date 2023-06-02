package webelelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextforlinkbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String text = driver.findElement(By.xpath("//button[@type='submit']")).getText();
		System.out.println(text);
		
		

	
		
			}
	}


