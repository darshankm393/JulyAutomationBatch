package TestNG;

import org.testng.annotations.Test;

public class InvocationTest {
	
	
	@Test(invocationCount=10)
	public void Sum() {
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println("Sum is:"+c);
	}

}
