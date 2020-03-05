package org.whrhs.dlamson.csa.u9.l0;

public class Card implements Comparable<Card>{

	private String rank;
	private char suit;
	
	public Card(String rank, char suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString() {
		return rank + suit;
	}
	
	public int compareTo(Card other) {
		return this.getIndex() - other.getIndex();
	}
	
	private int getIndex() {
		for(int i = 0; i < Deck.RANKS.length; i++) {
			if(this.rank == Deck.RANKS[i]) {
				return i;
			}
		}
		return -1;
	}
}
