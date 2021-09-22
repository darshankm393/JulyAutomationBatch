package JavaInterviewExamplePrograms;

public class Fibonacciseries {

	public static void main(String[] args) {

		
	
		//0 1 1 2 3 5 8 13
		int num =10, t1=0,t2=1, sum=0, count =0;
		
		for(int i=1; i<=num; i++)
		{
			
			System.out.println(t1);
			sum=t1+t2;
			t1=t2;
			t2=sum;
			
			
		}
	}

}
