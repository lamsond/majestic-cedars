package org.whrhs.dlamson.csa.ex.realDeal;

public class TernaryNumber {
	/* 
	 * precondition: t is a non-empty string made up
	 * of '0', '1', and '2' characters only
	 */
	public static int convertTernary(String t) {
		int result = 0;
		for(int i = t.length()-1; i >= 0; i--) {
			int digit = Integer.parseInt(t.charAt(i) + "");
			result += digit * Math.pow(3, t.length()-1-i);
		}
		return result;
	}
	
	/*
	 * returns a String representing the n as a ternary number
	 * precondition: n can be represented as a 4 digit ternary number
	 * it is between 0 and 80 inclusive.
	 */
	public static String decimalToTernary(int n) {
		String result = "";
		int remainder = n;
		int quotient = 0;
		boolean firstSigFigFound = false;
		for(int i = 2; i >= 0; i--) {
			quotient = (int)(remainder / Math.pow(3, i));
			remainder -= quotient * Math.pow(3, i);
			if(!firstSigFigFound && quotient > 0 || i == 0) {
				firstSigFigFound = true;
			}
			if(firstSigFigFound) {
				result += quotient;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int sampleSize = 27;
		int[] terns = new int[sampleSize];
		for(int i = 0; i < sampleSize; i++) {
			terns[i] = i;
		}
		for(int tern: terns) {
			System.out.println(decimalToTernary(tern));
		}
	}
}
