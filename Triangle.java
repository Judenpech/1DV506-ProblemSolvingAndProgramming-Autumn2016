package jl223vy_assign2;
import java.util.*;
public class Triangle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide an odd positive integer: ");
		int n=sc.nextInt();
		if(n%2==0 || n<0){          //exit if entered an even or negative digit 
			 System.out.print("Error!");
			 System.exit(0);
		}		
/*  
     or re-enter an odd positive integer
		while(n%2==0 || n<0){
			System.out.print("Provide an odd positive integer: ");
			n=sc.nextInt();
		}
*/			
		System.out.println("Right-Angled Triangle:");
		for(int i=1; i<=n; i++){   
			for(int j=0; j<n-i; j++){  
				System.out.print(" ");
			}
			for(int h=1; h<=i; h++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nIsosceles Triangle:");
		for(int i=1; i<=n; i=i+2){
			for(int j=1; j<=(n-i)/2; j++){
				System.out.print(" ");
			}
			for(int h=1; h<=i; h++){
				System.out.print("*");
			}
			System.out.println();
		}
//		for(int i=1; i<=n; i=i+2){
//			for(int j=n-i; j>0; j-=2){
//				System.out.print(" ");
//			}
//			for(int h=0; h<i; h++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		sc.close();
	}

}
