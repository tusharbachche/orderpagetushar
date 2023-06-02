package POMClassesusingTestNGclasswithBaseAndUtilityPropertyFiles;

import org.testng.annotations.Test;


import neostoxBase.Base;
import utility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
@Listeners(POMClassesusingTestNGclasswithBaseAndUtilityPropertyFiles.listener.class)

public class ValidateUserNametestclass extends Base {
	
	Neostock_HomePage home;
	NeoStock_signInPage signin;
	NeostockPasswordPage pass;
	NeoStoxDashbordPage dash;
	
  @Test
  public void ValidateUserNameNeostox  () throws IOException {
	  
	  Assert.assertEquals(dash.getActualUserName(), Utility.readDatafromPropertyFile("username"),"actualand expected user name not matching tc failed");
	  Utility.takesScreenshot(driver, Utility.readDatafromPropertyFile("TCID1"));
  }
  @Test
  public void ValidateaccountBalance () throws IOException
  {
	  
	  Assert.assertNotNull(dash.getaccountbalance(), "Account balance is NUll,TC is Failed");
	  Utility.takesScreenshot(driver, Utility.readDatafromPropertyFile("TCID2"));
  }
  @BeforeMethod
  public void LoginToNeostox() throws IOException, InterruptedException 
  {
	  home.clickOnSignInButton();
	  Utility.implicitWait(1000, driver);
	  signin.entermobileNumber(Utility.readDatafromPropertyFile("mobile"));
	  Thread.sleep(1000);
	  signin.signinclick();
	  Utility.implicitWait(1000, driver);
	  pass.enterpassword(Utility.readDatafromPropertyFile("password"));
	  pass.clickOnsubmitButton();
	  Utility.implicitWait(1000, driver);
	  dash.handlePopUp(driver);
  }

  @AfterMethod
  public void LogOutFromNeostox() throws InterruptedException {
	  dash.logOutFromNeoStox();
	  
  }

  @BeforeClass
  public void launchNeoStoxApp() throws IOException {
	  louchbrowser ();
	  home=new Neostock_HomePage(driver);
	  signin=new NeoStock_signInPage(driver);
	   pass= new  NeostockPasswordPage(driver);
	      dash= new NeoStoxDashbordPage(driver);
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  //driver.close();
	 Reporter.log("closing application", true);
	  Thread.sleep(1000);
  }

}
