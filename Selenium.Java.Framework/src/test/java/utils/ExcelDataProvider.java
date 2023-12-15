package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	static WebDriver driver = null;
	

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider = "test1")
	public void test(String Username, String Password) throws Exception {
		System.out.println(Username + "|" + Password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();

	}

	@DataProvider(name = "test1")
	public Object[][] getdata() throws Exception {
		String excelPath = System.getProperty("user.dir");
		Object data[][] = testData(excelPath+"/Excel/data.xlsx", "Sheet1");
		return data;
	}

	public static Object[][] testData(String excelPath, String sheetName) throws Exception {

			ExcelUtils excel = new ExcelUtils(excelPath,sheetName);
			int rowCount = excel.getRowNo();
			int colCount = excel.getColNo();
			Object data[][] = new Object[rowCount-1][colCount];
			
			for (int i=1; i<rowCount; i++) {
				for(int j=0; j<colCount; j++) {
					
				String excelData = excel.getCellData(i, j);
				data[i-1][j] = excelData;
					
				System.out.print(excelData+" | ");
				}
				System.out.println();
				
			} 
			return data;			
			}
  
	@AfterTest
	public void pageTearDown() {
		System.out.println("Done");
	}
}
