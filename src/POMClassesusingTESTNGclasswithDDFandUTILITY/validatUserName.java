package POMClassesusingTESTNGclasswithDDFandUTILITY;

import org.testng.annotations.Test;

import utility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class validatUserName {
	WebDriver driver;
	Neostock_HomePage home;
	NeoStock_signInPage signin;
	NeostockPasswordPage pwd;
	NeoStoxDashbordPage dash;
	File myfile;
	Sheet mysheet;
	String s="TCID-1234";
	
  @Test
  public void ValidateUserName() throws EncryptedDocumentException, IOException {
	  Assert.assertEquals(dash.getActualUserName(), Utility.readDataFromExcell(1, 0),"actaul and expected usernames not match");
	  Utility.takesScreenshot(driver, s);
  }
  @BeforeMethod
  public void loginToNeostox() throws InterruptedException, EncryptedDocumentException, IOException {
	   
	    home.clickOnSignInButton();
	    Utility.implicitWait(1000, driver);
        signin.entermobileNumber(Utility.readDataFromExcell(0, 0));
         signin.signinclick();
         Utility.implicitWait(1000, driver);
         pwd.enterpassword(Utility.readDataFromExcell(0, 1));
         Thread.sleep(100);
          pwd.clickOnsubmitButton();
          Utility.implicitWait(1000, driver);
          dash.handlePopUp();
          Utility.implicitWait(1000, driver);
  


  }

  @AfterMethod
  public void LogoutFromNeostox() throws InterruptedException {
	  Thread.sleep(1000);
	  dash.logOutFromNeoStox();
  }

  @BeforeClass
  public void launchNeostoxApp() throws EncryptedDocumentException, IOException, InterruptedException {
	  ChromeOptions ops=new ChromeOptions ();
		ops.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		 driver=new ChromeDriver(ops);
		 driver.get("https://neostox.com/");
		home =new Neostock_HomePage(driver);
		signin=new NeoStock_signInPage(driver);
		pwd=new NeostockPasswordPage(driver);
		dash=new NeoStoxDashbordPage(driver);
	     myfile=new File("D:\\Tushar\\selenium-java-4.6.0\\selinium_sheet.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("sheet5");
		
	   
  }

  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  driver.close();
	  Thread.sleep(100);
	  
  }
  

}
