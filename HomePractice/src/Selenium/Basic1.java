package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\HomePractice\\Library\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.getTitle();//get tittle
		System.out.println(driver.getTitle());//print title
		driver.getCurrentUrl();//get url
		System.out.println(driver.getCurrentUrl());//print url
		
		driver.get("http://yahoo.com");
		driver.navigate().back();//navigate to previous browser
		driver.navigate().forward();//navigate to yahoo browser
		
		driver.close();//to close current browser
		driver.quit();//to close all the browsers opened by selenium
		
		

	}

}
