package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//	//Read Data From IPL Sheet
		// Implementation of read the data from excel0
		// read multiple values or data from excel sheet by using for loop
		for(int i=1; i<=10; i++)
		{
		FileInputStream fis = new FileInputStream("./data/Test Data.xlsx");
		Workbook wbf = WorkbookFactory.create(fis);// make the file ready to read
		Sheet sheet = wbf.getSheet("IPL");
		Row row = sheet.getRow(i);// get into desired row
		Cell cell = row.getCell(1);// get into desired cell or coloumn
		String data = cell.getStringCellValue();//get the data from excel
		Thread.sleep(2000);
		System.out.println(data);
		}
		
	}

}
