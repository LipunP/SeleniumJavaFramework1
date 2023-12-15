package test;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OrangeHRM {
	static XSSFWorkbook excel = null;
	static XSSFSheet sheet = null;

	public OrangeHRM(String Path, String sheetname) {
		try {
			excel = new XSSFWorkbook(Path);
			sheet = excel.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	public static void main(String[] args) throws IOException {
//		getRowCount();
//		getColCount();
//		getCellData(1, 1);
//	}

	public int getRowCount() throws IOException {
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Row Count:" + rowCount);
		return rowCount;
	}

	public int getColCount() throws IOException {
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total Column Count:" + colCount);
		return colCount;

	}

	public String getCellData(int rowNum, int colNum) throws IOException {
		String celldata = null;
		celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//		System.out.println(celldata);
		return celldata; 
	}

}
