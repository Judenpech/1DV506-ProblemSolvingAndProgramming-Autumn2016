package jl223vy_assign4;
import java.util.*;
public class DrunkenWalk {
	public static void main(String[] args){
		int fIntoW=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size=sc.nextInt();
		System.out.print("Enter the number of steps: ");
		int steps=sc.nextInt();
		System.out.print("Enter the number of walks: ");
		int walks=sc.nextInt();
		
		for(int i=1; i<=walks; i++){
			RandomWalk rw=new RandomWalk(steps,size);
			while(rw.moreSteps()){
				rw.takeStep();
				if(!rw.inBounds()){
					fIntoW++;
					break;
				}	
			}
		}
		System.out.println("Out of "+walks+" drunk people, "+fIntoW+
				" ("+(int)(fIntoW/150.0*10000)/100.0+"%) fell into the water.");
		sc.close();
	}

}
