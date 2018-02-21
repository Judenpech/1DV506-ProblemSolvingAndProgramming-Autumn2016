package jl223vy_assign1;
import java.text.DecimalFormat;
import java.util.*;
public class Convert {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter temperature in Fahrenheit:");
		Double f=sc.nextDouble();
		Double c=(f-32)*5/9.0;
		DecimalFormat df=new DecimalFormat("0.0");
		String celsius=df.format(c);
		System.out.println("Temperature in Celsius: "+ celsius +"¡æ");
		sc.close();
	}

}
