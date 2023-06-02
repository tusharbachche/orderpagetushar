package webtable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Webtable1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ops=new ChromeOptions ();
		ops.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
	List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
	System.out.println(table.size());
	for(WebElement t:table)
	{
		System.out.println(t.getText());
	}
	Thread.sleep(1000);
List<WebElement> header = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
System.out.println(header.size());
Thread.sleep(1000);
            Iterator<WebElement> it = header.iterator();
            while (it.hasNext())
            {
            	System.out.println(it.next().getText());
            }
	}

}
