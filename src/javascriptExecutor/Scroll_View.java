package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_View {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/India");
		Thread.sleep(1000);
		WebElement ancient_india = driver.findElement(By.id("Ancient_India"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true)", ancient_india);
	}

}
