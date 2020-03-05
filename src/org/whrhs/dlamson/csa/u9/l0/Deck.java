package org.whrhs.dlamson.csa.u9.l0;

import java.util.ArrayList;

public class Deck {
	
	public static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	public static final char[] SUITS = {'\u2660', '\u2663', '\u2665', '\u2666'};
	
	private ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		
		for(String rank: RANKS) {
			for(char suit: SUITS) {
				cards.add(new Card(rank, suit));
			}
		}
	}
	
	public void shuffle() {
		int n = cards.size();
		for(int i = 0; i < n; i++) {
			int rand = (int)(Math.random() * (n - i) + i);
			Card temp = cards.get(i);
			cards.set(i, cards.get(rand));
			cards.set(rand, temp);
		}
	}
	
	public String toString() {
		return cards.toString();
	}
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck);
	}
	
	public Card deal() {
		return cards.get(0);
	}

}
