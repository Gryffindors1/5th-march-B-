package newexcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingStudy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile = new File("D:\\selenium installation files\\IRCTC.xlsx");
		String n = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(5).getCell(6).getStringCellValue();
		System.out.print(n);
		System.out.println("\n");
		
		String n1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(5).getCell(9).getStringCellValue();
		System.out.println(n1);
		System.out.println("\n");
		
		double num1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(6).getCell(5).getNumericCellValue();
		System.out.print(num1 +"\t");
		
		
		double num2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(5).getCell(5).getNumericCellValue();
		System.out.print(num2);
		//"D:\selenium installation files\IRCTC.xlsx"
	}
	

}
