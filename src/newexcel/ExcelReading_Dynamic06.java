package newexcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading_Dynamic06 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile= new File("D:\\selenium installation files\\CC.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int lastrow = mysheet.getLastRowNum();
		short lastcell = mysheet.getRow(0).getLastCellNum();
		System.out.println(lastrow);
		System.out.println(lastcell);
		
		for(int i=0; i<=lastrow-1; i++) {
			for(int j=0; j<=lastcell-1; j++) 
		{
				Cell cell = mysheet.getRow(i).getCell(j);
				CellType type = cell.getCellType();
				
			if (type==CellType.STRING) 
			{
				System.out.print(cell.getStringCellValue()+" ");
			}
			else if (type==CellType.BOOLEAN) 
			{
				System.out.print(cell.getBooleanCellValue()+" ");
				System.out.println();
			}
			else if (type==CellType.NUMERIC)
			{
				System.out.print(cell.getNumericCellValue()+" ");
			}
			System.out.println();
		}
	}
		
}

}
