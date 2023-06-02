package TESTNGCBtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cbtesting {
	@Parameters("browserName")
	
  @Test
  
  public void cbtest (String bname) throws InterruptedException {
	
		ChromeOptions ops=new ChromeOptions ();
		ops.addArguments("--remote-allow-origins=*");
		
	  WebDriver driver = null;
	  if(bname.equals("Chrome"))
	  {	  
	  System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	 driver=new ChromeDriver(ops);
  }
	  else if (bname.equals("Firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\tusharbachche\\chromedriver_win32\\geckodriver.exe");
		  driver=new FirefoxDriver();
			driver.get("https://paytm.com/");
			
	  }
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
}
}