package jl223vy_assign1;
import java.util.Scanner;
public class Seconds {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Hours:");
		int Hours=sc.nextInt();
		System.out.print("Minutes:");
		int Minutes=sc.nextInt();
		System.out.print("Seconds:");
		int Seconds=sc.nextInt();
		int sum=Hours*3600+Minutes*60+Seconds;
		System.out.println("\nTotal time measured in seconds:"+sum);
        sc.close();
	}

}
