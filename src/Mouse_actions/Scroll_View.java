package Mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_View {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com");
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		WebElement text = driver.findElement(By.xpath("//strong[text  ()='Katraj Branch']"));
		act.scrollToElement(text).perform();
		
	}

}
