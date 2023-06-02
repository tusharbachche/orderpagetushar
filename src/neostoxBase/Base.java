package neostoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import utility.Utility;

public class Base {
	protected static WebDriver driver;
	public void louchbrowser () throws IOException
	{
		  ChromeOptions ops=new ChromeOptions ();
			ops.addArguments("--remote-allow-origins=*");
			
			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			 driver=new ChromeDriver(ops);
			 driver.manage().window().maximize();
			// driver.get("https://neostox.com/");
			 driver.get(Utility.readDatafromPropertyFile("Url"));
			 
			 Utility.implicitWait(1000, driver);
			 
			 Reporter.log("launching browser", true);
			 
			 //comment1
	}
	 

}
