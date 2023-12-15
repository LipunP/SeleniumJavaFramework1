package utils;

public class ExcelFunction {

	static String excelPath = System.getProperty("user.dir");
	public static void main(String[] args) throws Exception {
		
		ExcelUtils util = new ExcelUtils(excelPath+"/Excel/data.xlsx", "Sheet1");
		util.getRowNo();
		util.getColNo();
		util.getCellData(0, 0);
		util.getCellDataNumber(1, 1);
		
	}

}
