package org.whrhs.dlamson.csa.u8.ex;

import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) {
		
		int[][] grid = new int[3][3];
		for(int row = 0; row < grid.length; row++) {
			for(int col = row; col < grid.length; col++) {
				grid[row][col] = (row + col) / 2;
			}
		}
		System.out.println(Arrays.deepToString(grid));
	}
}
