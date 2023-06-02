package Chrome_option;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OPtion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions ();
		ArrayList<String>al=new ArrayList<>();
		al.add("---start-maximized");
		al.add("---incognito");
		opt.addArguments(al);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://github.com/jsbin/output");
	}

}
