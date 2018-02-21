package jl223vy_assign2;
import java.util.*;
public class LargestK {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give a positive integer: ");
		int n=sc.nextInt();
		if(n<0){
			System.out.println("Error, must be an positive integer!");
			System.exit(0);
		}
		int k=0,sum=0;
		for(; sum<=n; k+=2){
			sum=sum+k;
		}
		System.out.println("The largest K such that 0+2+4+6+...+K < "+n+" => K="+k);
		
/* method 2		
		do{
			k=k+2;
		    sum=sum+k;
	    }while(sum<n);
		System.out.println("The largest K such that 0+2+4+6+...+K < "+n+" => K="+(k-2));
*/
		sc.close();
	}
		
}
