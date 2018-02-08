package cards;

public class Card {
	private Suit suit;
	private Value value;
	
	public Card (Suit suit, Value value){
		this.suit=suit;
		this.value =value;
	}
	public String toString(){
		return "[" + suit + "|" + value + "]";	
		}
	public Suit getSuit(){
		return suit;
	}
	public Value getValue(){
		return value;
	}
	
	public static void main (String[] args){
		

		
	}
}
