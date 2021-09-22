package Practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathPractice1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9986362222");
		 
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Darshu_22");
		 
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		 Thread.sleep(2000);
		 
		 driver.manage().deleteCookieNamed("Block");
		 Thread.sleep(2000);
		 
//		Alert a=driver.switchTo().alert();
//		String S=a.getText();
//		a.dismiss();
		//System.out.println(a.getText());
		
		 
		 
		 
//		 driver.findElement(By.xpath("//span[text()='Saved']")).click();

	}

}
