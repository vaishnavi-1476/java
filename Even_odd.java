package Summer_3;
import java.util.*;
public class Even_odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thr end number");
		int n=sc.nextInt();
		int e=0;
		int o=0;
		int i=0;
		do {
			if(i%2==0) {
				e=e+i;
				
			}
			else if(i%2!=0) {
				o=o+i;
				
			}
			else {
				System.out.println("it is not even and odd");
			}
			i++;
		
		}while(i<=n);
		System.out.println("even are");
		System.out.println(e);
		System.out.println("odd are");
		System.out.println(o);
	}

}
