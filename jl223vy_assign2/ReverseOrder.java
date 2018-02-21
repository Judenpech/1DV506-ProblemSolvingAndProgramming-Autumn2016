package jl223vy_assign2;
import java.util.*;
public class ReverseOrder {
	public static void main(String[] args){
		System.out.println("Enter positive integers. End by giving a negative integer.");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		int i=1;
		do{
			System.out.print("Integer "+i+":");
			al.add(sc.nextLine());
			i++;
		}while(Integer.parseInt(al.get(i-2))>0);
		System.out.println("\nNumber of positive integers: "+(i-2));
		Collections.reverse(al); //reverse order
		al.remove(0); //remove negative integer
		
		System.out.print("In reverse order: "+al.toString());
//		for(int j=0; j<al.size(); j++){
//			System.out.print(al.get(j)+", ");
//		}
		sc.close();
	}

}
