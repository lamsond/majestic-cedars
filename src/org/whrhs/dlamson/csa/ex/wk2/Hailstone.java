package org.whrhs.dlamson.csa.ex.wk2;

import java.util.ArrayList;

public class Hailstone {
	
	public static void printSequence(int n) {
		ArrayList<Integer> sequence = new ArrayList<>();
		sequence.add(n);
		while(n > 1) {
			if(n % 2 == 0) {
				n /= 2;
			}
			else {
				n = 3*n + 1;
			}
			sequence.add(n);
		}
		System.out.println(sequence);
	}
	
	public static int hailstoneLength(int n) {
		int length = 1;
		while(n > 1) {
			if(n % 2 == 0) {
				n /= 2;
			}
			else {
				n = 3*n + 1;
			}
			length++;
		}
		return length;
	}
	
	public static boolean isLongSequence(int n) {
		return hailstoneLength(n) > n;
	}
	
	public static double propLong(int n) {
		int numLong = 0;
		for(int i = 1; i <= n; i++) {
			if(isLongSequence(i)) {
				numLong++;
			}
		}
		return (double) numLong / n;
	}
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10000; i++) {
			System.out.println(propLong(i));
		}
	}
}
