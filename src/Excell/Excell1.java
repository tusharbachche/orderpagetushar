package Excell;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File myfile=new File("D:\\Tushar\\selenium-java-4.6.0\\selinium_sheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		Cell myCellno1 = mySheet.getRow(0).getCell(0);
		System.out.println(myCellno1.getCellType());
		String myvalue1 = myCellno1.getStringCellValue();
		System.out.println(myvalue1);
		System.out.println("==========================================================");
		Cell mycellno2 = mySheet.getRow(0).getCell(1);
		System.out.println(mycellno2.getCellType());
		double value2 = mycellno2.getNumericCellValue();
		System.out.println(value2);
		System.out.println("==========================================================");
		
	}

}
