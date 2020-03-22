package org.whrhs.dlamson.csa.u9.l4;

import java.util.HashMap;

public class HandTester {
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> dealMap = new HashMap<>();
		for(int i = 0; i < 1000000; i++) {
			BlackjackHand hand = new BlackjackHand();
			int value = hand.getValue();
			if(dealMap.containsKey(value)) {
				dealMap.put(value, dealMap.get(value) + 1);
			}
			else {
				dealMap.put(value, 1);
			}
		}
		System.out.println(dealMap);
	}

}
