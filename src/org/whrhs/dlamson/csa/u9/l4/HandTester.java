package org.whrhs.dlamson.csa.u9.l4;

import java.util.HashMap;

public class HandTester {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Double> results = new HashMap<>();
		int trials = 1_000_000_000;
		int ties = 0;
		
		for(int i = 0; i < trials; i++) {
			
			BlackjackHand hand1 = new BlackjackHand();
			BlackjackHand hand2 = new BlackjackHand();
			if(hand1.equals(hand2)) {
				ties++;
			}
			
			if(results.containsKey(hand1.getValue())) {
				results.put(hand1.getValue(), results.get(hand1.getValue()) + 1);
			}
			else {
				results.put(hand1.getValue(), 1.0);
			}
		}
		
		for(int i = 4; i <= 21; i++) {
			results.put(i, results.get(i)/trials*100);
		}
		System.out.println(results);
		System.out.println((double)ties/trials*100);
		
	}

}
