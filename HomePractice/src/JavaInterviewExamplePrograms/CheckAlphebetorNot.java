package JavaInterviewExamplePrograms;

public class CheckAlphebetorNot {

	public static void main(String[] args) {

		
		char c='p';
		if((c >='a' && c<='z') ||(c>='A' && c<='Z')) {
			System.out.println(c+":is a alphebet");
		}else
		{
			System.out.println("its not Alphebet:"+c);
		}
	}

}
