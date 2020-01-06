package org.whrhs.dlamson.csa.u6.l2;

import java.util.Arrays;

public class ArrayLoopsDemo {

	public static void resetGrades(int[] grades){
		for(int grade: grades){
			grade = 0;
		}
	}
	
	public static void reset(int[] grades) {
		for(int i = 0; i < grades.length; i++) {
			grades[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		
		int[] grades = {77, 92, 88, 95, 100};
		
		resetGrades(grades);
		
		System.out.println(Arrays.toString(grades));
		
		reset(grades);
		
		System.out.println(Arrays.toString(grades));
	/*	System.out.println(Arrays.toString(names));
		
		for(int i = 0; i < names.length; i++) {
			names[i] = "Ann";
		}
		
		System.out.println(Arrays.toString(names));
		
		for(String name: names) {
			name = "Bob";
		}
		
		System.out.println(Arrays.toString(names));
	*/}
}
