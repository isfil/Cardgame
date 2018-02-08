package cards;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	public void addCard(Card card){
		cards.add(card);
	}
	
	public Card playCard(int index){
		return cards.remove(index);
	}
	public String toString(){
		return cards.toString();
	}
	public boolean hasCards(){
		return cards.size()>0;
	}
	public boolean has3Cards(){
		return cards.size()<3;
	}
	//Ver o trunfo da ArrayList
	public Card peakCard(){
		return cards.get(52);
		
	}
	
	//ver o trunfo como string
	public String peakCardWin(){
		return cards.get(0).toString();
		
	}
	public String showCard(int i) {
		return cards.get(i).toString();
	}

	
}