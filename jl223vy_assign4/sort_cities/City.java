package jl223vy_assign4.sort_cities;

public class City implements Comparable<City>{
	private int zipCode;
	private String cityName;
	
	public City(String line){
		int i=0;
		String t="";
		if(line.charAt(i)<0 && line.charAt(i)>9){
			while(line.charAt(i)!=';'){
				t=t+line.charAt(i);
				i++;
			}
			zipCode=Integer.valueOf(line.substring(i+1));
			cityName=t;
		}
		else{
			while(line.charAt(i)!=';'){
				t=t+line.charAt(i);
				i++;
			}
			zipCode=Integer.valueOf(t);
			cityName=line.substring(i+1);
		}	
	}
	public int getZipCode() {return this.zipCode;}
	public String getCityName() {return this.cityName;}
	public String toString() {return zipCode+" "+cityName; }

	public int compareTo(City cZ){
		return this.zipCode-cZ.zipCode;
	}
	
}
