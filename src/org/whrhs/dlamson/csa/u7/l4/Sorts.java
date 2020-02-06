package org.whrhs.dlamson.csa.u7.l4;

import java.util.Arrays;

public class Sorts {
	
	public static void selectionSort(int[] nums) {
		// loop through all array positions
		for(int i = 0; i < nums.length; i++) {
			int minIndex = i;
			
			// find the min of the values after n
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			
			// swap the values if the index has changed
			if(minIndex != i) {
				int minValue = nums[minIndex];
				nums[minIndex] = nums[i];
				nums[i] = minValue;
			}
		}
	}
	
	public static void insertionSort(int[] nums) {
		// loop through all positions starting @ index 1
		for(int i = 1; i < nums.length; i++) {
			int value = nums[i]; // store the value at index i for later
			int insertIndex = i;
			
			/* check if the value to the left of the current index is larger
			 * and bump the larger value up one position if it is.
			 * Decrement the index and repeat until either at the beginning
			 * of the array or a smaller value is on the left.
			 */
			while(insertIndex > 0 && nums[insertIndex-1] > value) {
				nums[insertIndex] = nums[insertIndex - 1];
				insertIndex--;
			}
			
			// this is where the value that used to be @ i belongs
			nums[insertIndex] = value;
		}
	}

}
