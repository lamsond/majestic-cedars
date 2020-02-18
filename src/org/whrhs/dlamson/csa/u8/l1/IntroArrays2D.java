package org.whrhs.dlamson.csa.u8.l1;

import java.util.Arrays;

public class IntroArrays2D{
	
	public static void main(String[] args) {
		
		String[] row1 = {"Saad", "Daniel"};
		String[] row2 = {"Ariha", "Bill", "Anthony R.", "Adam", "Justine", "Abby"};
		String[] row3 = {"Inica", "Adithi", "Tony", "Charlotte", "Leo", "Anthony Y."};
		String[] row4 = {"Shane", "Spencer", "Cullen", "Toby"};
		String[] row5 = {"Rishab", "Christian", "Zach"};
		
		String[][] csaPeriod7 = {row1, row2, row3, row4, row5};
		
		// System.out.println(Arrays.deepToString(csaPeriod7[3]));
		System.out.println(csaPeriod7[0][1].substring(0, 3));
		
		String[][] board = {
				{"X", "", "O"},
				{"O", "O", ""},
				{"X", "", "X"}
		};
		
		boolean[][] board2 = new boolean[3][5];
		board[2][1] = "X";
		// board[row][col]
		System.out.println(Arrays.deepToString(board2));
		
		
	}
}
