package javaPrograms;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstCell {
	
	@Test
	public static void main(String[] args) throws IOException {
		// Reading Excel
		XSSFWorkbook workBook = new XSSFWorkbook("E:\\Data.xlsx");
		XSSFSheet sheet = workBook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		
		// Converting cell value into String
		String expectedValue = cell.getStringCellValue();
	    System.out.println(cell);
	    System.out.println(expectedValue);
	    // Selenium webDriver Script
	    System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		System.out.println(driver.getCurrentUrl());
		
		// Row[0].Cell[0]  = = Coimbatore
		// Passing value from Excel into sendKeys by variable = expectedValue
		
		/// Gooogle Search page
		driver.findElement(By.xpath("//textarea[@class='gLFyf' and id='APjFqb']")).sendKeys(expectedValue);
		/// Gooogle Result page
		String actualValue = driver.findElement(By.xpath("//span[@role='heading' and @class=yKMVIe']")).getText();
		Assert.assertEquals(expectedValue, actualValue);   
	
	}
}
