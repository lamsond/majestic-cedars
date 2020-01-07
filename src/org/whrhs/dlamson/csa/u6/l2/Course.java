package org.whrhs.dlamson.csa.u6.l2;

public class Course {
	
	public static final int MAX_STUDENTS = 30;
	
	private String name;
	private int numStudents;
	private Student[] students;
	
	public Course(String name) {
		this.name = name;
		students = new Student[MAX_STUDENTS];
		numStudents = 0;
	}
	
	public void addStudent(Student s) {
		if(numStudents < MAX_STUDENTS) {
			students[numStudents] = s;
			numStudents++;
		}
		else {
			System.out.println("Course full, cannot add student");
		}
	}
	
	public void printRoster() {
		int n = 1;
		for(Student student: students) {
			if(student != null) {
				System.out.print(n + ". " + student.getName() + " " + student.getAverage() + "\n");
			}
			else {
				System.out.println(n + ". ---");
			}
			n++;
		}
	}

}
