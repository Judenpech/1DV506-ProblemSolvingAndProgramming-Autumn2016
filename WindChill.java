package jl223vy_assign1;
import java.text.DecimalFormat;
import java.util.*;
public class WindChill {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Temperature:");
		Double t=sc.nextDouble();
		System.out.print("Wind speed:");
		Double wS=sc.nextDouble();
		Double wCT=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(wS,0.16);
		DecimalFormat df=new DecimalFormat("#.0");
		System.out.println("\nWind Chill Temperature:"+df.format(wCT));
		sc.close();
	}
}
