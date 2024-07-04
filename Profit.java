package Summer_1;
import java.util.*;
public class Profit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total quantity of  items");
		double total_q=sc.nextDouble();
System.out.println("enter the total prize of "+total_q+ " ");
double total_prize=sc.nextDouble();
System.out.println("enter the profit in percent");
double percent=sc.nextDouble();
double profit=(total_prize*percent)/100;
System.out.println("profit is "+profit);
System.out.println("cost of one product");
double product=(total_prize-profit)/total_q;
System.out.println(product);

	}

}
