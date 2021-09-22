package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgbasic {
	
	 
	 @BeforeTest
	 public void launchBrowser() {
		 System.out.println("@BeforeTest---->launchbrowser");
	}
	 
	 @BeforeClass
	 public void login() {
		 System.out.println("@BeforeClass----> login to app");
	 }
	 
	 @BeforeMethod
	 public void enterURL() {
		 System.out.println("@BeforeMethod---->enterURL");
	 }
	 
	 @Test
	 public void googleTitleTest() {
		 System.out.println("@Test---->Google Title Test");
	 }
	 
	 @Test
	 public void SearchTest() {
		 System.out.println("@Test----->Search Test");
	 }
	 
	 @Test
	 public void GooglelogoTest() {
		 System.out.println("@Test----> Google logo Test");
	 }
	 // Post conditions---- Starting with @After
	 
	 @AfterMethod
	 public void logout() {
		 System.out.println("@AfterMethod---->logout from App");
	 }
	 
	 @AfterClass
	 public void classBrowser() {
		 System.out.println("@AfterClass---->classBrowser");
	 }
	 
	 @AfterTest
	 public void deleteAllCookies() {
		 System.out.println("@AfterClass---->deleteAllCookies");
	 }
	 
	 
	 
	
	
	
	
	


}
