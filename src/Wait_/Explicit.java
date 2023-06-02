package Wait_;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com");
		WebElement review = driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));
		//WebDriverWait w=new WebDriverWait( driver,Duration.ofSeconds(50));
		//w.until(ExpectedConditions.visibilityOf(review));
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(40));
		w.until(ExpectedConditions.visibilityOf(review));
		review.click();
	}

}
