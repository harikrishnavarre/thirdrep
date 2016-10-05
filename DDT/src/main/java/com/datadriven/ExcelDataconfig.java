package com.datadriven;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataconfig {

	XSSFWorkbook wb;
	XSSFSheet   sheet;
	
	

	public ExcelDataconfig(String excelPath) throws Exception {
		File src=new File(excelPath);
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		
	}



	
		
		
		public String getData(int sheetNumber, int row,	 int col){
			sheet=wb.getSheetAt(sheetNumber);
			String data=sheet.getRow(row).getCell(col).getStringCellValue();
			return data;
		}
	
	
	public int getRowCount(int sheetIndex){
		
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
			
	return row;	
	}

	}
	
	

