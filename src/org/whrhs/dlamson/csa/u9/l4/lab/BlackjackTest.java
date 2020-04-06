package org.whrhs.dlamson.csa.u9.l4.lab;

public class BlackjackTest {

	public static void main(String[] args) {
		
		BlackjackHand hand1 = new BlackjackHand();
		BlackjackHand hand2 = new BlackjackHand();
		String hand3 = "Ace, Jack";
		int[] nums = {1, 2, 3};
		
		System.out.println(hand1);
		System.out.println(hand2);
		
		System.out.println(hand1.equals(nums));
		
	}
}
