package org.whrhs.dlamson.ocp.ex3;

public class Noodle {
	
	public static void main(String[] args) {
		
		int i = 1;
		i += (i = 10) + (i + 3);
		System.out.println("integer" + i);
		
		int[] iArr = {1};
		iArr[0] += (iArr[0] = 10) + (iArr[0] + 3);
		System.out.println("integer array" + iArr[0]);
	}

}
