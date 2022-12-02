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

public class AllData {

	private static void allData() throws IOException {

		File f = new File("D:\\eclipse-workspace\\Facebook_Project\\DataDriven\\Project.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fi);

		Sheet s = w.getSheet("Amazon");

		int rowsize = s.getPhysicalNumberOfRows();

		for (int i = 0; i < rowsize; i++) {

			Row r = s.getRow(i);

			int cellsize = r.getPhysicalNumberOfCells();

			for (int j = 0; j < cellsize; j++) {

				Cell c = r.getCell(j);

				CellType ct = c.getCellType();

				if (ct.equals(CellType.STRING)) {
					String sc = c.getStringCellValue();
					System.out.print(sc);

				}else if (ct.equals(CellType.NUMERIC)) {
					double nc = c.getNumericCellValue();
					int ii = (int)nc;
					System.out.print(ii);

				}

				System.out.print("||");			
			}

			System.out.println();
		}

	}

	public static void main(String[] args) throws IOException {
		allData();
	}
}
