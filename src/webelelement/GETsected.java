package webelelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETsected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='Radio4']"));
		//radiobutton.click();
		if(radiobutton.isSelected())
		{
			System.out.println("already selcted");
		}else {
			System.out.println("cheking checkbox now");
			radiobutton.click();
			System.out.println("radio button selected now");
		}
	}

}
