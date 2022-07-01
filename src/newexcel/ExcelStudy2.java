package newexcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile= new File("D:\\selenium installation files\\CC.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
				
		//System.out.println(mysheet.getLastRowNum());
		//System.out.println(mysheet.getRow(0).getLastCellNum());
		
		// I want to read one coloumn
		//static coding
	//	for (int i=0; i<=20;i++) {
			
			//System.out.println(mysheet.getRow(i).getCell(0).getStringCellValue()); 
	//	}
		
		
		//dynamic coding
		
		int lastrow = mysheet.getLastRowNum();
		System.out.println(lastrow);
		
		
		for(int i=0; i<=lastrow-1; i++) {
			String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
			
		}
	}

}
