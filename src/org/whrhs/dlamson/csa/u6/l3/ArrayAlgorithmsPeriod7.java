package org.whrhs.dlamson.csa.u6.l3;

public class ArrayAlgorithmsPeriod7 {
	
	public static int[] shiftLeft(int[] nums){
		int temp = nums[0];
		int[] numsShifted = new int[nums.length];
		for(int i = 0; i < nums.length-1; i++){
			numsShifted[i] = nums[i+1];
		}
		numsShifted[numsShifted.length-1] = temp;
		return numsShifted;
	}
	
	public static int[] shiftRight(int[] nums){
		int temp = nums[nums.length - 1];
		int[]numsShifted = new int[nums.length];
		for(int i = nums.length - 1; i > 0; i--){
			numsShifted[i] = nums[i-1];
		}
		numsShifted[0] = temp;
		return numsShifted;
	}
	
	public static void main(String[] args) {
		
	}

}
