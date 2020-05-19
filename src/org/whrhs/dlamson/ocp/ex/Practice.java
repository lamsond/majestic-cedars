package org.whrhs.dlamson.ocp.ex;

import java.util.Arrays;
import java.util.ArrayList;

public class Practice {
	

	public static void main(String[] args) {
		
		String[] names = {"cora", "bub bub", "axl", "dan"};
		var ls = new ArrayList<String>(Arrays.asList(names));
		ls.sort((var a, var b) -> a.compareTo(b));
		System.out.println(ls);
		
		
	}
}
