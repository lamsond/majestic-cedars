package org.whrhs.dlamson.csa.u9.l0;

public class War {
	
	Deck deck;
	int score1, score2;
	Card card1, card2;
	
	public War() {
		deck = new Deck();
		score1 = 0;
		score2 = 0;
		
	}
	
	public void printScore() {
		System.out.println("Player 1: " + score1 + " Player 2: " + score2);
	}
	
	public void playHand() {
		printScore();
		card1 = deck.deal();
		card2 = deck.deal();
		System.out.println("Player 1 Card: " + card1);
		System.out.println("Player 2 Card: " + card2);
		if(card1.compareTo(card2) > 0) {
			System.out.println("Player 1 Wins!");
		}
		else if(card1.compareTo(card2) == 0) {
			System.out.println("Tie");
		}
		else {
			System.out.println("Player 2 Wins!");			
		}
		
	}
	

}
