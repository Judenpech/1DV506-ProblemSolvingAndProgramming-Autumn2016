package jl223vy_assign2;
import java.util.*;
public class SecondLargest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide 10 integers: ");
		int t;	
		int max=sc.nextInt();
		int sec=sc.nextInt();	
		for(int i=1; i<=8; i++){
			t=sc.nextInt();
			if(t>max){    
				sec=max;
				max=t;
			}
			if(t<max && t>sec)
				sec=t;
		}
		System.out.println("The second largest is: "+sec);
		sc.close();
	}

}
