package Summer_2;
import java.util.*;
public class reve {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		System.err.println("reverse order table is = ");
		for(i=10;i>=1;i--) {
			int j=n*i;
			System.out.println(n+" * "+ i +  " = "+j);
		}
	}

}
