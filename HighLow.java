package jl223vy_assign2;
import java.util.*;
public class HighLow {
	public static void main(String[] args){
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int n=rd.nextInt(100)+1; //random integer between [1,100]
		for(int i=1; i<=11; i++){
			
			if(i==11){           //exit if tried more than 10 times
				System.out.println("\nSorry!\nYou have tried 10 times!\nThe correct number is: "+n);
				System.exit(0);
			}
			
			System.out.print("Guess "+ i +": ");
			int guess=sc.nextInt();
			
			if(guess>n){
				System.out.println(" Clue: lower");
				continue;
			}
			else if(guess<n){
				System.out.println(" Clue: higher");
				continue;
			}
			else{
				System.out.println(" Correct answer after only "+ i +" guesses ¨C Excellent!");
				break;
			}
		}
		sc.close();				
	}
}
