package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReference {
	
	File f;
	FileInputStream fis ;
	XSSFWorkbook wb;
	XSSFSheet sh ;
	
	public ExcelReference(String filepath) {
		
		try {
			f= new File(filepath);
			 fis = new FileInputStream(f);
			 wb= new XSSFWorkbook(fis);
			
		}catch(IOException e) {
			e.printStackTrace();		
		}
		 
	}
	
	//data from cell
	public String getCellData(int sheetno,int row,int col) {
		sh = wb.getSheetAt(sheetno);
		String value =sh.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	
	//count no fo rows
	public int getRowCount(int sheetno) {
		sh = wb.getSheetAt(sheetno);
		int rows=sh.getLastRowNum();
		return rows;
	}
	
	//count no of columns
	public int getColumnCount(int sheetno) {
		sh = wb.getSheetAt(sheetno);
		int cols=sh.getRow(0).getLastCellNum();
		return cols;
	}

}
