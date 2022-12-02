package com.ipt.oct.batch.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXWriter {
	

	private static void writeData() throws IOException {
		
		File f = new File("C:\\Users\\vijay\\OneDrive\\Desktop\\Project.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fi);
		
		Sheet s = w.createSheet("VijayProject");
		
		Row r = s.createRow(0);
		
		Cell c = r.createCell(1);
		
		c.setCellValue("Movies");
		
		w.getSheet("VijayProject").createRow(3).createCell(2).setCellValue("Bike");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		w.write(fo);
		w.close();
		

	}
	
	public static void main(String[] args) throws IOException {
		writeData();
		System.out.println("Done");
	}

}
