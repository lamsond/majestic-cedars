package org.whrhs.dlamson.csa.ex.wk3;

import java.util.Arrays;

public class ColorSampleDone {

	private double[] hueValues;
	
	/* The constructor populates the hueValues array with
	 * n valid hue values in the interval of [0, 360). The
	 * implementation is not shown. For the purpose of this 
	 * problem, we may assume the data is retrieved from the
	 * the color measurement tool.
	 */
	public ColorSampleDone(int n) {
		hueValues = new double[n];
		for(int i = 0; i < hueValues.length; i++) {
			hueValues[i] = Math.random()*360;
		}
	}
	
	/* Returns the number of values in the hueValues array that are withing\
	 * the given tolerance (+/-%) of the target.
	 * precondition: assume target is an integer between 0 and 359 inclusive.
	 * precondition: assume tolerance is an integer between 1 and 99 that
	 * represents the % above or below the target that will still be acceptable.
	 */
	public int partsInSpec(int target, int tolerance) {
		int goodParts = 0;
		for(int i = 0; i < hueValues.length; i++) {
			if(hueValues[i] >= target - target*tolerance/100.0 && hueValues[i] <= target + target*tolerance/100.0) {
				goodParts++;
			}
		}
		return goodParts;
	}
	
	/* Examines all possible hueValue targets (integers 0 - 359 inclusive) and
	 * returns the target that will yield the highest number of parts within tolerance.
	 * If more than 1 target results in a maximum yield, return the first one found.
	 * precondition: assume tolerance is an integer between 1 and 99 inclusive that
	 * represents the % above or below the target that will still be acceptable.
	 */
	public int targetWithHighestYield(int tolerance) {
		int maxYield = 0;
		int newSpec = 0;
		for(int hue = 0; hue < 360; hue++) {
			if(partsInSpec(hue, tolerance) > maxYield) {
				maxYield = partsInSpec(hue, tolerance);
				newSpec = hue;
			}
		}
		return newSpec;
	}
	
	public static void main(String[] args) {
		
		ColorSampleDone samp = new ColorSampleDone(10);
		System.out.println(Arrays.toString(samp.hueValues));
		System.out.println("Max Yield: " + samp.partsInSpec(50, 5));
		System.out.println("Optimal Target: " + samp.targetWithHighestYield(5));
		System.out.println("Max Yield: " + samp.partsInSpec(samp.targetWithHighestYield(5), 5));
		
		String four = Integer.toString(4);
	}
}
