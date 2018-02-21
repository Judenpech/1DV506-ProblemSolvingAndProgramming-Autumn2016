package jl223vy_assign1;
import java.util.Scanner;
public class SumOfThree {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Provide a three digit number:");
		int digits=sc.nextInt();
		int sum=digits/100+(digits%100)/10+digits%10;
		System.out.println("Sum of digits:"+sum);
		sc.close();
	}

}
