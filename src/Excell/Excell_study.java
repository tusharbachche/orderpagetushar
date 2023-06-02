package Excell;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excell_study {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Tushar\\selenium-java-4.6.0\\selinium_sheet.xlsx");
	String value = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println("value is "+value);
	  String tu = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(tu);
	double te = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(3).getNumericCellValue();
	System.out.println(te);
	}

}
