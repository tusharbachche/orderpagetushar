package POMClaseses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStox_SignInPage {
	@FindBy (xpath=("(//input[@type='number'])[1]")) private WebElement mobileNumberField;
	@FindBy(xpath=("//a[@id='lnk_signup1']")) private WebElement signinclick;
	public NeoStox_SignInPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void entermobileNumber ()
	{
		mobileNumberField.sendKeys("7972292578");
	}
	public void clickonSignInbutton ()
	{
		signinclick.click();
	}

}
