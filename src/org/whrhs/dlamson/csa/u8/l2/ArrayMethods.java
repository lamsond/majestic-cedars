package org.whrhs.dlamson.csa.u8.l2;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		
		String[][] grid = {
				{null, null, " "},
				{"X", "X", "X"},
				{"O", "X", "O"}
		};
		
		String[] xWinner = {"X", "X", "X"};
		String[] oWinner = {"O", "O", "O"};
		
		System.out.println(Arrays.compare(oWinner, grid[1]));
	
	}
}
