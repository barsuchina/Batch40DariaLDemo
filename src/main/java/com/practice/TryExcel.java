package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class TryExcel {
	
	FileInputStream fis; //declare a variable for converted file
	XSSFWorkbook wb; //declare a variable for workbook from converted file

	public void getExcelData(int rowIndex, int columnIndex) {
		
		File file = new File("./src/main/resources/Book1.xlsx");
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sht = wb.getSheetAt(0); //calling a sheet by its index number in excel file
		//XSSFSheet sht = wb.getSheet("Sheet1"); by name of the sheet
		
		//getting number of rows
		int totalRow = sht.getPhysicalNumberOfRows();
		
		//Loop all the rows
		for(int i = 0; i < totalRow; i++) {
			if (i==rowIndex) {
				Row row = sht.getRow(i);
				row.getLastCellNum();
				
				for (int j=0; j<totalRow; j++) {
					if (j==columnIndex) {
						Cell cell = row.getCell(j);
						
						System.out.println(cell.getStringCellValue());
					}
				}
			}
			
		}
	
	
	}
	
	public static void main(String[] args) {
		TryExcel obj = new TryExcel();
		obj.getExcelData(0, 0);
		obj.getExcelData(1, 1);
		obj.getExcelData(4, 1);
	}
	
	
}
