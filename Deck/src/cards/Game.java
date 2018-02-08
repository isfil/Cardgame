package cards;

import javax.swing.JOptionPane;

public class Game {
	
	private Deck deck = new Deck();
	private Hand player1 = new Hand();
	private Hand player2 = new Hand();
	
	private int pointsPlayer1=0;
	private int pointsPlayer2=0;

	public void giveCards() {
		deck.Shufle();
		
//		while(player1.has3Cards()){
//			player1.addCard(deck.getCard());
//			player2.addCard(deck.getCard());
//		}
//		
//		while(deck.hasCards ()){
//			player1.addCard(deck.getCard());
//			player2.addCard(deck.getCard());
//		}
	}
	
	
	public void playGame(){
		while(player1.hasCards()){
		Card p1Card = player1.playCard(0);
		Card p2Card = player2.playCard(0);
		
		if ( p1Card.getValue().ordinal()>p2Card.getValue().ordinal()){
			pointsPlayer1++;
		} else if (p1Card.getValue().ordinal()<p2Card.getValue().ordinal()){
			pointsPlayer2++;
		}
		System.out.println("(" + pointsPlayer1 + ", " + pointsPlayer2 + ")" + p1Card + p2Card);
		}
		
		if(pointsPlayer1>pointsPlayer2){
			JOptionPane.showMessageDialog(null, "Ganhou o Jogador1");
		}else if (pointsPlayer1 < pointsPlayer2){
			JOptionPane.showMessageDialog(null, "Ganhou o Jogador2");
		}else {
			JOptionPane.showMessageDialog(null, "Empataram");
		}
	}
	


	public static void main (String [] args){
		Game newgame = new Game();
		newgame.giveCards();
		newgame.playGame();
		
		
	}

}
