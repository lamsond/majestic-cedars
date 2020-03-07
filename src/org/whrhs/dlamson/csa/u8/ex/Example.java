package org.whrhs.dlamson.csa.u8.ex;

public class Example {

	private int[][] grid;
	public Example() {
		int[][] grid = new int[2][3];
		for(int row = 0; row < grid.length; row++) {
			for(int col = 0; col < grid[row].length; col++) {
				grid[row][col] = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		Example examp = new Example();
		System.out.println(examp.grid);
	}
}

