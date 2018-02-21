package jl223vy_assign2;
import java.util.*;
public class Backwards {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide a line of text: ");
		String aS = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i=aS.length()-1; i>=0; i--){
			sb.append(aS.charAt(i));
		}
		System.out.println("Backwards: " + sb.toString());
		
/*method 2
		StringBuilder sb=new StringBuilder();
		sb.append(sc.nextLine());
		sb.reverse();
		System.out.println("Backwards: " + sb.toString());
*/
		
		sc.close();
	}

}
