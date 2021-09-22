package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Excel.Utility.Xls_Reader;

public class Parametarizedpoi {

	public static void main(String[] args) throws InterruptedException {
		
		//webdriver code
		 System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
 	       WebDriver driver=new ChromeDriver();
 	       driver.get("https://en-gb.facebook.com/");
 	       
 	       driver.manage().window().maximize();
 	       
 	       
        //get data from Ecel file
		Xls_Reader reader =new Xls_Reader("E:\\ExampleAutomation\\AutomationTest\\HomePractice\\src\\testdata\\Halfebaytest.xlsx");
          int rowcount= reader.getRowCount("RegTestData");
          
          reader.addColumn("RegTestData", "Status");
          
          //parameterisation
          for(int i=2; i<=rowcount; i++)
          {
        	  System.out.println("$$$$$$$$$$$$$$$$$$$");
        	  
        	Thread.sleep(1000);
        	String firstname=reader.getCellData("RegTestData", "Firstname", i);
        	  System.out.println(firstname);
        	  
        	  String lastname= reader.getCellData("RegTestData", "Lastname", i);
   	       System.out.println(lastname);
   	       
   	       String Address1= reader.getCellData("RegTestData", "Address1", i);
   	       System.out.println(Address1);
   	       
   	       String Address2= reader.getCellData("RegTestData", "Address2", i);
   	       System.out.println(Address2);
   	       
   	       String Zipcode= reader.getCellData("RegTestData", "Zipcode", i);
   	       System.out.println(Zipcode);

   	       String Email= reader.getCellData("RegTestData", "Email", i);
   	       System.out.println(Email);
   	       
   	       //enter data
   	       driver.findElement(By.xpath("//*[@id=\'email\']")).clear();
   	       driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys(Email);
   	       
   	       driver.findElement(By.xpath("//*[@id=\'pass\']")).clear();
   	       driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(lastname);
   	       
   	       
   	       //write the data into the column
   	       reader.setCellData("RegTestData", "Status", i, "done");
   	       
   	       
          
          
          
          }
	}

}
