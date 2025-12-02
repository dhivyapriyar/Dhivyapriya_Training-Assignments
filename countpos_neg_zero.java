package assignjava;
import java.util.*;
public class countpos_neg_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of elements:");
		int a=sc.nextInt();
		
		int[] arr=new int[a];
		System.out.print("Enter the number of elements:");
		int p=0,n=0,z=0;

		for(int x:arr){
		    if(x>0)p++;
		    else if(x<0)n++;
		    else z++;
		}

		System.out.println(p+" "+n+" "+z);

	}

}
