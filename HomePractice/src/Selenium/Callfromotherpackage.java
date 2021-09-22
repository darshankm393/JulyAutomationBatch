package Selenium;

public class Callfromotherpackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childclass c=new Childclass(); //called from child class without return type
		c.Validateheader();//without return type direct print
		
		System.out.println(c.Validateheader());//when return type use SYSO
		

	}

}
