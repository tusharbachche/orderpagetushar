package webelelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
			Thread.sleep(2000);
			String actualtext = driver.findElement(By.xpath("//h1[contains(text(),'India')]")).getText();
			String expectedtext = "India's most-loved payment app";
			if(actualtext.equals(expectedtext))
				
			{
				System.out.println("Text is matching Tc is passed");
			}
			else
			{
				System.out.println("Text is not matching TC is failed");
			}
	}

}
