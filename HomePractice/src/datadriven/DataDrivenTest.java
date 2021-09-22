package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Com.Excel.Utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
        Xls_Reader reader=new Xls_Reader("E:\\ExampleAutomation\\AutomationTest\\HomePractice\\src\\testdata\\Halfebaytest.xlsx");
           String firstname= reader.getCellData("RegTestData", "Firstname", 2);
	       System.out.println(firstname);
	       
	       String lastname= reader.getCellData("RegTestData", "Lastname", 2);
	       System.out.println(lastname);
	       
	       String Address1= reader.getCellData("RegTestData", "Address1", 2);
	       System.out.println(Address1);
	       
	       String Address2= reader.getCellData("RegTestData", "Address2", 2);
	       System.out.println(Address2);
	       
	       String Zipcode= reader.getCellData("RegTestData", "Zipcode", 2);
	       System.out.println(Zipcode);

	       String Email= reader.getCellData("RegTestData", "Email", 2);
	       System.out.println(Email);
         
	       System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("http://localhost:82/login.do;jsessionid=18k4gow5lw0uc");
	        
          driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys(firstname);
          driver.findElement(By.xpath("//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys(lastname);
//          driver.findElement(By.xpath("//*[@id=\'Email\']")).sendKeys(Email);
//          driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys(Zipcode);
//          Select select=new Select(driver.findElement(By.xpath("")));//to select state from mny states
//          select.selectByVisibleText("");
          
	
	        
	
	
	}

}
