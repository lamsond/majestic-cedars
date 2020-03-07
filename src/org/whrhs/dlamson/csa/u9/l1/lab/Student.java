package org.whrhs.dlamson.csa.u9.l1.lab;

public class Student {

	private String name;
	private int[] grades;
	
	public Student(String name, int[] grades) {
		this.name = name;
		this.grades = grades;
	}
	
	public String getName() {
		return name;
	}
	
	public int[] getGrades() {
		return grades;
	}
	
	public String toString() {
		return name;
	}
}


