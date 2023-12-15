package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.IqnLoginPageObject;


public class Iqn_TestNG {
	
	static WebDriver driver = null;
	
	@BeforeTest
		public void pageSetup() {
		
		driver = new ChromeDriver();
		
		driver.get("https://augustus.iqnavigator.com/security/login?service=https://augustus.iqnavigator.com/falcon&locale=en_IN");
		
		driver.manage().window().maximize();
	}
	
	@Test
		public static void iqnWebPageObject() throws InterruptedException{

		IqnLoginPageObject iqn = new IqnLoginPageObject(driver);
		
		iqn.userName("lpatra2");
		iqn.passWord("@Ranjan90");
		Thread.sleep(2000);
		iqn.loginButton();
		
		Thread.sleep(4000);
		
		iqn.logoutButton();

	}
	@AfterTest
		public void pageTearDown() {
			driver.close();
			System.out.println("Test is passed");
		}
}
