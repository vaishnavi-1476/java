package Summer_1;
import java.util.*;
public class result {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thr 1st sub marks");
		int total=0;
	    for(int i=1;i<=5;i++) {
			System.out.println("enetr the marks of "+i +" sub");
            int marks=sc.nextInt();
			if(marks>=0 && marks<=100) {
			System.out.println(marks);
			
			total = total+marks;
			}else {
				System.out.println("marks should less than 100");
				break;
			}
		}
		System.out.println("total marks are");
		System.out.println(total);
		}
		
		

	}


