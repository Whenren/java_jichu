package com.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class shili_input {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("18rj1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for(int i = 0;i<=rows;i++) {
			XSSFRow row=sheet.getRow(i);
			
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			
			XSSFCell cell16=row.getCell(15);
			String z_shili=cell16.getStringCellValue();
			
			XSSFCell cell17=row.getCell(16);
			String y_shili=cell17.getStringCellValue();
			
			Class.forName("com.mysqljdbc.driver");
			Connection lianjie=DriverManager.getConnection("");
			java.sql.Statement yuju=lianjie.createStatement();
			String sql="UPDATE 18rj1 SET `左眼裸眼视力`='"+z_shili+"' WHERE`学号`='"+xuehao+"'";
			yuju.execute(sql);
		
			
		
		}
	
	}
}

