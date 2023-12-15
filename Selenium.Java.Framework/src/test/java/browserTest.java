
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ebiz.licindia.in/D2CPM/?_ga=2.72703123.1272923387.1677050657-120722208.1677050657#Login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='da_textfield-1154-inputEl']")).sendKeys(".Lipun9");
		driver.findElement(By.xpath("//input[@id='da_textfield-1156-inputEl']")).sendKeys("*9Lipun#");
		driver.findElement(By.xpath("//a[@id='da_button-1159']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> el = driver.findElements(By.xpath("//span"));
		int spcounts = el.size();
		 System.out.println("Total count is "+spcounts);
		 driver.close();
		
		
		
		
	}
	
}
