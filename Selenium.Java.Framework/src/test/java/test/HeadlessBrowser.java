package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class HeadlessBrowser {

	
	public static void main(String[] args) throws Exception {
		test();
	}
	public static void test() throws Exception {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("headless");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://selfregistration.cowin.gov.in/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println("Test Completed");
		driver.close();
		driver.quit();
	}
}
