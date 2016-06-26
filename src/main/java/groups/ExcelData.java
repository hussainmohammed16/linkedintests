package groups;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wrappers.*;
public class ExcelData extends LinkedInWrappers {
	
	
	
	
	
	
	
	public  Object[][] readExcelData(String data1)  throws IOException
	{
		
		//String filename = returnfile();
		
		System.out.println("filename3"+data1);
		
		FileInputStream fis= new FileInputStream("F://Users//Hussain//Desktop//Testcase1.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println(cellcount);
		System.out.println(rowcount);
		Object[][] data=new Object[rowcount][cellcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			
			HSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<cellcount;j++)
			{
				
				HSSFCell cell = row.getCell(j);
				
				data[i-1][j] = cell.getStringCellValue();
				 
			}
			
		}
		
		
			
		return data;
		
	}
	
	
	
	@DataProvider(name = "exceldata")
	public Object[][] dataproviderexcel() throws IOException
	{
		
		
	 //Object[][] readdata=;
		//String filename ="";
		
		
		return  readExcelData("Testcase1");
		
	}
	
	 
	
	

}
