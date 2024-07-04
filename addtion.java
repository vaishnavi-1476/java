package Summer_1;
import java.util.*;
public class add {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter thr value");
int val=sc.nextInt();
int temp=0;
while(val!=0) {
	int value=val%10;
	temp=temp+value;
	val=val/10;

}
System.out.println("addition of digits are ");
System.out.println(temp);



	}

}
