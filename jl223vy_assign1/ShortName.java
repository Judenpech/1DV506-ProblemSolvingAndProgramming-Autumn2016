package jl223vy_assign1;
import java.util.Scanner;
public class ShortName {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("First name:");
		String firstName=sc.nextLine();
		System.out.print("Last name:");
		String lastName=sc.nextLine();
		System.out.print("Short name:"+firstName.charAt(0)+". ");
		if(lastName.length()<4){
			System.out.print(lastName);
		}
		else{
			System.out.print(lastName.substring(0,4));
		}
		sc.close();
	}

}
