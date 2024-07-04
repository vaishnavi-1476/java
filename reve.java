package Summer_1;
import java.util.*;
public class reve {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int temp=0;
int val=sc.nextInt();
while(val!=0) {

int vall=val%10;
temp=temp*10+vall;
val=val/10;



	}System.out.println("revese is "+temp);
	
	}

}
