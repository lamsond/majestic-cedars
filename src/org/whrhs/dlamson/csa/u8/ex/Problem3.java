package org.whrhs.dlamson.csa.u8.ex;

import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		
		int[][] grid = {{7, 3, 12, 5}, {1, 16, 8, 9}, {20, 13, 10, 15}, {7}};
		for(int row = 0; row < grid.length; row++) {
			Arrays.sort(grid[row]);
			for(int col = 0; col < grid[row].length; col++) {
				Arrays.sort(grid[row]);
				if(grid[row][col] % 2 == 0) {
					grid[row][col] *= 2;
					break;
				}
				grid[row][col] *= 3;
				
			}
		}
		
		System.out.println(Arrays.deepToString(grid));
	}
}
