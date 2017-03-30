package jl223vy_assign3;
import java.util.*;
import jl223vy_assign3.Card.Ranks;
import jl223vy_assign3.Card.Suits;
public class Deck {
	private ArrayList<Card> deck=new ArrayList<Card>();
	private int cardsUsed=0;
	private int cardsLeft=52;
	
	public Deck(){
		for (Suits suit: Suits.values()){
            for (Ranks rank: Ranks.values()){
                deck.add(new Card(rank,suit));
            }
		}
	}
    
	public void shuffle(){
    	if(cardsLeft!=52)
    		throw new IllegalStateException("shuffle cannot be used without 52 cards");
    	else{
    		 Collections.shuffle(deck);
    	     cardsUsed=0;
    	 	 cardsLeft=52;
    	}   		
    }
	public void putAllCardsBackToDeck(){
		cardsUsed=0;
	 	cardsLeft=52;
	}
    
    public int cardsLeft(){ return cardsLeft; }
    
    public void dealCard(){
    	 if (cardsLeft<0)
             throw new IllegalStateException("No cards are left in the deck.");
         cardsUsed++;
         cardsLeft--;
    }
    public int dealtCardRank(){
    	return deck.get(cardsUsed-1).getRank().ordinal();
    }
    public void dealtCards(){
    	for(int i=0; i<cardsUsed; i++){
    		System.out.println(deck.get(i).toString());
    	}
    }
}
