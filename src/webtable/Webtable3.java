package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		for(int i=2;i<=11;i++)
		{
			for(int j=1;j<=3;j++)
			{
				String tabledata = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(tabledata +" ");
			}
			System.out.println();
	}

	}
}
