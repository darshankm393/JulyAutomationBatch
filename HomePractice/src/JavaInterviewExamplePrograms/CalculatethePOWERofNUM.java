package JavaInterviewExamplePrograms;

public class CalculatethePOWERofNUM {

	public static void main(String[] args) {

		
		 int base=2;
		 int exponent=0;
		 
		 long result=1;
		 while (exponent!=0) {
			 result *=base;
			 exponent--;
			 
		 }System.out.println(result);
	}

}
