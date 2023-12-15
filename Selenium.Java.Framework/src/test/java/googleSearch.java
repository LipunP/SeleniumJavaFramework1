import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) throws InterruptedException {
		testGoogle();
		
	}
	
	
	
	public static void testGoogle() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Test Automation");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		System.out.println("Test is passed");
		
	}
}
