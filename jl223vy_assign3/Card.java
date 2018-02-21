package jl223vy_assign3;

public class Card{
    public enum Suits{ DIAMONDS,CLUBS,HEARTS,SPADES }
	public static enum Ranks{ ACE,DEUCE,THREE,FOUR,FIVE,SIX,
		SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING }	
	private final Ranks rank;
	private final Suits suit;
	
	public Card(Ranks Rank,Suits Suit){  	
        this.rank = Rank;
        this.suit = Suit;  
    }    
    
	public Suits getSuit(){ return suit; }    
    public Ranks getRank(){ return rank; }  
  
    public String toString(){  
        return rank+" of "+suit;  
    }   

}
