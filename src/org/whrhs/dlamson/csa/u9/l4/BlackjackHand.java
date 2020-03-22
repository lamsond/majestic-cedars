package org.whrhs.dlamson.csa.u9.l4;

import java.util.Arrays;

public class BlackjackHand {
	
	private Card card1;
	private Card card2;
	private int value;
	
	public BlackjackHand() {
		card1 = new Card();
		card2 = new Card();
		value = card1.getValue() + card2.getValue();
	}
	
	@Override
	public String toString() {
		return card1 + ", " + card2 + ": " + value; 
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof BlackjackHand)) {
			return false;
		}
		BlackjackHand otherHand = (BlackjackHand) other;
		return value == otherHand.value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		
		int[] handValues = new int[23];
		int tie = 0;
		
		
		for(int i = 0; i <= 1000000; i++) {
			BlackjackHand hand1 = new BlackjackHand();
			BlackjackHand hand2 = new BlackjackHand();
			handValues[hand1.getValue()]++;
			handValues[hand2.getValue()]++;
			if(hand1.equals(hand2)) {
				tie++;
			}
		}
		
		System.out.println(Arrays.toString(handValues));
		System.out.println(tie);
	}

}
