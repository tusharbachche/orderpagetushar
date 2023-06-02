package POMClasesUsingDDf;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class neostoxtestclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ops=new ChromeOptions ();
		ops.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		File myfile=new File("D:\\Tushar\\selenium-java-4.6.0\\selinium_sheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet5");
		String mobnumber = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String expectedUserName = mysheet.getRow(1).getCell(0).getStringCellValue();
		Neostock_HomePage home= new Neostock_HomePage (driver);
		home.clickOnSignInButton();
		NeoStock_signInPage userid=new NeoStock_signInPage(driver);
		userid.entermobileNumber(mobnumber);
		userid.signinclick();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeostockPasswordPage pass=new NeostockPasswordPage (driver);
		pass.enterpassword(password);
		pass.clickOnsubmitButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		NeoStoxDashbordPage dashbord= new NeoStoxDashbordPage(driver);
		dashbord.handlePopUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		dashbord.validateUserName(expectedUserName);
		dashbord.logOutFromNeoStox();
		driver.close();
		
	}

}
