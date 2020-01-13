package org.whrhs.dlamson.csa.u6.l3;

public class Student {

	public static final int NUM_GRADES = 5;
	
	private String name;
	private int[] grades;
	
	public Student(String name) {
		this.name = name;
		grades = new int[NUM_GRADES];
	}
	
	public String getName() {
		return name;
	}
	
	public void setGrades(int[] g) {
		for(int i = 0; i < Math.min(NUM_GRADES, g.length); i++) {
			grades[i] = g[i];
		}
	}
	
	public boolean improved() {
		return grades[grades.length-1] > grades[0];
	}
	
	public double getAverage() {
		int total = 0;
		for(int i = 0; i < NUM_GRADES; i++) {
			total += grades[i];
		}
		return (double) total/NUM_GRADES;
	}
	
}
