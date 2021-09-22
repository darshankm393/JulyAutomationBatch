package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();//launch chrome
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	}
	
	@Test(priority=1,groups="Title")
	public void GoogletitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2,groups="Logo")
	public void GoogleLogoTest() {
		boolean b=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		
	}
	@Test(priority=3,groups="Link")
	public void Linktest() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Test(priority=5,groups="Test")
	public void Test2() {
		System.out.println("Test2");
	}
	
	@Test(priority=6,groups="Test")
	public void Test3() {
		System.out.println("Test3");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
