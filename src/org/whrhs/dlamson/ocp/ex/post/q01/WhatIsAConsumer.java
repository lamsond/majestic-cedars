package org.whrhs.dlamson.ocp.ex.post.q01;

import java.util.Arrays;
import java.util.List;

public class WhatIsAConsumer {

	/* Unlike most functional interfaces a consumer is expected to act via sideeffects */
	
	public static void main(String[] args) {
		
		String[] names = {"Cora", "Dan", "Mo", "Sunshine", "Purpell"};
		List<String> nameList = Arrays.asList(names);
		nameList.forEach(name -> System.out.println(name.toUpperCase()));
		
		// Consumer takes one argument, returns nothing
	}
}
