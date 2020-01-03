package org.whrhs.dlamson.csa.u6.l1;

import java.util.Arrays;

public class ArrayDemo {
	
	
	public static void main(String[] args) {
		
		String[] names = {"Shaggy", "Scooby", "Velma", "Daphne", "Fred"};
		String[] myNames = names.clone();
		
		Arrays.sort(names);
		int[] nums = {1, 2, 3, 4};
		System.out.println(Arrays.toString(nums));
		
	}
}