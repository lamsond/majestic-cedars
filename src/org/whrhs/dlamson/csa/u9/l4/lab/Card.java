package org.whrhs.dlamson.csa.u9.l4.lab;

public class Card {
	
	public static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	// unicode for spade, club, heart, diamond
	public static final char[] SUITS = {'\u2660', '\u2663', '\u2665', '\u2666'};
	
	private String rank;
	private char suit;
	private int value;
	
	public Card() {
		int rankIndex = (int)(Math.random() * RANKS.length);
		value = setValue(rankIndex);
		rank = RANKS[rankIndex];
		suit = SUITS[(int)(Math.random() * SUITS.length)];
	}
	
	/**
	 * preconditions: 
	 * @param rankIndex is between 0 and 12 inclusive
	 * @param suitIndex is between 0 and 3 inclusive
	 * 
	 */
	
	public Card(int rankIndex, int suitIndex) {
		value = setValue(rankIndex);
		rank = RANKS[rankIndex];
		suit = SUITS[suitIndex];
	}
	
	private int setValue(int rankIndex) {
		if(rankIndex <= 8) {
			return rankIndex + 2;
		}
		if(rankIndex < RANKS.length - 1) {
			return 10;
		}
		return 11;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return rank + suit;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Card)) {
			return false;
		}
		Card otherCard = (Card) other;
		return this.rank.equals(otherCard.rank) && this.suit == otherCard.suit;
	}
	
}

