package webelelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		
WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
boolean results=getOTPButton.isEnabled();
System.out.println("result is "+results);
//getOTPButton.click();
driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8208893597");
Thread.sleep(1000);
if(getOTPButton.isEnabled())
{
	boolean result=getOTPButton.isEnabled();
	System.out.println("current status is "+result);
	getOTPButton.click();
}
else
{
	System.out.println("OTP is not Enabled");
}
	}

}
