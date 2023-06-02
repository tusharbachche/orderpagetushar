package POMClassesusingTheTestNGclasswithBaseAndUTility;

import org.testng.annotations.Test;

import POMClassesusingTestNGclasswithBaseAndUtilityPropertyFiles.NeoStock_signInPage;
import POMClassesusingTestNGclasswithBaseAndUtilityPropertyFiles.NeoStoxDashbordPage;
import POMClassesusingTestNGclasswithBaseAndUtilityPropertyFiles.NeostockPasswordPage;
import POMClassesusingTestNGclasswithBaseAndUtilityPropertyFiles.Neostock_HomePage;
import neostoxBase.Base;
import utility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateUserName extends Base{

	Neostock_HomePage home;
	NeoStock_signInPage signin;
	NeostockPasswordPage pass;
	NeoStoxDashbordPage dash;
	String s="TCID-1919";
	
	
  @Test
  public void ValidateNeosstoxUserName() throws EncryptedDocumentException, IOException {
	  
	  Assert.assertEquals(dash.getActualUserName(), Utility.readDataFromExcell(0, 2),"Actaual userName and expecteduser name not matching TC failed");
  
       Utility.takesScreenshot(driver, s);
  }
  @BeforeMethod
  public void LoginToNeostox() throws InterruptedException, EncryptedDocumentException, IOException {
	  
	  
	  home.clickOnSignInButton();
	    Utility.implicitWait(1000, driver);
      signin.entermobileNumber(Utility.readDataFromExcell(0, 0));
       signin.signinclick();
       Utility.implicitWait(1000, driver);
       pass.enterpassword(Utility.readDataFromExcell(0, 1));
       Thread.sleep(100);
        pass.clickOnsubmitButton();
        Utility.implicitWait(1000, driver);
        dash.handlePopUp(driver);
        Utility.implicitWait(1000, driver);
  }

  @AfterMethod
  public void LogOutfromNeostox() throws InterruptedException {
	  dash.logOutFromNeoStox();
  }

  @BeforeClass
  public void launchNeostoxApp() throws IOException {
	  
	       louchbrowser ();
	       home=new Neostock_HomePage(driver);
	       signin=new NeoStock_signInPage(driver);
	       pass= new  NeostockPasswordPage(driver);
	       dash= new NeoStoxDashbordPage(driver);
  }

  @AfterClass
  public void CloseBrowser() throws InterruptedException {
	  driver.close();
	  Thread.sleep(1000);
  }

}
