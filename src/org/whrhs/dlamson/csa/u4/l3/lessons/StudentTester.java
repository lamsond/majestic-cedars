package org.whrhs.dlamson.csa.u4.l3.lessons;

public class StudentTester {

	public static void main(String[] args) {
		
		Student bob = new Student("Bob", 10, 123456);
		bob.setGpa(3.3);
		System.out.println(bob.getGpa());
	}
}
