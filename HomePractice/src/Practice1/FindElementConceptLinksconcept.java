package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  

public class FindElementConceptLinksconcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		// count of links on the page
		//count of text on the page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//size of links
		System.out.println(links.size());
		for(int i=0;i<links.size(); i++)
		{
			String linktext=links.get(i).getText();
			System.out.println(linktext);
		}

	}

}
