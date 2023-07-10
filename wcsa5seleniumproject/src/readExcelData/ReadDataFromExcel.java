package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Read Data From IPL Sheet
		// Implementation of read the data from excel
		
		FileInputStream fis = new FileInputStream("./data/Test Data.xlsx");// provide path of the file
		
		Workbook wbf = WorkbookFactory.create(fis);//make the file for ready to read
		
		Sheet sheet = wbf.getSheet("IPL");// get into the sheet
		
		Row row = sheet.getRow(3);//get into the desired row
		
		Cell cell = row.getCell(1);// get into the desired cell
		
		String data = cell.getStringCellValue();// to read the data from cell
		
		System.out.println(data);// to print the data
		
		
		
	}

}
