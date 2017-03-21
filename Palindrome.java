package jl223vy_assign2;
import java.util.*;
public class Palindrome {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a line of text: ");
		String line=sc.nextLine();
		int i=0, j=line.length()-1, notL=0;
		while(i<=line.length()-1 && j>=0){	
			char frontEachL=Character.toLowerCase(line.charAt(i));
			char backEachL=Character.toLowerCase(line.charAt(j));
			if(!Character.isLetter(frontEachL))     //in case a text of line are all not letters
				notL++;
			if(!Character.isLetter(frontEachL)){  //skip if it isn't a letter
				i++;
			    continue;
			}
			if(!Character.isLetter(backEachL)){   //skip if it isn't a letter
				j--;
			    continue;
			}
			if(frontEachL!=backEachL){  //if one letter don't match
			System.out.println("The line of text is not Palindrome");
			System.exit(0);
			}
			i++;
			j--;
		}
		if(notL==line.length())  //situation: all not letters
			System.out.println("The line of text is not Palindrome");
		else
			System.out.println("The line of text is Palindrome");
		sc.close();		 
	}

}
