import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Day_28May {

	public static void main(String[] args) throws IOException {
		
		/*FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
////FileInputStream = get data(read data) of a file is a input method
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//System.out.println(sheet.getLastRowNum()+1);
////In sheet row, column starts with [0,0], so we add 1 for obtaining exact value of row
		
////how to find out sheet sample is exist in worbook or not		
 ////using getsheet we cant find either sheet exist or not, bcoz if sheet is not exist then it will not return any error message0
		int index = workbook.getSheetIndex("sample");
////Index(position of sheet)  of sheet = [0,1,2,...]
 		
		System.out.println(index);
		
		if(index==-1){
			System.out.println("Sheet doesn't exists");
		}
		
		XSSFRow row = sheet.getRow(1);
		
////column count		
		//System.out.println(row.getLastCellNum());
////we dont need to add 1 for column count bcoz we find column value on row value
		
		//System.out.println(row.getCell(0).getNumericCellValue());
		
		XSSFCell cell = row.getCell(0);
		System.out.println(HSSFDateUtil.isCellDateFormatted(cell));
////HSSFDateUtil(POI class)  = check whether cell is date formated or not		
////if we use getNumericCellValue for date format cell then it will generate some numaric value, but not date
 
		System.out.println(cell.getDateCellValue());
////getCellType = chk what is cell type
 		
		if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
			if(HSSFDateUtil.isCellDateFormatted(cell)){
				System.out.println(cell.getDateCellValue());
			}
			System.out.println(cell.getNumericCellValue());
		}else if (cell.getCellType()==Cell.CELL_TYPE_STRING){
			System.out.println(cell.getStringCellValue());
		}else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN){
			System.out.println(cell.getBooleanCellValue());
		}else if(cell.getCellType()==Cell.CELL_TYPE_FORMULA){
			System.out.println(cell.getCellFormula());
////getCellFormula = show formula of the cell			
			System.out.println(cell.getNumericCellValue());
		}
		*/
	/*	
		Xlfile_Reader excel = new Xlfile_Reader("C:\\Book1.xlsx");
		
		System.out.println(excel.getRowCount("sample"));
		System.out.println(excel.getCellData("Sheet1", 1, 1));*/
		
		
		FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		XSSFRow row = sheet.createRow(20);
		
		XSSFCell cell = row.createCell(0);
		
		cell.setCellValue("Selenium Automation");
		
		FileOutputStream fos = new FileOutputStream("C:\\Book1.xlsx");
		
		workbook.write(fos);
		
		//Excel Training
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
