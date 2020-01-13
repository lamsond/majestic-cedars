package org.whrhs.dlamson.csa.u6.l3;

import java.util.Arrays;

public class ArrayAlgorithmsPeriod1 {

	// Group #3
	public static void shiftLeft(int[] arr){
		int[] newarr = arr.clone();
		for(int i = 0; i < newarr.length; i++){
			if(i == 0)
				arr[arr.length-1] = newarr[0];
			else
				arr[i-1] = newarr[i];
		}
	}

	// Group #3
	public static void shiftRight(int[] arr){
		int[] newarr = arr.clone();
		for(int i = 0; i < newarr.length; i++){
			if(i == 0)
				arr[0] = newarr[newarr.length-1];
			if(i < arr.length - 1)
				arr[i+1] = newarr[i];
		}
	}
	
	// Group #4
	public static int max(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	// Group #4
	public static int min(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	// Group #4
	public static double median(int[] array) {
		double median;
		int[] copyOfArr = array.clone();
		Arrays.sort(copyOfArr);
		double medianInd = (copyOfArr.length + 1) / 2.0;
		if (medianInd % 2 == 0) {
			median = copyOfArr[(int)(medianInd) - 1];
		}
		else {
			if(copyOfArr.length == 1) {
				return copyOfArr[0];
			}
			else {
			median = (copyOfArr[(int)medianInd - 1] + copyOfArr[(int)medianInd]) / 2.0;
			}
		}
		return median;
	}
	
	// Group #2
	public static int[] removeDuplicates(int[] arr) {
		int counter = 0;
		int[] newArr = new int[arr.length];
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int n = i; n < arr.length - 1; n++) {
				if (arr[i] == arr[n + 1]) {
					x = 1;
				}
			}
			if (x == 0) {	
				newArr[counter] = i;
				counter++;
			}
			x = 0;
		}
		int[] finalArray = new int[counter];
		for (int i = 0; i < counter; i++) {
			finalArray[i] = arr[newArr[i]];
		}
		return finalArray;
	}
	
	public static void main(String[] pizza) {
		
		
		
	}
}
