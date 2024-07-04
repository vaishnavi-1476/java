package Summer_4;

public class Bubble {

	public static void main(String[] args) {
	int[] a= {12,34,21,54,3,6};
	int temp;
	int flag=0;
	for(int i=0;i<a.length;i++) {//this loops needs for the round as we know round is define by ( no.of elemnt - 1);
		for(int j=0;j<a.length-1;j++) {//second loop forr arrayu to take he adjent values 
			if(a[j]>a[j+1]) {//comparing the adjenctnt value
				temp=a[j];//swaping
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0) {
			break;
		}
	}
	for(int array:a) {
		System.out.print(array+" ");
	}
	}

}
