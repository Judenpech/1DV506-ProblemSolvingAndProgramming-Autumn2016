package jl223vy_assign2;
import java.util.*;
public class FrequencyTable {
	public static void main(String[] args){
		System.out.println("Frequencies when rolling a dice 6000 times.");
		int[] nF=new int[7];
		Random rd=new Random();
		int temp;
		for(int i=1; i<=6000; i++){
			temp=rd.nextInt(6)+1;
			nF[temp]++;
		}
		for(int i=1; i<=6; i++){
		System.out.println(i+": "+nF[i]);
		}
	}

}
