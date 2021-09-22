package JavaInterviewExamplePrograms;

public class NumberofDIGITS {

	public static void main(String[] args) {

		   long num=1234789898, count=0;
		   
		   while(num!=0) 
		   {
			   num=num/10;
		
			   count++;
			   
			  
		   } System.out.print(count); 
	}

}
