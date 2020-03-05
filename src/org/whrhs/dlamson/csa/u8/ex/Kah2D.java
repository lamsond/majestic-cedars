package org.whrhs.dlamson.csa.u8.ex;

import java.util.Arrays;

public class Kah2D {
	
	public static void mystery(int[][] intArr, int n) {
		n++;
		intArr[n][n] = -1;
	}
	
	public static void main(String[] args) {
		
		String[] group1 = {"Dan", "Saad", "Anthony"};
		String[] group2 = {"Ariha", "Bill", "Anthony", "Adam", "Justine", "Abby"};
		String[][] csa7 = {group1, group2};
		group1 = group2;
		group1[2] = "Charlotte";
		System.out.println(Arrays.deepToString(csa7));

	}

}
