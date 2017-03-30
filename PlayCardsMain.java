package jl223vy_assign3;

import java.util.Scanner;

public class PlayCardsMain {
	public static void main(String[] args){
		Deck deck=new Deck();
		Scanner sc=new Scanner(System.in);
		int dealTimes;
		
		System.out.print("How many cards you want to deal? ");
		do{
			System.out.print("please enter number bewteen 0 to 52: ");
			dealTimes=sc.nextInt();
		}while(dealTimes<0 || dealTimes>52);
		
		System.out.println("\nShuffling the deck..");
		deck.shuffle();
		
		System.out.println("\nDealing cards..");
		for(int i=1; i<=dealTimes; i++){
			deck.dealCard();			
		}
		
		System.out.println("\nremaining cards: "+deck.cardsLeft());
		System.out.println("Cards that have been dealt:");
		deck.dealtCards();
		sc.close();
    }  

}
