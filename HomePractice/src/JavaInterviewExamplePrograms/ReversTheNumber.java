package JavaInterviewExamplePrograms;

public class ReversTheNumber {

	public static void main(String[] args) {

		    int num=76654, rev=0;
		    
		    while(num!=0)
		    {
		    	int n=num%10;//4,3,2,1
		    	rev=rev*10+n;//4,43,432,4321
		    	num=num/10;
		    	
		    }System.out.println(rev);
	}

}
