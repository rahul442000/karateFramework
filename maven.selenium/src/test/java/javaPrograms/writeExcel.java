package javaPrograms;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("details");
		
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"ID","Name","LastName"});
		data.put("2", new Object[] {1,"Rahul","Soni"});
		data.put("3", new Object[] {"2","Abhishek","Sharma"});
		data.put("4", new Object[] {"3","Munish","Kappor"});
		
		
	}
}
