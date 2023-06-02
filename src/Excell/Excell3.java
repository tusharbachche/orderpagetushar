package Excell;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Excell3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File myfile=new File("D:\\Tushar\\selenium-java-4.6.0\\selinium_sheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		for( int i=0;i<=2;i++)
		{
			String myvalue = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(myvalue+" ");
			
		}
		System.out.println();
		for (int i=1;i<=3;i++)
		{
			String myvalue = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(myvalue);
		}

	}

}
