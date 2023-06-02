package selenium_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	}

}
