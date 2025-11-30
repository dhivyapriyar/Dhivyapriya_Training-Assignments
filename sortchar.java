package assignjava;
import java.util.*;
public class sortchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		System.out.print(ch);
	}

}
