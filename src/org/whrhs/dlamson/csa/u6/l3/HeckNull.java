package org.whrhs.dlamson.csa.u6.l3;

import java.util.Arrays;

public class HeckNull {

	private String name;
	private Student[] students;
	
	public HeckNull(String name) {
		this.name = name;
		students = new Student[30];
	}
	
	public void doStuff() {
		for(Student student: students) {
			if(student != null && student.improved()) {
				System.out.println("Good job buddy!");
			}
		}
	}
	
	public static void main(String[] lasagna) {
		
		HeckNull heck = new HeckNull("CSA");
		Student st = new Student("Robert");
		st.setGrades(new int[]{0, 0, 0, 0, 100});
		heck.students[0] = st;
		heck.doStuff();
		//System.out.println(Arrays.toString(heck.students));
	}
	
}
