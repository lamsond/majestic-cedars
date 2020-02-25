package org.whrhs.dlamson.csa.u8.l2;

public class Experiment {
	
	public static int getLargestSquare(int[][] nums) {
		int sqrt, n;
		int maxSq = -1;
		for(int row = 0; row < nums.length; row++) {
			for(int col = 0; col < nums.length; col++) {
				n = nums[row][col];
				sqrt = (int) Math.sqrt(n);
				if(sqrt*sqrt == n && n > maxSq) {
					maxSq = n;
				}
			}
		}
		
		return maxSq;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(-2));
	}

}
