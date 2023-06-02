package Excell;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File myfile=new File("D:\\Tushar\\selenium-java-4.6.0\\selinium_sheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet5"); 
		int totalnoOfRows = mySheet.getLastRowNum();
		short lastcellno = mySheet.getRow(0).getLastCellNum();
		int totalnoOfCells = lastcellno-1;
		
		for ( int row=0;row<=totalnoOfRows;row++)
		{
			
			for (int cell=0;cell<=totalnoOfCells;cell++)
				
			{
				Cell mycell = mySheet.getRow(row).getCell(cell);
				CellType type = mycell.getCellType();
				
				if(type==CellType.STRING)
				{
					System.out.print(mycell.getStringCellValue()+" ");
				}
				else if ( type==CellType.NUMERIC)
				{
					System.out.print(mycell.getNumericCellValue()+" ");
				}
				else if(type==CellType.BOOLEAN)
				{
				System.out.print(mycell.getBooleanCellValue());
				}
				else if (type==CellType._NONE)
				
				{
					System.out.print("blank");
				}
			}
		System.out.println();
		}
		
	}


	}


