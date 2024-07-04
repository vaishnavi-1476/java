package Summer_4;

public class Insertion {

	public static void main(String[] args) {
		int[] a= {12,32,12,32,4,5,65};
		
		int temp;
		for(int i=1;i<a.length;i++) {
			int j = i;
			temp=a[i];
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
				
				
			}
			a[j]=temp;
			}
			
		
	for(int array:a) {
		System.out.print(array+" ");
	}
	}
}
