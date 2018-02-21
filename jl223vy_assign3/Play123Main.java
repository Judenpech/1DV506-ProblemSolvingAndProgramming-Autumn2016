package jl223vy_assign3;
import java.text.DecimalFormat;
public class Play123Main {
	public static void main(String[] args){
		Deck deck=new Deck();
		DecimalFormat df=new DecimalFormat("0.000");
		int probability=0;
		for(int i=1; i<=10000; i++){
			if(play123(deck)){
				probability++;
			}
			deck.putAllCardsBackToDeck();
		}
		System.out.println("After play card game 10000 times, the probability of win is: "+
		df.format(probability/10000.0*100)+"%");
	}
		
	public static boolean play123(Deck deck){
		deck.shuffle();
		for(int i=1,j=0; i<=52; i++){
			deck.dealCard();
			if(j==deck.dealtCardRank())
				return false; 
			j++;
			if(j==3)
				j=0;
			}
		return true;
		}
	}

