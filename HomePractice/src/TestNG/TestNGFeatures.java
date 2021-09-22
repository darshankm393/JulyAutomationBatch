package TestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
   
	
	@Test
    public void LoginTest() {
    	System.out.println("login");
    	int i=9/0;
    }
	
	@Test(dependsOnMethods="LoginTest")
	public void HomepageTest() {
		System.out.println("homepagetest");
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void RegTest() {
		System.out.println("Reg");
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
