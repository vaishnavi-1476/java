package Summer_1;
import java.util.*;
public class Population {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the population ");
	int pop=sc.nextInt();
	//men strength is 52 percent
	int men=(int) (0.52*pop);
	System.out.println("men are "+men);
	int women=pop-men;
	System.out.println("women are "+women);
	
	int lit=(int)(0.48*pop);
	System.out.println("literate  total population");
	System.out.println(lit);
	
	System.out.println("literate men are only 35%");
	int men_li=(int)(men*0.35);
	System.out.println("men literate is "+men_li);
	System.out.println("literate  women is ");
	int women_l=lit-men_li;
	System.out.println(women_l);
	
	  
	}

}
