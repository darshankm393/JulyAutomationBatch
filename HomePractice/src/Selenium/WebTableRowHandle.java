package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableRowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//to delete all cookies
		
		
		
		//*[@id="customers"]/tbody/tr[2]/td[1]         
		//*[@id="customers"]/tbody/tr[3]/td[1]        
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		List <WebElement> row=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowcount=row.size();
		System.out.println("total num of rows in web table"+ rowcount);
		
		
		String beforexpath="//*[@id='customers']/tbody/tr[";
		String afterxpath="]/td[1]";
		
		for(int i=2; i<=rowcount; i++)
		{
			String actualxpath=beforexpath+i+afterxpath;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Island Trading")){
			System.out.println("company is found :"+ element.getText()+" position:"+ (i-1));
			break;
			}
			
		}
		System.out.println("#######################################################");
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		

		String afterxpath2="]/td[2]";
		
		for(int i=2; i<=rowcount;  i++)
		{
			String actualxpath=beforexpath+i+afterxpath2;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			
		}
		System.out.println("#####################################################");
		
		String afterxpath3="]/td[3]";
		for(int i=2;  i<=rowcount; i++) {
		
		String actualxpath=beforexpath+i+afterxpath3;
		WebElement  element=driver.findElement(By.xpath(actualxpath));
		System.out.println(element.getText());


	}
	}

}
