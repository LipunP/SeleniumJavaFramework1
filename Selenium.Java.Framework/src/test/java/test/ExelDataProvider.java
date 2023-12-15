package test;

import org.testng.annotations.DataProvider;

public class ExelDataProvider {
	
	static String Path = System.getProperty("user.dir");
	public static void main(String[] args) throws Exception {
		testData(Path+"/Excel/data1.xlsx", "sheet1");
	}
	
	@DataProvider(name = "Test1")
	public Object getData() throws Exception {
		Object data[][] = testData(Path, "sheet1");
		return data;
	}
	
	
	public static Object testData(String Path, String Sheetname) throws Exception {
		OrangeHRM OHRM = new OrangeHRM(Path, Sheetname);
		int rowCount = OHRM.getRowCount();
		int colCount = OHRM.getColCount();
		
		for (int i = 1; i<rowCount; i++) {
			for (int j=0; j<colCount; j++) {
				String celldata = OHRM.getCellData(i, j);
				 System.out.print(celldata+"|");
			}
		}System.out.println();
		
	}
	
}
