package POMClassesusingTestNGclasswithBaseAndUtilityPropertyFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Utility;

public class NeoStoxDashbordPage {

	@FindBy(xpath=("(//a[text()='OK'])[2]")) private WebElement popupOkButton;
	
	@FindBy(xpath="//a[text()='Renew']") private WebElement newpopupOKButton;
	@FindBy(xpath=("(//span[text()='×'])[36]"))private WebElement warning;
	//@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement popupCloseButton;
	
	@FindBy(xpath="//span[@id='lbl_username']")private WebElement username;
	@FindBy(xpath="//span[@id='lbl_curbalancetop']")private WebElement acbalance;
	@FindBy( xpath="//span[text()='Logout']") private WebElement logOutButton;
	
	public NeoStoxDashbordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void handlePopUp(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		if(popupOkButton.isDisplayed())
		{
		
		
		Thread.sleep(500);
		Utility.scrollIntoView(driver , popupOkButton);
    	popupOkButton.click();
    	Reporter.log("clicking on popOkbutton", true);
		Thread.sleep(500);
		//popupCloseButton.click();
		
		newpopupOKButton.click();
		Thread.sleep(2000);
		Reporter.log("clicking on new popupOkbutton", true);
		driver.navigate().back();
		Thread.sleep(2000);
		warning.click();
		}
		
		else
		{
			
			
			Thread.sleep(1000);
			warning.click();
		}
		
		
	}
	public String getActualUserName() 
		
		
		{
			String actualUserName=username.getText();
			Reporter.log("getting actual user Name", true);
			Reporter.log("actual user name is "+actualUserName, true);
			return actualUserName;
		
		}
	public String getaccountbalance()
	
	{
		String acountbalance = acbalance.getText();
		return acountbalance;
	}
	public void logOutFromNeoStox() throws InterruptedException
	{
		username.click();
		Thread.sleep(1000);
		logOutButton.click();
		Reporter.log("Logging out from neostox", true);
	}


}

