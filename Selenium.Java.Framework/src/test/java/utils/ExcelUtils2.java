package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ExcelUtils2 {

	static String excelpath = System.getProperty("user.dir");

	public static void main(String[] args) throws Exception {
		getRowNo();
		getCellData();
		getCellDataNumber();
	}

	public static void getRowNo() throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook(excelpath + "/Excel/data.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total no of rows:" + rows);
	}

	public static void getCellDataNumber() throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook(excelpath + "/Excel/data.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		double data = sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(data);
	}

	public static void getCellData() throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook(excelpath + "/Excel/data.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}
}
