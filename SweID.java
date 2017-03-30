package jl223vy_assign3;
import java.util.*;
public class SweID {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);		
		
		//application of method areEqual
		System.out.print("Please enter your Swedish identity number in the form YYMMDD-NNNN: ");
		String iDN1=sc.nextLine();
		System.out.print("Please enter your Swedish identity number in the form YYMMDD-NNNN again: ");
		String iDN2=sc.nextLine();
		if(!areEqual(iDN1,iDN2)){
			System.out.print("Please re-enter your Swedish identity number in the form YYMMDD-NNNN: ");
			iDN1=sc.nextLine();
		}
		else
			System.out.println("\n Checking...\n");
		
		//application of methods getFirstPart and getSecondPart
		System.out.println("Confirming YYMMDD part of your Swedish identity number: " + getFirstPart(iDN1));
		System.out.println("Confirming NNNN part of your Swedish identity number: "+ getSecondPart(iDN1));
    	
		//application of method isCorrect
		System.out.print("\nPlease enter your year of birth in the form YYYY: ");
    	int year=sc.nextInt();
		System.out.println("\n Confirming...");
		if(!isCorrect(iDN1,year)){
			System.out.print("\nUnvalid Swedish identity number!");
		}
		else{
			System.out.println("\nYour Swedish identity number has confirmed.");
		
			//application of methods isFemaleNumber and isMaleNumber
			int NO9=Character.getNumericValue(iDN1.charAt(9));
			if(isFemaleNumber(NO9))
				System.out.println("\n Hello Madam!");
			if(isMaleNumber(NO9))
			System.out.println("\n Hello Sir!");
			}
		sc.close();
	}
	
	public static String getFirstPart(String iDN){
		String firstP="";
		for(int i=0; i<iDN.length(); i++){
			if(iDN.charAt(i)=='-')
				break;
			firstP=firstP+iDN.charAt(i);				
		}
		return firstP;
	}
	
    public static String getSecondPart(String iDN){
		String secP="";
		for(int i=7; i<iDN.length(); i++){
			secP=secP+iDN.charAt(i);
		}
		return secP;
	}
    
    public static boolean isFemaleNumber(int no9){
    	if(no9%2==0)
    		return true;
    	else
    		return false;
    }

    public static boolean isMaleNumber(int no9){
    	if(no9%2!=0)
    		return true;
    	else
    		return false;
    }
    
    public static boolean areEqual(String fir, String sec){
    	for(int i=0; i<fir.length(); i++){
    		if(fir.charAt(i)!=sec.charAt(i))
    			return false;
    	}
    	return true;
    }
    
    public static boolean isCorrect(String iDN, int year){
    	int month=Integer.parseInt(iDN.substring(2,4));
    	int day=Integer.parseInt(iDN.substring(4,6));
    	String iDNW=getFirstPart(iDN)+getSecondPart(iDN); //ID number without '-'
    	if(month<1 || month>12)
    		return false;
    	
    	if(month==2){
    		if(isLeapYear(year)){
    			if(day>29 || day<1)
    				return false;
    		}
    		else{
        		if(day>28 || day<1)
        			return false;
        	}
    	}
    	else if(month==4 || month==6 || month==9 || month==11){
    		if(day<1 || day>30)
    			return false;
    	}
    	else{
    		if(day<1 || day>31)
    			return false;
    	}
    	
    	if(!isValidLD(iDNW)){ //check the last digit
    		return false;
    	}
    	return true;
    }
    
    public static boolean isLeapYear(int year){
    	if(year%4==0 && year%100!=0 || year%400==0) //四年一闰,百年不闰,四百年再闰。 four years one leap, hundred years no leap, four hundred years leap again
    		return true;
    	else
    		
    		return false;
    }
    
    public static boolean isValidLD(String iDN){
    	int[] digit=new int[10];
    	digit[9]=Character.getNumericValue(iDN.charAt(9));
    	int sum=0;
    	for(int i=0; i<iDN.length()-1; i++){
    		digit[i]=Character.getNumericValue(iDN.charAt(i));
    		if(i%2==0){
    			digit[i]=digit[i]*2;
    			if(digit[i]>=10){
    				digit[i]=digit[i]/10+digit[i]%10;
    			}
    		}
    		sum=sum+digit[i];
    	}
    	int correctLD=10-sum%10;
    	if(digit[9]==correctLD)
    		return true;
    	else
    		return false;
    }

}
