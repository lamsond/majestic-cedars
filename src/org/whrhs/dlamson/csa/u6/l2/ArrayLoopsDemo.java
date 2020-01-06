package org.whrhs.dlamson.csa.u6.l2;

import java.util.Arrays;

public class ArrayLoopsDemo {

	public static void main(String[] args) {
		
		String[] names = {"Shaggy", "Scooby", "Velma", "Daphne", "Fred"};
		
		System.out.println(Arrays.toString(names));
		
		for(int i = 0; i < names.length; i++) {
			names[i] = "Ann";
		}
		
		System.out.println(Arrays.toString(names));
		
		for(String name: names) {
			name = "Bob";
		}
		
		System.out.println(Arrays.toString(names));
	}
}
