package Summer_2;
import java.util.*;

public class sum {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int i;
	int n=0;
	int j=sc.nextInt();
	for(i=1;i<j;i++) {
		if(i%2==0) {
			n=n+i;
		}
		
	}
System.out.println(n);
}
}