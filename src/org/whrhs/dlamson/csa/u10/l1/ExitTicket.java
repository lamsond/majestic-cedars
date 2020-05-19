package org.whrhs.dlamson.csa.u10.l1;

import java.util.ArrayList;

public class ExitTicket {

	public static int noodle(int n) {
		if(n == 0) {
			return 10;
		}
		return n + noodle(n / 2);
	}
	
	public static int binSearch(int[] sortedArr, int left, int right, int searchVal) {
		if(left > right) {
			return -1;
		}
		int mid = (left + right) / 2;
		
		if(searchVal == sortedArr[mid]) {
			return mid;
		}
		else if(searchVal > sortedArr[mid]) {
			return binSearch(sortedArr, mid + 1, right, searchVal);
		}
		else {
			return binSearch(sortedArr, left, mid - 1, searchVal);
		}
	}

	
	public static void main(String[] args) {
		int[] testArr = {12, 25, 56, 67, 69, 70, 75, 78, 79, 82, 82, 85, 90, 92};
		int search = 70;
		int index = binSearch(testArr, 0, testArr.length-1, search);
		if(index >= 0) {
			System.out.println(search + " found at index " + index);
		}
		else {
			System.out.println(search + " not found");
		}
		System.out.println(noodle(3));
		System.out.println((int)(Math.random()*4));
	}
}
