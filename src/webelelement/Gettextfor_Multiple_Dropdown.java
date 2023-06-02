package webelelement;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gettextfor_Multiple_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		Thread.sleep(1000);
		WebElement fruits = driver.findElement(By.id("fruits"));
	Select s=new Select(fruits);
	s.selectByValue("banana");
	Thread.sleep(100);
	s.selectByVisibleText("Orange");
	Thread.sleep(100);
	s.selectByIndex(3);
	Thread.sleep(100);
	List<WebElement> alloption = s.getAllSelectedOptions();
	Iterator<WebElement> it = alloption.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next().getText());
	}
	System.out.println("===================================");
	for (int i=0; i<=alloption.size()-1;i++)
	{
		System.out.println(alloption.get(i).getText());
	}
	for(WebElement a:alloption)
	{
		System.out.println(a.getText());
	}
	}

}
