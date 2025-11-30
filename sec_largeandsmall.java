package assignjava;
import java.util.*;
public class sec_largeandsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total number of elements:");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.print("Enter the number of elements:"); 
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		
		}
		Arrays.sort(arr);  //2 4 5 6 8 9
		System.out.println("Second largest element is: "+arr[n-2]);
		System.out.print("Second smallest element is: "+arr[1]);
	}

}
