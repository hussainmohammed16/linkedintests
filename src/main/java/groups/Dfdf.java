package groups;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Dfdf {

	@Test
public void readExcel() throws IOException{
		
		// Read the file
		FileInputStream fis = new FileInputStream(new File("F://Users//Hussain//Desktop//Testcase1.xls"));
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		// go to first sheet
		HSSFSheet sheet = workbook.getSheetAt(0);
		
		// get all rows
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		// Get the column count 
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		String[][] data = new String[rowCount][columnCount];
	//	data[0][0]="selenium";
		
		// loop through each row 
		for (int i = 1; i <= rowCount; i++) {
			
			// go to the row
			HSSFRow row = sheet.getRow(i);
			
			for(int j=0; j<columnCount; j++){
				// go to the cell
				HSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
				System.out.println(cell.getStringCellValue());
			}
			 
		}
	//	return data;
		
		
		
		
	}
	
}
