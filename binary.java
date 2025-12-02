package assignjava;
import java.util.*;
public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total number of elements: ");
		int n=sc.nextInt();
		System.out.print("Enter the elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.print("Found at "+mid);
				break;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
	}

}
