package PracticRandom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2WithReadingdataofSheet 
{

	public static void main(String[] args) throws IOException
	{
		// 
		File src = new File("C:\\Users\\Amol\\Files\\DemoData.xlsx");
		
		FileInputStream fis = new FileInputStream (src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int Rowcount = sheet1.getLastRowNum();
		
		
		System.out.println(Rowcount);
		
		for (int i=0;i<Rowcount;i++)
		{
			String data= sheet1.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Data from excel is"+data);
		}
		
		wb.close();
	}

}
