package org.whrhs.dlamson.csa.u7.l4;

import java.util.Arrays;

public class CompareAndSwapCount {
	
	public static int[] generateRandArray(int size, int maxVal, int minVal) {
	
		int[] result = new int[size];
		for(int i = 0; i < result.length; i++) {
			result[i] = (int)(Math.random() * (maxVal - minVal) + minVal);
		}
		return result;
	}
	
	public static void selectionSort(int[] nums) {
		
		for(int i = 0; i < nums.length-1; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			
			int minValue = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = minValue;
			
		}
	}
	
	public static void insertionSort(int[] nums) {
 
		for(int i = 1; i < nums.length; i++) {
			int value = nums[i];
			int insertIndex = i;
			
			while(insertIndex > 0 && nums[insertIndex-1] > value) {
				nums[insertIndex] = nums[insertIndex - 1];
				insertIndex--;
			}
			
			nums[insertIndex] = value;
		}
	}
	
	public static void main(String[] args) {
		
		int[] stuff = generateRandArray(100, -50, 50);
		System.out.println(Arrays.toString(stuff));
		insertionSort(stuff);
		System.out.println(Arrays.toString(stuff));
	}

}

