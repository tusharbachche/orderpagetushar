package framework_neostox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_NeoStox_usingExcell {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\webdriver\\WEbdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		File myfile=new File("D:\\Tushar\\selenium-java-4.6.0\\selinium_sheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet5");
		String userid = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String expectedUserName = mysheet.getRow(1).getCell(0).getStringCellValue();
	
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys(userid);
		Thread.sleep(1000);
		driver.findElement(By.id("lnk_signup1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_accesspin")).sendKeys(password);
		driver.findElement(By.xpath("//a[text ()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
		Thread.sleep(1000);
		String actualUserName = driver.findElement(By.id("lbl_username")).getText();
		
		if(actualUserName.equals(expectedUserName))
		{
			System.out.println("correct username");
		}
		else {
			System.out.println("incorrect username");
		}
	}



	}


