package cards;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	static Random random = new Random() ;
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Deck(){
		for (int i=0; i< Suit.values().length;i++){
			for (int k=0; k < Value.values().length;k++){
				Card newCard = new Card (Suit.values()[i],Value.values()[k]);
				cards.add(newCard);			}
		}
		
	}
	public void Shufle(){
		for (int i=0; i<500 ;i++){
			int randomint = random.nextInt(52);
			Card a = cards.remove(randomint);
			cards.add(a);
			
		}
	}
	public Card getCard(){
		
		return cards.remove(0);
	}
	public Card peakCard() {
		int randomint = random.nextInt(52);
		return cards.get(randomint);
	}
	
	
	public boolean hasCards(){
		
		return cards.size()>0;
		
	}
	public static void main (String[] args){
		System.out.println();
	}

}
