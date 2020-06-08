package org.whrhs.dlamson.ocp.ex.post.q74;

import java.util.*;

public class UnknownStuff {

	/* 
	 * goal #1: understand `::`
	 *     no par required
	 *     no method parentheses required
	 *     just <class name>::<method name>
	 * goal #2: understand `removeIf`
	 *     takes a predicate filter
	 * goal #3: understand `toArray`
	 *     turns a list into an Object[]
	 *     requires downcasting to get proper type
	 * 
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			numbers.add((int)(Math.random() * 100));
		}
		
		numbers.forEach((number) -> {
			System.out.println(number);
		});
		
		// like a faster lambda expression 
		numbers.forEach(System.out::println);
		
		System.out.println(numbers);
		
		numbers.removeIf((number) -> number % 2 == 0);
		
		System.out.println(numbers);
		
		Integer[] oddNumbers = (Integer[]) numbers.toArray();
		
		
	}
}
