 package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup(String Firstname, String Lastname, String Email, String password) {
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();	
	}
	
	@Test
	public void ebayreg() {
		driver.findElement(By.xpath("//*[@id=\'mainContent\']/div[3]/div[3]/div/div/form/div[1]/span/span[1]")).clear();
		driver.findElement(By.xpath("//*[@id=\'mainContent\']/div[3]/div[3]/div/div/form/div[1]/span/span[1]")).sendKeys("Firstname");
		
		driver.findElement(By.xpath("//*[@id=\'mainContent\']/div[3]/div[3]/div/div/form/div[2]/span/span[1]")).clear();
		driver.findElement(By.xpath("//*[@id=\'mainContent\']/div[3]/div[3]/div/div/form/div[2]/span/span[1]")).sendKeys("Lastname");
		
		driver.findElement(By.xpath("//*[@id=\'Email\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'Email\']")).sendKeys("Email");
		
		driver.findElement(By.xpath("//*[@id=\'password\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("password");
		
		
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
