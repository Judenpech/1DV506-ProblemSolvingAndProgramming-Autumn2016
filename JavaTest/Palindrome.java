package JavaTest;
import java.util.*;
public class Palindrome {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Provide a string: ");
		String str=sc.nextLine();
		for(int i=0,j=str.length()-1; i<str.length(); i++,j--){
			if(str.charAt(i)==' ')
				continue;
			if(str.charAt(j)==' ')
				continue;
			if(Character.toUpperCase(str.charAt(i))!=Character.toUpperCase(str.charAt(j))){
				System.out.println("The string "+str+" is not a simple palindrome");
				System.exit(0);
			}
		}
		System.out.println("The string "+str+" is a simple palindrome");
		sc.close();
	}

}
