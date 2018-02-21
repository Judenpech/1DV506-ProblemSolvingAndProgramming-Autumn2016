package jl223vy_assign2;
import java.util.*;
import java.text.*;
public class SalaryRevision {
	public static void main(String[] args){
		System.out.print("Provide salaries (and terminate input with 'X'): ");
		ArrayList<String> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0");
		while(sc.hasNextInt()){
			al.add(sc.next());
		}
		int size=al.size();
		Collections.sort(al);
		//calculate median
		double median;
		if(size%2==0){
			median=(Integer.parseInt(al.get(size/2))+Integer.parseInt(al.get(size/2-1)))/2.0;
		}
		else{
			median=Double.parseDouble(al.get(size/2));
		}
		System.out.println("Median: "+df.format(median));
		
		//calculate average
		double average;
		int sum=0;
		for(int i=0; i<size; i++){
			sum=sum+Integer.parseInt(al.get(i));
		}
		average=sum/size;
		System.out.println("Average: "+df.format(average));
		
		// calculate gap			
		int gap=Integer.parseInt(al.get(size-1))-Integer.parseInt(al.get(0));
		System.out.println("Gap: "+gap);
		
		sc.close();
	}

}
