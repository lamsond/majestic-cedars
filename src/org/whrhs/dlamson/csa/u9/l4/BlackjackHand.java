package org.whrhs.dlamson.csa.u9.l4;

import java.util.Arrays;

public class BlackjackHand {
	
	private Card card1;
	private Card card2;
	private int value;
	
	public BlackjackHand() {
		card1 = new Card();
		card2 = new Card();
		int sum = card1.getValue() + card2.getValue();
		value = sum == 22 ? 12:sum;
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

}
