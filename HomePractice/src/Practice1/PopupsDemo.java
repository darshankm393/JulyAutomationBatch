package Practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert a=driver.switchTo().alert();
//		System.out.println(a.getText());
		
//		String s=a.getText(); // for validation  actual result==to estimated result
//		if(s.equals("Please enter a valid user name"))
//		{
//			System.out.println("alert is correct");
//		}else
//		{
//			System.out.println("alert is incorrect");
//		}
//	
//	
//		
//		a.accept();  // to ok button
//		a.dismiss(); // to cancel button
		

	}

}
