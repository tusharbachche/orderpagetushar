package javascriptExecutor;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		Point defaultposition = driver.manage().window().getPosition();
		System.out.println(defaultposition);
		Point p=new Point(-200,100);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
	}

}
