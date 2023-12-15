package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Page.licLoginPage;

public class testLICWebpage {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {

		licLogin();
	}
	

	public static void licLogin() throws InterruptedException {
		
	driver = new ChromeDriver();
	driver.get("https://augustus.iqnavigator.com/security/login?service=https://augustus.iqnavigator.com/falcon&locale=en_IN");
	
	driver.manage().window().maximize();
	
	licLoginPage.userName(driver).sendKeys("lpatra2");
	licLoginPage.passWord(driver).sendKeys("@Ranjan90");
	Thread.sleep(4000);
	licLoginPage.loginButton(driver).click();
	
	Thread.sleep(4000);
	driver.close();
	System.out.println("Test is passed");
			
	}
	
}
