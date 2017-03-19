package jl223vy_assign1;
import java.util.Scanner;
public class BMI {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give your length in meters:");
		Double length = sc.nextDouble();
		System.out.print("Give your weight in kilograms:");
		Double weight = sc.nextDouble();
		int bmi = (int)Math.round(weight / (length * length));
		System.out.println("Your BMI is:" + bmi);
		sc.close();
	}

}
