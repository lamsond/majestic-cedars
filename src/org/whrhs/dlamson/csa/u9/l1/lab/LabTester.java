package org.whrhs.dlamson.csa.u9.l1.lab;

import java.util.Arrays;

public class LabTester {

	public static void main(String[] args) {
		
		int[] ianGrades = {98, 91, 93, 95};
		int[] coraGrades = {77, 75, 68, 74};
		int[] lamGrades = {60, 50, 40, 42};
		
		Student ian = new Student("Ian", ianGrades);
		Student cora = new Student("Cora", coraGrades);
		Student danLam = new Student("danLam", lamGrades);
		
		Course csa = new Course("AP Computer Science A");
		csa.addStudent(ian);
		csa.addStudent(cora);
		csa.addStudent(danLam);
		
		System.out.println(Arrays.toString(csa.calcGPAs()));
	}
}
