package javascriptExecutor;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println(defaultsize);
		Dimension d= new Dimension (555,400);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
		Dimension newsize = driver.manage().window().getSize();
		System.out.println("new size is "+newsize);
	}

}
