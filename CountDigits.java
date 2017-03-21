package jl223vy_assign2;
import java.util.*;
public class CountDigits {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide a positive integer: ");
		String n=sc.nextLine();
		int zeros=0, odd=0, even=0;
		for(int i=0; i<n.length(); i++)
		{
			int tN=Character.getNumericValue(n.charAt(i));
			if(n.charAt(i)!='0')
			{
				if(tN%2==0)
					even++;
				else
					odd++;
			}
			else        //==0
				zeros++;
		}
		System.out.println("Zeros:"+zeros);
		System.out.println("Odd:"+odd);
		System.out.println("Even:"+even);
		sc.close();
	}

}
