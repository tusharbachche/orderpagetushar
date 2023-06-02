package POMClaseses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NeoStoxTestclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ops=new ChromeOptions ();
		ops.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		NeoStox_HomePage home=new NeoStox_HomePage(driver);
		home.ClickOnSignInbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStox_SignInPage signin=new NeoStox_SignInPage(driver);
		signin.entermobileNumber ();
		signin.clickonSignInbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxPasswordPage pass=new NeoStoxPasswordPage(driver);
		pass.enterpassword ();
		pass.clickOnsubmitButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxsDashbordPage dash=new NeoStoxsDashbordPage (driver);
		dash. handlePopUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		dash.logOutFromNeoStox();
		
		
	}

}
