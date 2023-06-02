package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;




public class Utility 
{
    //excel
	//wait
	//screenshot
	//scrollintoView
	//read data from property file
	//static parameter method value given at calling time

	public static String  readDatafromPropertyFile (String key) throws IOException
	{
		// create an objectofFileInPutStream
	  Properties prop=new Properties ();
      //create object of FileInputStream
       FileInputStream myfile=new FileInputStream("C:\\Users\\Unique Computer\\eclipse-workspace\\selenium\\myproperties.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		Reporter.log("data is"+value, true);
		return  value;
		
		
	}
		
	public static String readDataFromExcell(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("D:\\Tushar\\selenium-java-4.6.0\\selinium_sheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet5"); 
		String value=mySheet.getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("reading data from excell row is"+row+"cell is "+cell,true);
		Reporter.log("data is"+value, true);
		return value;
	}	
	public static void implicitWait(int time,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("waiting for"+time+"ms", true);
	}
	public static void takesScreenshot(WebDriver driver,String filename) throws IOException
	{
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(4);
		File destination=new File("C:\\Screenshot\\testing"+filename+Random+".png");
		FileHandler.copy(src, destination);
		Reporter.log("taking screenshot", true);
		Reporter.log("screenshot taken and saved at "+destination, true);
	}
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		Reporter.log("scrolling into viewto"+element.getText() , true);
	}
}
