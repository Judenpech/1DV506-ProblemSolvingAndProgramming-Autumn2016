package jl223vy_assign4.sort_cities;
import java.util.*;
import java.io.*;

public class SortCities {
	public static void main(String[] args) throws IOException{
		String path="C:\\Temp\\cities.dat";
		
		try{
			File f=new File(path);
			Scanner sc=new Scanner(f);
			int n=0;
			
			ArrayList<String> al=new ArrayList<>();
			while(sc.hasNextLine()){
				al.add(sc.nextLine());
				n++;
			}
			City[] c=new City[n];
			for(int i=0; i<n; i++){
				c[i]=new City(al.get(i));
			}
			Arrays.sort(c);
			
			System.out.println("Reading cities from file: "+f.getAbsolutePath());
			System.out.println("Number of cities found: "+n);
			System.out.println();			
			for(City element: c){
				System.out.println(element);
			}					
			sc.close();
		}catch(IOException o){
			o.printStackTrace();
		}
		
	}
}
