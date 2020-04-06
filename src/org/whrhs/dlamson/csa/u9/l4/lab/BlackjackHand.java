package org.whrhs.dlamson.csa.u9.l4.lab;

public class BlackjackHand {
	
	private Card card1;
	private Card card2;
	private int value;
	
	public BlackjackHand() {
		card1 = new Card();
		card2 = new Card();
		value = card1.getValue() + card2.getValue();
		if(value >= 22) {
			value = 12;
		}
	}
	
	@Override
	public String toString() {
		return card1 + " + " + card2 + " = " + value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof BlackjackHand)) {
			return false;
		}
		BlackjackHand otherHand = (BlackjackHand) obj;
		return this.value == otherHand.value;
	}
}
