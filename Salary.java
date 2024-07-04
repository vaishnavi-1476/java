package Summer_1;
import java.util.*;
public class Salary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the total salary");
	int sl_t=sc.nextInt();
	System.out.println(sl_t);
	System.out.println("40% is dearness allowance from basic salary");
	int dearness=(sl_t*40)/100;
	System.out.println(dearness);
	System.out.println("20% is rent allowance from basic salary");
	int rent=(sl_t*20)/100;
	System.out.println(rent);
	System.out.println("gross salary is = ");
	System.out.println(sl_t+dearness+rent);
	
	
	
}
}
