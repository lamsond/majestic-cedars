package org.whrhs.dlamson.csa.ex.wk2;

public class SelfDivisors {
	
	public static boolean isSelfDivisor(int n) {
		for(int i = 1; i < n; i *= 10) {
			int digit = (n % (i * 10))/i;
			if(digit == 0 || n % digit != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] firstNumSelfDivisors(int start, int num) {
		int[] result = new int[num];
		int found = 0;
		int curr = start;
		while(found < num) {
			if(isSelfDivisor(curr)) {
				result[found] = curr;
				found++;
			}
			curr++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(isSelfDivisor(128));
	}
	
	

}
