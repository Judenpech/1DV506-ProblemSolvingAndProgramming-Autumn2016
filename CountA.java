package jl223vy_assign2;
import java.util.*;
public class CountA {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide a line of text: ");
		String cA = sc.nextLine();
		int na=0, nA=0; 
		for(int i=0; i<cA.length(); i++){
			if(cA.charAt(i)=='a')
				na++;
			if(cA.charAt(i)=='A')
				nA++;
		}
		System.out.println("Number of 'a': " + na);
		System.out.println("Number of 'A': " + nA);
		sc.close();
	}

}
