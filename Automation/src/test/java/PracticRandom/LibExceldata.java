package PracticRandom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LibExceldata 
{
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public LibExceldata (String excelpath)
	{
		try {
        File src = new File(excelpath);
		
		FileInputStream fis = new FileInputStream (src);
		
		 wb = new XSSFWorkbook(fis);
		
		 
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
	}
	
	public String getdata(int sheetname, int row, int coloumn) 
	{
		sheet1=wb.getSheetAt(0);
		String data = sheet1.getRow(row).getCell(coloumn).getStringCellValue();
		return data;
		
	}
	
	
	
	
	

}
