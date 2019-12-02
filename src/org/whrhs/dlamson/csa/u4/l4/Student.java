package org.whrhs.dlamson.csa.u4.l4;

public class Student {

	public static final int MAX_STUDENTS = 30;
	private static int numStudents = 0;
	
	private String name;
	private double gpa;
	private int grade;
	private int id;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		grade = 9;
		gpa = 0.0;
	}
	
	public void setGpa(double gpa) {
		if(gpa >= 0 && gpa <= 4.0)
			this.gpa = gpa;
		else
			System.out.println(gpa + " is an invalid GPA");
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + ": ID#" + id;
	}
	
}
