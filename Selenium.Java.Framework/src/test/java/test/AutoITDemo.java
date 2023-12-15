package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://formstone.it/components/upload/demo/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("fs-upload-target")));
		driver.findElement(By.className("fs-upload-target")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		Runtime.getRuntime().exec("F:\\Selenium\\AutoITDemo.exe");
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}
}
