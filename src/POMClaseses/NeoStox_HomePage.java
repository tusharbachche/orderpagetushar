package POMClaseses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStox_HomePage {
	@FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement signInButton;
	
	public NeoStox_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void  ClickOnSignInbutton()
	{
		 signInButton.click();
	}

}
