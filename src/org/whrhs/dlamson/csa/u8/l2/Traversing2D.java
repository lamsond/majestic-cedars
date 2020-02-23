package org.whrhs.dlamson.csa.u8.l2;

import java.util.Arrays;

public class Traversing2D {

	public static void main(String[] args) {
		
		String[] row1 = {"Ken", "Jay", "Bryan"};
		String[] row2 = {"Anjaneya", "Ivan", "Lizzy", "Ally"};
		String[] row3 = {"Jenna", "Sunwoo", "Jaden"};
		String[] row4 = {"Mike", "Ian", "Jude"};
		String[] row5 = {"Felix", "Rohit", "Arjun"};
		
		String[][] csaPeriod1 = {row1, row2, row3, row4, row5};
		
		/* 
		 * 1) Predict what the following statements will print
		 * Then run them, what is happening? Why?
		 */
		
		//System.out.println(csaPeriod1);
		//System.out.println(Arrays.toString(csaPeriod1));
		System.out.println(Arrays.deepToString(csaPeriod1));
		
		/*
		 * 2) What will happen if we change one of the students in a particular row?
		 * In this case we replace "Ian" with "Pop Smoke" as a tribute
		 * Will it affect csaPeriod1? Why or Why not?
		 * Uncomment the print statement to test your prediction.
		 */
		
		// row4[1] = "Pop Smoke";
		// System.out.println(Arrays.deepToString(csaPeriod1));
		
		/*
		 * 3) How can we write nested for loops to traverse through all 16 names in csaPeriod1 and
		 * print them each on a separate lines? Try it below:
		 */
		
		// loop through rows
		/*for(int row = 0; row < csaPeriod1.length; row++) {
			// loop through columns
			for(int col = 0; col < csaPeriod1[row].length; col++){
				// print name
				System.out.println(csaPeriod1[row][col]);
			}
		}*/
		
		// 
		
	}
}
