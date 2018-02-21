package jl223vy_assign3;

public class Fraction {
	private int n;
	private int d;
	public Fraction(){
		n=0;
		d=0;
	}
	public Fraction(int newN, int newD){
		if(newD==0){
			System.out.println("error! The denominator cannot be 0.");
			//or
			//throw new IllegalStateException("error! The denominator cannot be 0.");
		}
		else{
			setND(newN,newD);
		    rightMinusPosition();
		    mostSimplifiedForm();
		}
	}
	private void setND(int newN, int newD){
		n=newN;
		d=newD;
	}
	private void rightMinusPosition(){
		if(!isNegative()){
			n=Math.abs(n);
			d=Math.abs(d);
		}
		else{
			n=-(Math.abs(n));
			d=Math.abs(d);
		}
	}
	private void mostSimplifiedForm(){ 
		int gCD=getGreatestCommonDivisor(n,d); 
		n=n/gCD;
		d=d/gCD;		
	}
	private int getGreatestCommonDivisor(int a, int b){
		a=Math.abs(a);
		b=Math.abs(b);
		if(a<b){
			int t=a;
			a=b;
			b=t;
		}
		int r;
		while(a%b!=0){
			r=a%b;
			a=b;
			b=r;
		}
		return b;
	}
	
	public int getNumerator(){ return n; }
	public int getDenominator(){ return d; }
	
	public boolean isNegative(){
		if(n>0 && d>0 || n<0 && d<0)
			return false;
		else 
			return true;
	}
	private Fraction reductionOfFraction(int n, int d){
		int gCD=getGreatestCommonDivisor(n,d); 
		n=n/gCD;
		d=d/gCD;
    	return new Fraction(n,d);
	}
	public Fraction add(Fraction fOA){
		int nOA,dOA;
		Fraction tempF;
		if(fOA.d==d){
			nOA=fOA.n+n;
			dOA=d;
		}
		else{
			int lCM=d*fOA.d/getGreatestCommonDivisor(d,fOA.d); //lowest common multiple
			nOA=n*(lCM/d)+fOA.n*(lCM/fOA.d);
			dOA=lCM;
		}
		if(nOA==0)
			tempF=new Fraction();
		else{
			tempF=reductionOfFraction(nOA,dOA);
		}
    	return tempF;
	}
    public Fraction subtract(Fraction fOS){
    	int nOS,dOS;
    	Fraction tempF;
		if(fOS.d==d){
			nOS=fOS.n-n;
			dOS=d;
		}
		else{
			int lCM=d*fOS.d/getGreatestCommonDivisor(d,fOS.d);
			nOS=n*(lCM/d)-fOS.n*(lCM/fOS.d);
			dOS=lCM;
		}
		if(nOS==0)
			tempF=new Fraction();
		else{
			tempF=reductionOfFraction(nOS,dOS);
		}
    	return tempF;
	}
    public Fraction multiply(Fraction fOM){
    	int nOM,dOM;
    	Fraction tempF;
    	nOM=n*fOM.n;
    	dOM=d*fOM.d;
    	if(nOM==0)
    		tempF=new Fraction();
		else{
			tempF=reductionOfFraction(nOM,dOM);
		}
    	return tempF;
    }
    public Fraction divide(Fraction fOD){
    	Fraction tempF;
    	if(d==0 || fOD.d==0){
    		throw new IllegalStateException("error! The denominator cannot be 0.");
    	}
    	else{
    	int nOD,dOD;
    	nOD=n*fOD.d;
    	dOD=d*fOD.n;
    	tempF=reductionOfFraction(nOD,dOD);
    	}
    	return tempF;
    }
    public boolean isEqualTo(Fraction fOE){
    	return n==fOE.n && d==fOE.d;
    }
    public String toString(){
    	return n + "/" + d;
    }

}
