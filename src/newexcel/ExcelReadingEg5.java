package newexcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile= new File("D:\\selenium installation files\\CC.xlsx");
		
		//read whole sheet
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		//for(int i=0; i<=2; i++) {
			//for(int j=0; j<=20; j++) {
			//	String value = mysheet.getRow(j).getCell(i).getStringCellValue();
				//System.out.println(value);
			//}
			//System.out.println();
		//}
		
		int lastrow = mysheet.getLastRowNum();
		System.out.println(lastrow);
		
		short lastcell = mysheet.getRow(lastrow).getLastCellNum();
		System.out.println(lastcell);
		
		for(int i=0; i<=lastrow-1; i++) {
			for(int j=0;j<=lastcell-1;j++) {
				String value = mysheet.getRow(j).getCell(i).getStringCellValue();
				System.out.println(value);
				
		
			}
			}
		
		
		
		
		
		
	}
	

}
