package test;

import java.io.IOException;

public class ExelUtilsOrangeHRM {

	public static void main(String[] args) throws Exception {
		
		String Path = System.getProperty("user.dir");
		OrangeHRM ohrm = new OrangeHRM(Path+"/Excel/data1.xlsx", "sheet1");
		ohrm.getRowCount();
		ohrm.getColCount();
		ohrm.getCellData(1, 1);
	}
	
	
}
