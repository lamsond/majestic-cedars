package org.whrhs.dlamson.csa.u4.l3.lessons;

public class Student {
	
	public static final int MAX_STUDENTS = 30;
	private static int numStudents = 0;
	private String name;
	public double gpa;
	private int grade;
	private int stdId;
	
	public Student(String n, int g, int id) {
		name = n;
		gpa = 0.0;
		grade = g;
		stdId = id;
		numStudents++;
	}
	
}
