package Utility;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@DataProvider(name="input")
	public Object[][] input() {
		ExcelReference excel=new ExcelReference(".//src/test/java/TestData/Book1.xlsx");
		int row=excel.getRowCount(0);
		int col=excel.getColumnCount(0);
		System.out.println(row+1 +" "+col);
		
		Object[][] data=new Object[row+1][col];
		
		for(int r=0 ; r<=row;r++) // rows
		 {
			 for(int c=0 ; c<col;c++) // columns
			 {
				 data[r][c]=excel.getCellData(0, r, c);
			 }
		 }
		return data;
	}
	
	@DataProvider(name="input2")
	public Object[][] input2() {
		ExcelReference excel=new ExcelReference(".//src/test/java/TestData/Book2.xlsx");
		int row=excel.getRowCount(0);
		int col=excel.getColumnCount(0);
		System.out.println(row+1 +" "+col);
		
		Object[][] data=new Object[row+1][col];
		
		for(int r=1 ; r<=row;r++) // rows
		 {
			 for(int c=0 ; c<col;c++) // columns
			 {
				 data[r-1][c]=excel.getCellData(0, r, c);
			 }
		 }
		return data;
	}
}
