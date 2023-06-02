package Excell;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File myfile=new File("D:\\Tushar\\selenium-java-4.6.0\\selinium_sheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet3"); 
		for(int row=0;row<=1;row++)
		{
			for( int cell=0;cell<=1;cell++)
			{
				double myvalue = mySheet.getRow(row).getCell(cell).getNumericCellValue();
				System.out.print(myvalue+" ");
			}
			System.out.println();
		}
	}

	
}
