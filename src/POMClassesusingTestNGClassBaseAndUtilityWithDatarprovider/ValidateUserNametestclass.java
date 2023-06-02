package POMClassesusingTestNGClassBaseAndUtilityWithDatarprovider;

import org.testng.annotations.Test;


import neostoxBase.Base;
import utility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
@Listeners(POMClassesusingTestNGClassBaseAndUtilityWithDatarprovider.listener.class)

public class ValidateUserNametestclass extends Base {
	
	Neostock_HomePage home;
	NeoStock_signInPage signin;
	NeostockPasswordPage pass;
	NeoStoxDashbordPage dash;
	
  @Test(dataProvider="LogindetailsValidateuserName")
  public void ValidateUserNameNeostox  (String mobnumber,String password,String username) throws IOException, InterruptedException {
	  home.clickOnSignInButton();
	  Utility.implicitWait(1000, driver);
	  signin.entermobileNumber(mobnumber);
	  Thread.sleep(1000);
	  signin.signinclick();
	  Utility.implicitWait(1000, driver);
	  pass.enterpassword(password);
	  pass.clickOnsubmitButton();
	  Utility.implicitWait(1000, driver);
	  dash.handlePopUp(driver);
	  
	  Assert.assertEquals(dash.getActualUserName(), username ,"actualand expected user name not matching tc failed");
	  
	  dash.logOutFromNeoStox();
  }
  @Test(dataProvider="LogindetailsValidateAccountBalance")
  public void ValidateaccountBalance (String mobnumber, String Password) throws IOException, InterruptedException
  
  {home.clickOnSignInButton();
  Utility.implicitWait(1000, driver);
  signin.entermobileNumber(mobnumber);
  Thread.sleep(1000);
  signin.signinclick();
  Utility.implicitWait(1000, driver);
  pass.enterpassword(Password);
  pass.clickOnsubmitButton();
  Utility.implicitWait(1000, driver);
  dash.handlePopUp(driver);
	  
	  Assert.assertNotNull(dash.getaccountbalance(), "Account balance is NUll,TC is Failed");
	  
	  dash.logOutFromNeoStox();
	  
  }
  @BeforeMethod
  public void LoginToNeostox() throws IOException, InterruptedException 
  {
	  louchbrowser ();
	  home=new Neostock_HomePage(driver);
	  signin=new NeoStock_signInPage(driver);
	   pass= new  NeostockPasswordPage(driver);
	   dash= new NeoStoxDashbordPage(driver);
  }

  @AfterMethod
  public void LogOutFromNeostox() throws InterruptedException {
	  driver.close();
	  Reporter.log("closing application", true);
      Thread.sleep(1000);
	  
  }
  @DataProvider(name="LogindetailsValidateuserName")
  public String[][] getLoginDetailts1()
  {
	  String[][] userdata= {{"9545399487","2595","Hi Tushar Bachche"},{"8208893597","1626","Hi tushar bachche"}};
	  return userdata;
  }
  
@DataProvider(name="LogindetailsValidateAccountBalance")
public  String[] [] getLogindetails2()
{
	String [][]userdata= {{"9545399487","2595"},{"8208893597","1626"}};
	return userdata;
}
 


}
