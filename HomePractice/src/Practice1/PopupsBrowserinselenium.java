package Practice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsBrowserinselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:82/login.do");
		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
		Set <String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentwindowid=it.next();
		System.out.println("parentwindowid"+parentwindowid);
		
		String childwindowid=it.next();
		System.out.println("childwindowid"+childwindowid);
		
		driver.switchTo().window(childwindowid);
		Thread.sleep(2000);
		
		System.out.println("Child window pop up title"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowid);
		Thread.sleep(2000);
		
		System.out.println("parent window pop up title"+driver.getTitle());
		

	}

}
