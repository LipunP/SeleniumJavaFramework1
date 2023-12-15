package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelUtilsTestNG {
	
	static String excelpath = System.getProperty("user.dir");
	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet = null;
	
	@BeforeSuite
	public void pageSetup() throws IOException {
		workbook = new XSSFWorkbook(excelpath + "/Excel/data.xlsx");
		 sheet = workbook.getSheet("Sheet1");
	}
	@Test
	public static void getRowNo() throws Exception {
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total no of rows:" + rows);
	}
	@Test
	public static void getCellDataNumber() throws Exception {
		int data = (int) sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(data);
	}
	@Test
	public static void getCellData() throws Exception {
		String data1 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
	}
	@AfterSuite
	public void pageTearDown() {
		System.out.println("Data retrived");
	}
}
