package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==1)
				{
					
					String headertext= driver.findElement(By.xpath("//tbody//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(headertext+" ");
				}
				
				else {
					
					String dataText = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(dataText+" ");
				}
				
			}
			System.out.println();
		}
	}

}
