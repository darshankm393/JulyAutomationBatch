package JavaInterviewExamplePrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
            int a=10;
            int b=20;
            System.out.println("before swapping");
            System.out.println("a"+a);
            System.out.println("b"+b);
            
            int t=a;
             a=b;
             b=t;
             
             System.out.println("Aftetr Swapping");
             System.out.println("a"+a);
             System.out.println("b"+b);
            
	System.out.println("##################################");
             a=a+b;
        	 a=a-b;
        	 b=a-b;
        	 
        	 System.out.println("a"+a);
        	 System.out.println("b"+b);
	
	
	}
	

}
