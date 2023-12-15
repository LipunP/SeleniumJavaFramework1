package listeners;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ListenerDemo2 {
	
	@Test
	public void test4() {
	System.out.println("test 4");
	}
	
	@Test
	public void test5() {
	System.out.println("test 5");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selfregistration.cowin.gov.in/");
	driver.findElement(By.id("mat-input-1")).sendKeys("8015817112");
	
	}
	@Test 
	public void test6() {
	System.out.println("test 6");
	throw new SkipException("This test case has been skipped");
	}

}
