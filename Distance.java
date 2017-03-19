package jl223vy_assign1;
import java.text.DecimalFormat;
import java.util.*;
public class Distance {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter first coordinate in the form (x,y): ");
		String xy1=sc.nextLine();
		System.out.print("Please enter second coordinate in the form (x,y): ");
		String xy2=sc.nextLine();
		
		String tx1="",tx2="",ty1="",ty2="";
		for(int i=1; i<xy1.length(); i++){
			if(xy1.charAt(i)==','){
				ty1=xy1.substring(i+1, xy1.length()-1);
				break;
				}
			tx1=tx1+xy1.charAt(i);
		}
		int x1=Integer.parseInt(tx1);
		int y1=Integer.parseInt(ty1);
		
		for(int i=1; i<xy2.length(); i++){
			if(xy2.charAt(i)==','){
				ty2=xy1.substring(i+1, xy2.length()-1);
				break;
				}
			tx2=tx2+xy2.charAt(i);
		}
		int x2=Integer.parseInt(tx2);
		int y2=Integer.parseInt(ty2);
		
		DecimalFormat df=new DecimalFormat("0.000");
		String distance=df.format(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
		System.out.println("Distance:"+distance);
		sc.close();
	}

}
