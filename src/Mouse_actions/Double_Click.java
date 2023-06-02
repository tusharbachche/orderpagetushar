package Mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www-uitestpractice-com.translate.goog/?_x_tr_sch=http&_x_tr_sl=la&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=sc");
	Thread.sleep(1000);
	Actions act= new Actions (driver);
	WebElement doubleclick = driver.findElement(By.name("dblClick"));
	//act.doubleClick(doubleclick).perform();
	act.moveToElement(doubleclick).doubleClick().build().perform();
	}
}