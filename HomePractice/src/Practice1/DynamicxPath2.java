package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicxPath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("royal Enfield");
		
	List <WebElement> list=driver.findElements(By.xpath("//ul[@class='erkvQe']//li/descendant::div[@class='wM6W7d']"));
		
		System.out.println(list.size());
	for(int i=0; i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("royal enfield himalayan")) 
		{
			list.get(i).click();
			break;
		}
	}
	}
}
