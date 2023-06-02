package POMClassesusingTestNGClassWithDDF;

import org.testng.annotations.Test;
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
	
  @Test
  public void ValidateUserName()
  {
	  String expectedUserName=mysheet.getRow(1).getCell(0).getStringCellValue();
	  String actualuserName=dash.getActualUserName();
	  Assert.assertEquals(actualuserName,expectedUserName, "actual user name and expected are not matching");
  }
  @BeforeMethod
  public void loginToNeostox() throws InterruptedException
  {
	  home.clickOnSignInButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
      signin.entermobileNumber(mysheet.getRow(0).getCell(0).getStringCellValue());
      signin.signinclick();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      
      pwd.enterpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
      Thread.sleep(100);
      pwd.clickOnsubmitButton();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      dash.handlePopUp();
      



  }

  @AfterMethod
  public void LogoutFromNeostox() throws InterruptedException 
  {
	  Thread.sleep(1000);
	  dash.logOutFromNeoStox();
  }

  @BeforeClass
  public void launchNeostoxApp() throws EncryptedDocumentException, IOException, InterruptedException 
  {
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
  public void closeBrowser() throws InterruptedException 
  {
	 driver.close();
	 Thread.sleep(100);
	  
  }
  

}
