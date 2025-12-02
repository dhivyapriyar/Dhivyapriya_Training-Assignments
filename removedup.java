package assignjava;
import java.util.*;
public class removedup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			boolean dup=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					dup=true;
				}
				if(dup) {
					System.out.print("The duplicate elements are: "+arr[i]);
				}
			}
		}
	}

}
