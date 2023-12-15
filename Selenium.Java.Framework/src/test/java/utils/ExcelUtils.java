package utils;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet = null;
	
	public ExcelUtils(String excelPath, String sheetName) throws Exception {
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		
	}

	public int getRowNo() throws Exception {
		int rows = 0;
		rows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total no of rows:" + rows);
		return rows;
	}
	public int getColNo() throws Exception {
		int colCount = 0;
		colCount = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println("Total no of columns:" + colCount);
		return colCount;
	}
	public double getCellDataNumber(int rowNum, int colNum) throws Exception {
		double data = 0;
		data = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(data);
		return data;
		
	}
	public String getCellData(int rowNum, int colNum) throws Exception {
		String data = null;
		data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//		System.out.println(data);
		return data;
	}

}
