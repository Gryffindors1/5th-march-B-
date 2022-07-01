package newexcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile= new File("D:\\selenium installation files\\CC.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		//reading whole cell
		System.out.println(" Country "+"\t"+"    Capital "+"\t"+"\n");
		//for (int i=0; i<=20; i++) {
			// String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			//System.out.print(value+"    --->        ");
			
			//String value1= mysheet.getRow(0).getCell(i).getStringCellValue();
			//System.out.println(value1);
		//}
		
		int lastrow = mysheet.getLastRowNum();
		short lastcellnum = mysheet.getRow(0).getLastCellNum();
		int totalcellcount = lastcellnum-1;
		
		System.out.println(lastrow);
		System.out.println(lastcellnum);
		
		for(int i=0; i<=totalcellcount; i++)   // dynamic coding
		{
			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
			
			
		}
	}

}
