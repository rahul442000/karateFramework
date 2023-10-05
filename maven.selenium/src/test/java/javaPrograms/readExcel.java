package javaPrograms;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workBook = new XSSFWorkbook("E:\\Data.xlsx");
		XSSFSheet sheet = workBook.getSheetAt(0);
		
		Iterator <Row> rowIterator = sheet.rowIterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch(cell.getCellType()) {
				case STRING:
					System.out.print("|	" + cell.getStringCellValue()+"		");
					break;
				case NUMERIC:
					System.out.print("|	" + cell.getNumericCellValue()+"		");
					break;
				case BOOLEAN:
					System.out.print("|	" + cell.getBooleanCellValue()+"		");
					break;
				}
			}
			System.out.println("|");
		}
	
	}
}
