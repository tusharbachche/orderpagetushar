package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_and_View {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/India");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,1000)");
	

}
}