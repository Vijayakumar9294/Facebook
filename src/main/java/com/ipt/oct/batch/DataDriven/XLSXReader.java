package com.ipt.oct.batch.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXReader {
	
	private static void singleData() throws IOException {

		File f = new File("D:\\eclipse-workspace\\Facebook_Project\\DataDriven\\Project.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Amazon");
		Row r = s.getRow(0);
		Cell c = r.getCell(1);
		CellType ce = c.getCellType();
		
		if (ce.equals(CellType.STRING)) {
			String sc = c.getStringCellValue();
			System.out.println(sc);
			
		}else if (ce.equals(CellType.NUMERIC)) {
			double nc = c.getNumericCellValue();
			int i = (int)nc;
			System.out.println(i);
			
		}
		
			
	}
	
	public static void main(String[] args) throws IOException {
		singleData();
	}
	
}
