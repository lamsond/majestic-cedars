package org.whrhs.dlamson.ocp.ex.post.q28;

import java.util.Arrays;

public class EmptyArgs {

	public static void main(String[] pizza) {
		
		System.out.println("pizza's reference value is: " + pizza);
		System.out.println("therefore pizza is not NULL");
		System.out.println("pizza looks like: " + Arrays.toString(pizza));
		System.out.println("pizza is an array of length: " + pizza.length);
	}
}
