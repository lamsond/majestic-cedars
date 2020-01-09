package org.whrhs.dlamson.csa.u6.l2;

import java.util.Arrays;

public class ArrayLoopsDemo {

	public static void resetForEachLoop(int[] grades){
		for(int grade: grades){
			grade = 0;
		}
	}
	
	public static void resetForLoop(int[] grades) {
		for(int i = 0; i < grades.length; i++) {
			grades[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		
		String[] names = {"Shaggy", "Scooby", "Velma", "Daphne", "Fred"};
		
		int[] grades = {77, 92, 88, 95, 100};
		
		resetForEachLoop(grades);
		
		System.out.println(Arrays.toString(grades));
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		resetForEachLoop(grades);
		
		System.out.println(Arrays.toString(grades));
		
		resetForLoop(grades);
		
		System.out.println(Arrays.toString(grades));
		*/
	}
}
