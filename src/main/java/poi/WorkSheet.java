package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class WorkSheet {
	
	
	 Date date= new Date();
     
	public void excelwork() throws IOException
	{
	
	FileInputStream fis= new FileInputStream("F://Users//Hussain//Desktop//Hussai.xls");
	
	HSSFWorkbook workbook = new HSSFWorkbook(fis);
	HSSFSheet sheet = workbook.getSheetAt(0);
	int rowcount=sheet.getLastRowNum();
	
	
	
	for (int i = 1; i <=rowcount; i++)
	
	{
		 
		HSSFRow row = sheet.getRow(i);
		for(int j=0;j<=1;j++)
		{
			System.out.println(row.getCell(j).getStringCellValue());
			//row.createCell(j).setCellValue(date);
			//System.out.println(row.getCell(j).
			
		}
		
		System.out.println(sheet.getPassword());
		FileOutputStream ois = new FileOutputStream("F://Users//Hussain//Desktop//Hussain111.xls");
		workbook.write(ois);
	} 
	
	
	


}
}

