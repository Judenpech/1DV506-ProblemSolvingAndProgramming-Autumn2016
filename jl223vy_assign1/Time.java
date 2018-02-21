package jl223vy_assign1;
import java.util.Scanner;
public class Time {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Give a number of seconds:");
		int seconds=sc.nextInt();
		int h=seconds/3600;
		int m=(seconds%3600)/60;
		int s=seconds%60;
		System.out.println("This corresponds to: " + h + " hours, "+ m +" minutes and "+ s +" seconds.");
		sc.close();
	}

}
