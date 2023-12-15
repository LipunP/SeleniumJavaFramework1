package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtenReportsDemo {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
		extent.attachReporter(spark);
		
		ExtentTest test1 = extent.createTest("IQNavigator Login Page Testing");
		
		driver = new ChromeDriver();
		driver.get("https://augustus.iqnavigator.com/security/login?service=https://augustus.iqnavigator.com/falcon&locale=en_IN");
		test1.log(Status.INFO, "Valid URL");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("lpatra2");
		test1.pass("username entered");
		
		driver.findElement(By.name("password")).sendKeys("@Ranjan90");
		test1.pass("Password entered");
		
		driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		test1.pass("Login button clicked");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		test1.pass("Logout successful");
		
		driver.close();
		extent.flush();
		
	}

}
