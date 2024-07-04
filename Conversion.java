package Summer_1;
import java.util.*;

public class Conversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("distance between two citizes are in km ");	
	double dis=sc.nextDouble();
	System.out.println("conversion in meter ");
	//1km=1000m;
	double meter=dis*1000;
	System.out.println(meter);
	System.out.println("in feet");
	//1km=3280.foot
	double ft=dis*3280.83;
	System.out.println(ft);
	System.out.println("in inch");
	double in=dis*39370.07;
	System.out.println(in);
	}

}
