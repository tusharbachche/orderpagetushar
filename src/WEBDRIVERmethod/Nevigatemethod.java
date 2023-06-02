package WEBDRIVERmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigatemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
				WebDriver driver=(WebDriver) new ChromeDriver();
		
		        driver.get("https://paytm.com/");
		         Thread.sleep(1000);

				driver.navigate().to("https://www.facebook.com/");
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().forward();
				Thread.sleep(1000);
				driver.navigate().refresh();
				driver.quit();
				
				
					}

	}


