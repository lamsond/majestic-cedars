package org.whrhs.dlamson.csa.u9.l1.lab;

import java.util.Arrays;

public class Course {

	String name;
	Student[] students;
	int numStudents;
	
	public Course(String name) {
		this.name = name;
		students = new Student[30];
		numStudents = 0;
	}
	
	public void addStudent(Student s) {
		students[numStudents] = s;
		numStudents++;
		System.out.println(Arrays.deepToString(students));
	}
	
	public double[] calcGPAs() {
		double[] gpas = new double[numStudents];
		
		// loop through all students
		for(int i = 0; i < numStudents; i++) {
			double ave = 0;
			double gpa = 0;
			// get students[i] grades
			int[] grades = students[i].getGrades();
			int sum = 0;
			// add em up
			for(int j = 0; j < grades.length; j++) {
				sum += grades[j];
			}
			// divide to get the ave
			ave = sum / grades.length;
			
			// find gpa
			if(ave >= 95) {
				gpa = 4.0;
			}
			else if(ave >= 90) {
				gpa = 3.75;
			}
			else if(ave >= 87) {
				gpa = 3.5;
			}
			else if(ave >= 83) {
				gpa = 3.25;
			}
			else if(ave >= 80) {
				gpa = 3.0;
			}
			else if(ave >= 77) {
				gpa = 2.75;
			}
			else if(ave >= 73) {
				gpa = 2.5;
			}
			else if(ave >= 70) {
				gpa = 2.25;
			}
			else if(ave >= 67) {
				gpa = 1.75;
			}
			else if(ave >= 63) {
				gpa = 1.5;
			}
			else if(ave >= 60) {
				gpa = 1.25;
			}
			else {
				gpa = 0;
			}
			
			// put the gpa into gpas[i]
			gpas[i] = gpa;
		} 
		
		return gpas;
	}
	
}
