package newexcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudyRow1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile= new File("D:\\selenium installation files\\CC.xlsx");
		//String name1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//System.out.println(name1);
		
		Workbook book = WorkbookFactory.create(myfile);
		  Sheet sheet = book.getSheet("Sheet1");
		  Row row = sheet.getRow(0);
		 Cell cell = row.getCell(0);
		 String type = cell.getStringCellValue();
		 System.out.println(type);
		 
		 String value = cell.getStringCellValue();
		 System.out.println(value);
	}

}
