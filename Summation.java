package Summer_2;
import java.util.*;
public class Summation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		
int n=0;
		for(i=1;i<=10;i++) {
			int j=8*i;
			System.out.println("8"+" * "+ i +  " = "+j);
			n=n+j;
		}System.out.println("summation of all numer is "+n);
	}

}
