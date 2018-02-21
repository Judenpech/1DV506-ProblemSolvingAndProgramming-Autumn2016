package jl223vy_assign3;
import java.util.*;
public class Arrays {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] n={3,4,5,6,7};
		
		//method sum
		System.out.println("test of method sum\n sum= " + sum(n));
		
		//method toString
		System.out.println("\ntest of method toString");
		String str=Arrays.toString(n);
		System.out.println(" n = " + str);
		
		//method addN
		System.out.println("\ntest of method addN");
		System.out.print(" please enter n to add it to array:");
		int nOfaddN=sc.nextInt();
		int[] naddN=addN(n,nOfaddN);
		System.out.println(" old array = " + toString(n));
		System.out.println(" new array = " + toString(naddN));
		
		//method reverse
		System.out.println("\ntest of method reverse");
		int[] nreverse=reverse(n);
		System.out.println(" old array = " + toString(n));
		System.out.println(" new array = " + toString(nreverse));
		
		//method hasN
		System.out.println("\ntest of method hasN");
		System.out.print(" please enter n: ");
		int nOfhasN=sc.nextInt();
		System.out.println(" old array = " + toString(n));
		System.out.println(" is n contains in array? "+ hasN(n,nOfhasN));
		
		//method replaceAll
		System.out.println("\ntest of method replaceAll");
		System.out.println(" old array = " + toString(n));
		System.out.print(" please enter a number from array:");
		int old=sc.nextInt();
		System.out.print(" please enter a new number:");
		int nw=sc.nextInt();
		sc.nextLine();
		replaceAll(n,old,nw);
		System.out.println(" new array = " + toString(n));
		
		//method sort
		System.out.println("\ntest of method sort");
		int[] nOfsort=sort(n);
		System.out.println(" sorted array = " + toString(nOfsort));
		
		//method hasSubsequence
		System.out.println("\ntest of method hasSubsequence");
		System.out.print(" please enter subsequence like 3,4,5,...: ");
		StringBuilder sb=new StringBuilder();
		String tSub=sc.nextLine();
		for(int i=0; i<tSub.length(); i++){
			if(tSub.charAt(i)!=',')
				sb.append(tSub.charAt(i));
		}
		int subL=sb.length();
		int[] sub=new int[subL];
		for(int i=0; i<sb.length(); i++){
			sub[i]=Character.getNumericValue(sb.charAt(i));
		}
		System.out.println(" old array = " + toString(n));
		System.out.println(" subsequence = " + toString(sub));
		System.out.println(" has subsequence? "+ hasSubsequence(n,sub));
		
		sc.close();
	}
	
	public static int sum(int[] arr){
		int s=0;
		for(int element: arr){
			s=s+element;
		}
		return s;
	}

	public static String toString(int[] arr){
		String r="{";
		for(int i=0; i<arr.length; i++){
			if(i==arr.length-1)
				r=r+arr[i];
			else
				r=r+arr[i]+",";
		}
		r=r+"}";
		return r;
//		StringBuilder sb=new StringBuilder();
//		sb.append("{");
//		for(int element: arr){
//			sb.append(element+",");
//		}
//		sb.deleteCharAt(sb.length()-1); //delete the last comma
//		sb.append("}");
//		return sb.toString();
	}

	public static int[] addN(int[] arr, int n){
		int[] tArr=new int[arr.length+1]; //plus 1 to store n
		int i;
		for(i=0; i<arr.length; i++){
			tArr[i]=arr[i];
		}
		tArr[i]=n;
		return tArr;
	}
	
	public static int[] reverse(int[] arr){
		int[] tArr=new int[arr.length];
		for(int i=0; i<tArr.length; i++){
			tArr[i]=arr[i];
		}	
		for(int i=0,j=tArr.length-1; i<tArr.length/2; i++,j--){//reverse
			int temp=tArr[i];
			tArr[i]=tArr[j];
			tArr[j]=temp;
		}
		return tArr;
	}
	
	public static boolean hasN(int[] arr, int n){
		for(int element: arr){
			if(element==n)
				return true;
		}
		return false;
	}
	
	public static void replaceAll(int[] arr, int old, int nw){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==old)
				arr[i]=nw;
		}
	}
	
	public static int[] sort(int[] arr){
		int[] tArr=new int[arr.length];
		for(int i=0; i<tArr.length; i++){
			tArr[i]=arr[i];
		}	
		java.util.Arrays.sort(tArr);
		return tArr;
	}
	
	public static boolean hasSubsequence(int[] arr, int[] sub){
		String a="",s="";
		for(int e: arr){
			a=a+e;
		}
		for(int e: sub){
			s=s+e;
		}
		if(a.contains(s))
			return true;
		else
			return false;
//		StringBuilder sbarr=new StringBuilder();
//		StringBuilder sbsub=new StringBuilder();
//		if(sub.length==0)
//			return false;
//		for(int element: arr){
//			sbarr.append(element);
//		}
//		for(int element: sub){
//			sbsub.append(element);
//		}
//		return sbarr.toString().contains(sbsub.toString());
	}
}

