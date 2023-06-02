package Excell;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File myfile=new File("D:\\Tushar\\selenium-java-4.6.0\\selinium_sheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet4"); 
		for ( int row=0;row<=1;row++)
		{
			
		
		
			for (int cell=0;cell<=2;cell++)
				
			{
				CellType type = mySheet.getRow(row).getCell(cell).getCellType();
				
				if(type==CellType.STRING)
				{
					String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
					System.out.print(value+" ");
				}
				else if ( type==CellType.NUMERIC)
				{
					double value = mySheet.getRow(row).getCell(cell).getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(type==CellType.BOOLEAN)
				{
				boolean value = mySheet.getRow(row).getCell(cell).getBooleanCellValue();
				System.out.print(value+" ");
				}
				else if (type==CellType.BLANK)
				
				{
					boolean value = mySheet.getRow(row).getCell(cell).getBooleanCellValue();
					System.out.print(value+" ");
				}
			}
		System.out.println();
		}
		
	}

}
