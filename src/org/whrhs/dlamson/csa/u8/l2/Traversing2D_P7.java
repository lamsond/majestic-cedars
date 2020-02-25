package org.whrhs.dlamson.csa.u8.l2;

import java.util.Arrays;

public class Traversing2D_P7 {

	public static void main(String[] args) {
		
		String[] row1 = {"Daniel", "Saad"};
		String[] row2 = {"Ariha", "Bill", "Anthony", "Adam", "Justine", "Abby"};
		String[] row3 = {"Inica", "Adithi", "Tony", "Charlotte", "Leo", "Anthony"};
		String[] row4 = {"Shane", "Cullen", "SPENCER", "Toby"};
		String[] row5 = {"Rishab", "Christian", "Zach"};
		
		String[][] csaPeriod7 = {row1, row2, row3, row4, row5};
		
		/* 
		 * 1) REVIEW: Predict what the following statements will print
		 * Then run them, what is happening? Why?
		 */
		
		//System.out.println(csaPeriod7);
		//System.out.println(Arrays.toString(csaPeriod7));
		//System.out.println(Arrays.deepToString(csaPeriod7));
		
		/*
		 * 2) What will happen if we change one of the students in a particular row?
		 * In this case we replace "Adithi" with "65" as a tribute
		 * Will it affect csaPeriod7? Why or Why not?
		 * Uncomment the print statement below to test your prediction.
		 */
		
		//row3[1] = "65";
		//System.out.println(Arrays.deepToString(csaPeriod7));
		
		/*
		 * 3) How can we write nested for loops to traverse through all 21 names in csaPeriod7 and
		 * print them each on a separate lines? Try it below:
		 */
		
		// loop through rows
		for(int row = 0; row < csaPeriod7.length; row++) {
			// loop through columns
			for(int col = 0; col < csaPeriod7[row].length; col++) {
				// print values
				System.out.println(csaPeriod7[row][col]);
			}
		}
		
		// for each
		for(String[] row: csaPeriod7) {
			for(String name: row) {
				System.out.println(name);
			}
		}
		
		
	}
}

