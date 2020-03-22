package org.whrhs.dlamson.csa.u9.l4;

import java.util.HashMap;

public class CardTest {

	public static void main(String[] args) {
		
		Card card1 = new Card(11, 3);
		Card card2 = new Card(11, 3);
		System.out.println(card1);
		System.out.println(card2);
		String name = "Ace of Spades";
		System.out.println(card1.equals(name));
		
		HashMap<Card, Integer> cardCounts = new HashMap<>();
		
		for(int i = 0; i < 100; i++) {
			Card c1 = new Card();
			if(cardCounts.containsKey(c1)) {
				cardCounts.put(c1, cardCounts.get(c1)+1);
			}
			else {
				cardCounts.put(c1, 1);
			}
		}
		
		System.out.println(cardCounts);
	}
}
