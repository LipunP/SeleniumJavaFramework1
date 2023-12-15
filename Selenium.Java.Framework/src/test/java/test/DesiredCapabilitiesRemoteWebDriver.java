package test;

import java.net.MalformedURLException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.RemoteWebDriver;


public class DesiredCapabilitiesRemoteWebDriver {


	public static void main(String[] args) {
		
		
		WebDriver driver = null;
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		driver.get("https://mvnrepository.com/artifact/com.aventstack/extentreports/5.1.1");
		String browserName = caps.getBrowserName().toLowerCase();
		String OS = caps.getPlatformName().toString();
		String BV = caps.getBrowserVersion().toString();
		System.out.println("OS: " + OS + ", Browser: " + browserName + " V " + BV);
		
//		ChromeOptions crm = new ChromeOptions();
//		crm.setBrowserVersion("112");
//		
//		WebDriver driver = new ChromeDriver(crm);
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://mvnrepository.com/artifact/com.aventstack/extentreports/5.1.1");
//		driver.get
//		driver.close();
//		System.out.println("Test Passed");

	}

}
