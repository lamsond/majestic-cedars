package org.whrhs.dlamson.csa.u4.l3.lessons;

public class Student {
	
	public static final int MAX_STUDENTS = 30;
	private static int numStudents = 0;
	private String name;
	private double gpa;
	private int grade;
	private int stdId;
	
	public Student(String n, int g, int id) {
		name = n;
		gpa = 0.0;
		grade = g;
		stdId = id;
		numStudents++;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double g) {
		// between 0 and 4
		if(g >= 0 && g <= 4)
			gpa = g;
		else
			System.out.println(g + " is not a valid gpa");
	}
	
	
	
}
