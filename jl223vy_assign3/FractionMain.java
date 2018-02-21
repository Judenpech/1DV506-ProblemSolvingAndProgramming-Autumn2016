package jl223vy_assign3;

public class FractionMain {
	public static void main(String[] args){		
		Fraction f1=new Fraction(3,8);
		Fraction f2=new Fraction(35,50);
		System.out.println("f1: "+f1.toString()+"\nNumerator: "+f1.getNumerator()+"  Denominator: "+f1.getDenominator());
		System.out.println("f2 in the most simplified form: "+f2.toString()+"\nNumerator: "+f2.getNumerator()+"  Denominator: "+f2.getDenominator());
		
		System.out.println();
		Fraction f=new Fraction(2,0);
		System.out.println("f: "+f.toString());
		
		Fraction f3=new Fraction(-7,50);
		Fraction f4=new Fraction(7,-50);
		System.out.println("\nf2("+f2.toString()+") is negative? "+f2.isNegative());
		System.out.println("f3("+f3.toString()+") is negative? "+f3.isNegative());
		System.out.println("f4("+f4.toString()+") is negative? "+f4.isNegative());
		
		Fraction result;
		result=f1.add(f2);
		System.out.println("\nf1 add f2:      "+f1.toString()+" + "+f2.toString()+" = "+result);
		result=f1.subtract(f2);
		System.out.println("f1 subtract f2: "+f1.toString()+" - "+f2.toString()+" = "+result);
		result=f1.multiply(f2);
		System.out.println("f1 multiply f2: "+f1.toString()+" * "+f2.toString()+" = "+result);
		result=f1.divide(f2);
		System.out.println("f1 divide f2:   "+f1.toString()+" / "+f2.toString()+" = "+result);
		
		Fraction f5=new Fraction(3,8);
		System.out.println("\nf1("+f1.toString()+") is equal to f2("+f2.toString()+")? "+f1.isEqualTo(f2));
		System.out.println("f1("+f1.toString()+") is equal to f5("+f5.toString()+")? "+f1.isEqualTo(f5));		
	}

}
