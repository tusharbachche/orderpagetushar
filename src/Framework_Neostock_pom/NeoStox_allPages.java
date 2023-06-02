package Framework_Neostock_pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStox_allPages {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		Neostock_HomePage home= new Neostock_HomePage (driver);
		home.clickOnSignInButton();
		NeoStock_signInPage userid=new NeoStock_signInPage(driver);
		userid.sendkeys();
		userid.signinclick();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeostockPasswordPage password=new NeostockPasswordPage (driver);
		password.enterpassword();
		password.clickOnsubmitButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		NeoStoxDashbordPage dashbord= new NeoStoxDashbordPage(driver);
		dashbord.handlePopUp();
		dashbord.validateUserName();
		dashbord.logOutFromNeoStox();
		driver.close();
	}

}
