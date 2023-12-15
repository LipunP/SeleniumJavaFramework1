package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class licLoginPage {
	
	static WebElement element = null;
	
	public static WebElement userName(WebDriver driver) {
		
		element  = driver.findElement(By.id("username"));
		return element;	
	}
	
	public static WebElement passWord(WebDriver driver) {
		
		element  = driver.findElement(By.id("password"));
		return element;	
	}
	
	public static WebElement loginButton(WebDriver driver) {
		
		element  = driver.findElement(By.xpath("//input[@id='loginButton']"));
		return element;	
	}

}
