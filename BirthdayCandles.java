package jl223vy_assign2;

public class BirthdayCandles {
	public static void main(String[] args){
		int box=0, candles=0, sumB=0;
		for(int year=1; year<=100; year++){
			if(candles<year){        //candles are not enough
				if(year-candles<24)   
					box=1;
				else{
					if((year-candles)%24==0)
					box=(year-candles)/24;
					else
					box=(year-candles)/24+1; //+1 is for decimal part
				}
				candles=candles+box*24-year;
			}			
			else{   //candles are equal or more than year (candles>=year)
				box=0;
				candles=candles-year;
			}
			if(box!=0){
				System.out.println("Before birthday "+year+", buy "+box+" box(es)"); 
			}
			sumB=sumB+box;
		}
		System.out.println("\nTotal number of boxes: "+sumB+", Remaining candles: "+candles);
	}

}
