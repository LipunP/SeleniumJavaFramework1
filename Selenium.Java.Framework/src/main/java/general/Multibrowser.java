package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multibrowser {
	WebDriver driver = null;

	@Parameters("browserName")
	@BeforeTest
	public void setUp(@Optional("Chrome") String browserName) {
		System.out.println("Browser Name:" + browserName);

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			System.out.println("Chrome Started");
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Edge Started");
		}
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://selfregistration.cowin.gov.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		String actual = driver.getTitle();
		String expected = "CoWIN Application";
		if (actual.contains(expected)) {
//		Assert.assertEquals(actual.contains("CoWIN Application"), expected.contains("CoWIN Application"));
		System.out.println("Passed");}
		}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test Completed");
	}
}
