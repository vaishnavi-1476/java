package Summer_3;

public class Fibonacci {
	public static void main(String[] args) {
		int first=0;
		int second=1;
		int third=0;
		int i=0;
			do {
				 first=second;
				 second =third;
				 third=first +second;
				 System.out.print(third+" ");
				 i++;
			}
			while(i<=10);
			
			
		}
	

}
