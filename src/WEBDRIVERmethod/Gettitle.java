package WEBDRIVERmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		
		driver.get("https://paytm.com/");
			
			Thread.sleep(1000);
	String Title=driver.getTitle();
	System.out.println("Title is"+Title);
	driver.get("https:www.google.com/");
	String url=driver.getCurrentUrl();
	System.out.println("Url is "+url);
	
		
	
			}

	}
