package org.whrhs.dlamson.csa.u6.l1;

import java.util.Arrays;

public class Student {

	public static final int NUM_GRADES = 5;
	private String name;
	private int[] grades;
	
	public Student(String name) {
		this.name = name;
		grades = new int[NUM_GRADES];
	}
	
	public int getGrade(int pos) {
		return grades[pos];
	}
	
	public void setGrade(int pos, int grade) {
		grades[pos] = grade;
	}
	
	public boolean improved() {
		return grades[NUM_GRADES - 1] > grades[0];
	}
	
	public double getAverage() {
		return 0;
	}
	
	public int[] droppedMin() {
		int[] sortedArr = grades.clone();
		Arrays.sort(sortedArr);
		int[] droppedArr = new int[NUM_GRADES - 1];
		
		for(int i = 1; i < grades.length; i++) {
			droppedArr[i -1] = grades[i];
		}
		
		return droppedArr;
	}
}
