package AutomationClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		String path="C:\\Users\\Tanmoy\\Desktop\\Contry.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		Workbook book=WorkbookFactory.create(file);
		
		Sheet sheet= book.getSheet("sheet1");
		Row row =sheet.getRow(1);
		int lr=sheet.getLastRowNum();
		int lc=row.getLastCellNum();
		
		//System.out.println(lr);
		//System.out.println(lc);
		
		Cell cell=row.getCell(1);
		String value=cell.getStringCellValue();
		//System.out.println(value);
		
		for(int i=0;i<=lr;i++)
		{
			for(int j=0;j<lc;j++)
			{
				row=sheet.getRow(i);
				cell=row.getCell(j);
				value=cell.getStringCellValue();
				System.out.print(value+", ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
