package org.whrhs.dlamson.csa.ex.wk3;

public class ColorSample {

	private double[] hueValues;
	
	/* The constructor populates the hueValues array with
	 * n valid hue values in the interval of [0, 360). The
	 * implementation is not shown. For the purpose of this 
	 * problem, we may assume the data is retrieved from the
	 * the color measurement tool.
	 */
	public ColorSample(int n) {
		/* implementation not shown */
	}
	
	/* Returns the number of values in the hueValues array that are withing
	 * the given tolerance (+/-%) of the target.
	 * 
	 * precondition: assume target is an integer between 0 and 359 inclusive.
	 * precondition: assume tolerance is an integer between 1 and 99 that
	 * represents the % above or below the target that will still be acceptable.
	 */
	public int partsInSpec(int target, int tolerance) {
		/* to be written in part (a) */
		return -1;
	}
	
	/* Examines all possible hueValue targets (integers 0 - 359 inclusive) and
	 * returns the target that will yield the highest number of parts within tolerance.
	 * If more than 1 target results in a maximum yield, return the first one found.
	 * 
	 * precondition: assume tolerance is an integer between 1 and 99 inclusive that
	 * represents the % above or below the target that will still be acceptable.
	 */
	public int targetWithHighestYield(int tolerance) {
		/* to be written in part (b) */
		return -1;
	}
}
