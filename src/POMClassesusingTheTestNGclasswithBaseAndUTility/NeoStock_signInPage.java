package POMClassesusingTheTestNGclasswithBaseAndUTility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStock_signInPage {
@FindBy (xpath=("(//input[@type='number'])[1]")) private WebElement mobileNumberField;
@FindBy(xpath=("//a[@id='lnk_signup1']")) private WebElement signinclick;
public NeoStock_signInPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void entermobileNumber(String mobNumber)
//paramertrised method value given at calling time
{
	mobileNumberField.sendKeys(mobNumber);
	Reporter.log("Entering mobilenumber", true);
}
public void signinclick()
{
	signinclick.click();
	Reporter.log("Clicking on sign in button", true);
}
}
