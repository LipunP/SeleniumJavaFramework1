package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IqnLoginPageObject {

	WebDriver driver = null;
	
	By Un = By.id("username");
	By Pw = By.id("password");
	By Lb = By.id("loginButton");
	By Lo = By.id("logoutLink");
	
	public IqnLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void userName(String text) {
		
		driver.findElement(Un).sendKeys(text);
	
	}

	public void passWord(String text) {
		
		driver.findElement(Pw).sendKeys(text);
	
	}
	
	public void loginButton() {
		
		driver.findElement(Lb).click();
	
	}
	
	public void logoutButton() {
		
		driver.findElement(Lo).click();
	
	}
	
	
}
