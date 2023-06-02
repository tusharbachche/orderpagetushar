package POMClassesusingTESTNGclasswithDDFandUTILITY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostockPasswordPage {
@FindBy(id="txt_accesspin")private WebElement  passwordField;
@FindBy(id="lnk_submitaccesspin") private WebElement submitButton;

public NeostockPasswordPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	
}

public void enterpassword(String password) {
	//paramertrised method value given at calling time
	passwordField.sendKeys(password);
}
public void clickOnsubmitButton() throws InterruptedException
{
	Thread.sleep(500);
	submitButton.click();
}
}