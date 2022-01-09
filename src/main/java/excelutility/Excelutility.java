package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {

	public static String getreaddata(String path,int row,int column)
	{
		String data="";
		try
		{
			FileInputStream fis=new FileInputStream(path) ;
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			data=sheet.getRow(row).getCell(column).getStringCellValue(); 
		}
		catch(Exception e)
		{
			
			System.out.println("issue in getread data" + e);
		}
		return data;
	}

}

/*
 * public static int getrownum(String path) { int num=0; try { FileInputStream
 * fis=new FileInputStream(path) ; XSSFWorkbook wb=new XSSFWorkbook(fis);
 * XSSFSheet sheet=wb.getSheetAt(0); num=sheet.getLastRowNum()-1; }
 * catch(Exception e) {
 * 
 * System.out.println("issue in getread data" + e); } return num; } }
 */
