package Summer_3;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thr number");
		int n=sc.nextInt();
		
		boolean isprime=true;
		System.out.println("prime numbers are");
		if(n==1 ||n==0) {
			isprime=false;
		}
		else {
			int i=2;
			do {
		
			isprime=true;
			int j=2;
			do {
				
				if(i%j==0) {
					isprime=false;
					
					break;
				}j++;
			}while(j<i);
		if(isprime) {
			
			System.out.print(i+" ");
		}i++;
	}while(i<=n);
		}
	
	}
}



        
    
        

            
            
            
            