package WEBDRIVERmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

        driver.get("https://paytm.com/");
         Thread.sleep(1000);
         driver.manage().window().minimize();
         driver.manage().window().maximize();

	}

}
