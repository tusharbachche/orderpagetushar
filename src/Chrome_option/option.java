package Chrome_option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class option {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("disable-infobars");
		opt.addArguments("---incognito");
		//opt.addArguments("--headless");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://paytm.com/");
		
		
			}
	}


