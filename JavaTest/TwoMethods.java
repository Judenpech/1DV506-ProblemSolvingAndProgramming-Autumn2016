package JavaTest;
import java.util.*;
public class TwoMethods {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter a sentance: ");
		String str=sc.nextLine();
		System.out.println("Count digits: "+countDigits(str));
		int[] arr=new int[]{1,2,3,4,5,6,7,8,9,1};
		System.out.println("does array has duplicates? "+hasDuplicates(arr));
		sc.close();
	}
	
	public static int countDigits(String str){
		int count=0;
		for(int i=0; i<str.length(); i++){
			if(Character.isDigit(str.charAt(i)))
				count++;
		}
		return count;
	}
	public static boolean hasDuplicates(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j])
					return true;
			}
		}
		return false;
	}

}
