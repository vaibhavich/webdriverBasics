import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class readExcel {

	public static void main(String[] args) throws IOException 
	{
		/*
		FileInputStream fis = new FileInputStream("C:\\@selenium\\readWrite\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
		System.out.println(sheet.getLastRowNum()+1);
		
		XSSFRow row = sheet.getRow(0);
		
		System.out.println(row.getLastCellNum());
		
		
		System.out.println(row.getCell(3).getStringCellValue());
		
		*/
		Xlfile_Reader excel = new Xlfile_Reader("C:\\@selenium\\readWrite\\Book1.xlsx");
		//System.out.println(excel.getRowCount("Sheet1"));
		System.out.println(excel.getCellData("Sheet1", "Password", 2));
		System.out.println(excel.getCellData("Sheet1", 2,2));
		
		//System.out.println(excel.setCellData("Sheet1", "Password", 2, "hogaya"));
		
		

	}

}
