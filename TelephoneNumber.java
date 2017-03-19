package jl223vy_assign1;
import java.util.Random;
public class TelephoneNumber {
	public static void main(String[] args){
		Random rd=new Random();
		
		String areaC="0";
		for(int i=0;i<3;i++){
			areaC=areaC+rd.nextInt(10);
		}
		
		String localN=Integer.toString(rd.nextInt(9));
		for(int j=0;j<5;j++){
			localN=localN+rd.nextInt(10);
		}
		
		System.out.println("Telephone number is: "+areaC+"-"+localN);
	}

}
