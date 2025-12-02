package assignjava;
import java.util.*;
public class countdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(system.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		int a=0,d=0,sp=0;

		for(char c : s.toCharArray()){
		    if(Character.isDigit(c)) d++;
		    else if(Character.isLetter(c)) a++;
		    else sp++;
		}

		System.out.println(a+" "+d+" "+sp);

	}

}
