package dyanamic_elements;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Un_orderedlist_using_searchbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ops=new ChromeOptions ();
		ops.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("i phone14 ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		 List<WebElement>text = driver.findElements(By.xpath("((//div[@class='col col-7-12'])[1]//span)"));
	
	for(WebElement s:text)
	{
		System.out.println(s.getText());
	}
	System.out.println("===========================");
	
	

	
	}


}