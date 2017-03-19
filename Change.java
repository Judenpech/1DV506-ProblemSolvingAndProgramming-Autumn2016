package jl223vy_assign1;
import java.util.Scanner;
public class Change {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Price:");
		Double price=sc.nextDouble();
		System.out.print("Payment:");
		Double payment=sc.nextDouble();
		int change=(int)Math.round(payment-price);
		System.out.println("Change:"+change+" kronor");
		int i,j;
		i=change/1000;
		System.out.println("1000kr bills:"+i);
		i=change%1000;j=i/500;
		System.out.println(" 500kr bills:"+j);
		i=i%500;j=i/100;
		System.out.println(" 100kr bills:"+j);
		i=i%100;j=i/50;
		System.out.println("  50kr bills:"+j);
		i=i%50;j=i/20;
		System.out.println("  20kr bills:"+j);
		i=i%20;j=i/10;
		System.out.println("  10kr coins:"+j);
		i=i%10;j=i/5;
		System.out.println("   5kr coins:"+j);
		i=i-j*5;
		System.out.println("   1kr coins:"+i);
		sc.close();		
	}

}
