package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
Thread.sleep(1000);
driver.findElement(By.name("submit")).click();
Alert alt = driver.switchTo().alert();
alt.dismiss();
	}

}
