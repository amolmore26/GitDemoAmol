package PracticRandom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{

	public static void main(String[] args) throws IOException
	{
		// 
		File src = new File("C:\\Users\\Amol\\Files\\DemoData.xlsx");
		
		FileInputStream fis = new FileInputStream (src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data= sheet1.getRow(0).getCell(0).getStringCellValue();

		System.out.println("Data from excel"+data);
		
		wb.close();
	}

}
