package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.IqnLoginPageObject;


public class Iqn_TestNG2 {
	
	static WebDriver driver = null;
	
	@BeforeTest
		public void pageSetup() {
		
		driver = new ChromeDriver();
		
		driver.get("https://augustus.iqnavigator.com/security/login?service=https://augustus.iqnavigator.com/falcon&locale=en_IN");
		
		driver.manage().window().maximize();
	}
	
	@Test
		public static void iqnWebPageObject1() throws InterruptedException{

		IqnLoginPageObject iqn = new IqnLoginPageObject(driver);
		
		iqn.userName("lpatra2");
		iqn.passWord("@Ranjan90");
		Thread.sleep(2000);
		iqn.loginButton();
		
		Thread.sleep(4000);
		
//		iqn.logoutButton();
		System.out.println("Logout button missed");
	}
	@Test	
		public static void iqnWebPageObject2() throws InterruptedException{

		IqnLoginPageObject iqn1 = new IqnLoginPageObject(driver);
		
		iqn1.userName("lpatra2");
		iqn1.passWord("@Ranjan90");
		Thread.sleep(2000);
		iqn1.loginButton();
		
		Thread.sleep(4000);
		
		iqn1.logoutButton();
		System.out.println("Logout button clicked");

	}
	@AfterTest
		public void pageTearDown() {
			driver.close();
			
		}
}
