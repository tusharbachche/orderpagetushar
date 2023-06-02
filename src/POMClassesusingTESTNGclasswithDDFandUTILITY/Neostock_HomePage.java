package POMClassesusingTESTNGclasswithDDFandUTILITY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neostock_HomePage {
	@FindBy(xpath=("(//a[text()='Sign In'])[1]")) private WebElement signInButton;
	public  Neostock_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnSignInButton ()        
	{
		signInButton.click();
		
	}
}
