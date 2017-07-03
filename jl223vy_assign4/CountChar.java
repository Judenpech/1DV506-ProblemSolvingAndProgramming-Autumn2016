package jl223vy_assign4;
import java.io.*;
import java.util.*;
public class CountChar {
	public static void main(String[] args){
		try{
			String path="C:\\Temp\\HistoryOfProgramming.txt";
			File file=new File(path);
			Scanner sc=new Scanner(file);
			sc.useDelimiter("\r|\n|\t|\b|\f");
			StringBuilder sb=new StringBuilder();
			int[] typeCount=new int[4];	
			while(sc.hasNextLine()){
				sb.append(sc.next());
			}
			for(int i=0; i<sb.length(); i++){
				if(Character.isUpperCase(sb.charAt(i)))
					typeCount[0]++;
				else if(Character.isLowerCase(sb.charAt(i)))
					typeCount[1]++;
				else if(Character.isWhitespace(sb.charAt(i)))
					typeCount[2]++;
				else
					typeCount[3]++;
			}
			System.out.println("Number of upper case letters: "+typeCount[0]);
			System.out.println("Number of lower case letters: "+typeCount[1]);
			System.out.println("Number of \"whitespaces\": "+typeCount[2]);
			System.out.println("Number of others: "+typeCount[3]);
			sc.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
