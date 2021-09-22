package JavaInterviewExamplePrograms;

public class Palindromenum {

	public static void main(String[] args) {

		int num=5665;
	    int rev=0;
	    int actualnum=num;
		
		while(num!=0) {
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
			
			
		}System.out.println(rev);
		
		if(actualnum ==rev)
		{
			System.out.println("the given num is palindrome: "+actualnum);
		}else
		{
			System.out.println("the given num is not palindrome:"+actualnum);
		}
	}

}
