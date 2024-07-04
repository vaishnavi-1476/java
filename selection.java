package Summer_4;

public class selection {

	public static void main(String[] args) {
		int[] a= {12,32,4,43,23,65};
		int min,temp;
		int flag=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
				
			}temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int array :a) {
System.out.print(array+" ");}
		

	}

}
