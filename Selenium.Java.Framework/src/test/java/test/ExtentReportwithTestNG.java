package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportwithTestNG {
	
	WebDriver driver = null;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
	ExtentTest test = extent.createTest("IQNavigator testing started");
	@BeforeSuite
	public void setup() {
		extent.attachReporter(spark);
		driver = new ChromeDriver();
		
	}
	@Test
	public void test() throws InterruptedException {

		driver.get("https://augustus.iqnavigator.com/security/login?service=https://augustus.iqnavigator.com/falcon&locale=en_IN");
		test.log(Status.INFO, "URL is valid");
		driver.findElement(By.id("username")).sendKeys("lpatra2");
		test.pass("Username entered");
		driver.findElement(By.id("password")).sendKeys("@Ranjan90");
		test.pass("Password entered");
		driver.findElement(By.id("loginButton")).click();
		test.pass("Login button clicked");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		test.pass("Logout successful");
		test.pass("Page closed");
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
		extent.flush();	
		System.out.println("Test Completed");
		
	}

}
