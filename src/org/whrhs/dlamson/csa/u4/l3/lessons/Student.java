package org.whrhs.dlamson.csa.u4.l3.lessons;

/**
 * Class represents a Student at WHRHS
 * @author dlamson
 * @version v1.0.0
 *
 */
public class Student {
	
	public static final int MAX_STUDENTS = 30;
	private static int numStudents = 0;
	private String name;
	private double gpa;
	private int grade;
	private int stdId;
	
	/**
	 * 
	 * @param n String representing student's name
	 * @param g int representing student's grade
	 * @param id student id number
	 */
	public Student(String name, int g, int id) {
		this.name = name;
		gpa = 0.0;
		grade = g;
		stdId = id;
		numStudents++;
	}
	
	/**
	 * 
	 * @return student's gpa
	 */
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
