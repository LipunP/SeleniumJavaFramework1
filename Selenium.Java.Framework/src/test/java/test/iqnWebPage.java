package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.IqnLoginPageObject;


public class iqnWebPage {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		iqnWebPageObject();
	}

	public static void iqnWebPageObject() throws InterruptedException{
		
		driver = new ChromeDriver();
		
		driver.get("https://augustus.iqnavigator.com/security/login?service=https://augustus.iqnavigator.com/falcon&locale=en_IN");
		
		driver.manage().window().maximize();
		
		IqnLoginPageObject iqn = new IqnLoginPageObject(driver);
		
		iqn.userName("lpatra2");
		iqn.passWord("@Ranjan90");
		Thread.sleep(2000);
		iqn.loginButton();
		
		Thread.sleep(4000);
		
		iqn.logoutButton();
		driver.close();
		System.out.println("Test is passed");
	}
}
