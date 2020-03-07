package org.whrhs.dlamson.csa.u8.ex;

import java.util.Arrays;

public class ArrayTester {
	
	public static int[] getColumn(int[][] arr2D, int c) {
		int[] column = new int[arr2D.length];
		for(int row = 0; row < arr2D.length; row++) {
			column[row] = arr2D[row][c];
		}
		return column;
	}
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		// loop through all elements of arr1
		for(int i = 0; i < arr1.length; i++) {
			// loop through elements of arr2
			for(int j = 0; j < arr2.length; j++) {
				// look for it (does arr1[i] == arr2[j]?)
				if(arr1[i] == arr2[j]) {
					break;
				}
				// if arr2[j] is the last thing in the array
				if(j == arr2.length-1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int[][] arr2D = {
				{0, 1, 2}, 
				{3, 4, 5}, 
				{6, 7, 8}, 
				{9, 5, 3},
				{10, 11, 12}
				};
		
		int[] result = ArrayTester.getColumn(arr2D, 2);
		//System.out.println(Arrays.toString(result));
		/*-----------------*/
		
		int[] test = {1, 3, 23, 24, 12}; // arr1
		
		int[] trueCase = {3, 23, 12, 24, 1};
		int[] falseCase = {1, 3, 100, 24, 23};
		int[] question = {1, 3, 100, 24, 23, 12}; // true or false?
		
		System.out.println(hasAllValues(test, trueCase));
		System.out.println(hasAllValues(test, falseCase));
		System.out.println(hasAllValues(test, question));
	}

}
