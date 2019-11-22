package org.whrhs.dlamson.csa.u4.l1.lessons;

public class Student {
	
	public static final int MAX_STUDENTS = 30;
	private static int numStudents = 0;
	private String name;
	private double gpa;
	private int grade;
	private int stdId;
	
	public static void main(String[] args) {
		System.out.println(MAX_STUDENTS);
	}
}
