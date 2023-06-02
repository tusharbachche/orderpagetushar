package pop_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_PoPups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		String MainpageId = driver.getWindowHandle();
		System.out.println(MainpageId);
Set<String>idofallpages=driver.getWindowHandles();
System.out.println(idofallpages);
Iterator<String>it=idofallpages.iterator();
String mainpageIdNEW=it.next();
System.out.println( mainpageIdNEW);
String childpageid=it.next();
String childpageid2=it.next();
driver.switchTo().window(childpageid2);
String currentwindowId = driver.getWindowHandle();
System.out.println(currentwindowId);
System.out.println(childpageid);
System.out.println(childpageid2);

 
 Thread.sleep(1000);
		 
 driver.close();
 driver.switchTo().window(MainpageId);
 
 

 
 

	}

}
