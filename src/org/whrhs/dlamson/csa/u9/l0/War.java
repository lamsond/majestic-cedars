package org.whrhs.dlamson.csa.u9.l0;

import java.util.ArrayList;

public class War {
	
	Deck deck;
	ArrayList<Card> soldiers1, soldiers2;
	Card card1, card2;
	
	public War() {
		deck = new Deck();
		soldiers1 = new ArrayList<>();
		soldiers2 = new ArrayList<>();
	}
	
	public void shuffle(ArrayList<Card> cards) {
		int n = cards.size();
		for(int i = 0; i < n; i++) {
			int rand = (int)(Math.random() * (n - i) + i);
			Card temp = cards.get(i);
			cards.set(i, cards.get(rand));
			cards.set(rand, temp);
		}
	}
	
	public void printScore() {
		System.out.println("Player 1: " + soldiers1.size() + " Player 2: " + soldiers2.size());
	}
	
	public void dealCards() {
		for(int i = 0; i < 26; i++) {
			soldiers1.add(deck.deal());
			soldiers2.add(deck.deal());
		}
	}
	
	public void playHand() {
		int rounds = 0;
		deck.shuffle();
		dealCards();
		while(soldiers1.size() != 0 && soldiers2.size() != 0){
			card1 = soldiers1.remove(0);
			card2 = soldiers2.remove(0);
			System.out.println("Player 1 Card: " + card1);
			System.out.println("Player 2 Card: " + card2);
			if(card1.compareTo(card2) > 0) {
				System.out.println("Player 1 Wins!");
				soldiers1.add(card1);
				soldiers1.add(card2);
			}
			else if(card1.compareTo(card2) == 0) {
				System.out.println("Tie");
				if(soldiers1.size() < 3 || soldiers2.size() < 3) {
					soldiers1.add(card1);
					soldiers2.add(card2);
					continue;
				}
				Card card3 = soldiers1.remove(2);
				Card card4 = soldiers2.remove(2);
				System.out.println("Player 1 Card: " + card1);
				System.out.println("Player 2 Card: " + card2);
				if(card3.compareTo(card4) > 0) {
					System.out.println("Player 1 Wins War!");
					soldiers1.add(card1);
					soldiers1.add(card2);
					soldiers1.add(card3);
					soldiers1.add(card4);
					soldiers1.add(soldiers1.remove(0));
					soldiers1.add(soldiers1.remove(0));
					soldiers1.add(soldiers2.remove(0));
					soldiers1.add(soldiers2.remove(0));
				}
				else if(card3.compareTo(card4) == 0) {
					soldiers1.add(card1);
					soldiers2.add(card2);
					soldiers1.add(card3);
					soldiers2.add(card4);
				}
				else {
					System.out.println("Player 2 Wins War!");
					soldiers2.add(card1);
					soldiers2.add(card2);
					soldiers2.add(card3);
					soldiers2.add(card4);
					soldiers2.add(soldiers1.remove(0));
					soldiers2.add(soldiers1.remove(0));
					soldiers2.add(soldiers2.remove(0));
					soldiers2.add(soldiers2.remove(0));
				}
			}
			else {
				System.out.println("Player 2 Wins!");
				soldiers2.add(card1);
				soldiers2.add(card2);
			}
			rounds++;
			if(rounds % 26 == 0) {
				System.out.println("Shuffling Cards...");
				shuffle(soldiers1);
				shuffle(soldiers2);
			}
			System.out.println("round: " + rounds);
			printScore();
			try{
				Thread.sleep(1);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		War game = new War();
		game.playHand();
	}
	

}
