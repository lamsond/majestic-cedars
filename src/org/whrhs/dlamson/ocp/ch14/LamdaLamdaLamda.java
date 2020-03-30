package org.whrhs.dlamson.ocp.ch14;

import java.util.function.Predicate;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class LamdaLamdaLamda {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
		//Predicate<Integer> p = (x) -> x % 2 == 0;
		nums.removeIf((num) -> num % 2 == 0);
		System.out.println(nums);
		
		List<String> names = new ArrayList<>(List.of("Dan", "Mo", "Cora"));
		names.sort((a, b) -> a.compareTo(b));
		names.forEach((name) -> System.out.println(name));
	}
}
