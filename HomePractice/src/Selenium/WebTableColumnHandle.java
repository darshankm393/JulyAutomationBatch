package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableColumnHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");  
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		List <WebElement> col=driver.findElements(By.xpath("//*[@id=\'customers\']/tbody/tr[1]/th"));
        int colcount=col.size();
        System.out.println("total num of columns:"+colcount);
        
        String colbeforexpath="//*[@id=\'customers\']/tbody/tr[1]/th[";
        String colafterxpath="]";
        for(int i=1; i<=colcount; i++)
        {
        	String actualxpath=colbeforexpath+i+colafterxpath;
        	WebElement element= driver.findElement(By.xpath(actualxpath));
        	
//        	String coltext=element.getText();
        	System.out.println(element.getText());
        	
        }
	}

}
