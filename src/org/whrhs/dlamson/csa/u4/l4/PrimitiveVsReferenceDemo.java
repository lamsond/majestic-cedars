package org.whrhs.dlamson.csa.u4.l4;


public class PrimitiveVsReferenceDemo {

	public static void mystery(int n, Student s) {
		n = 5;
		s.setName("Bubba");
	}
	
	public static void main(String[] args) {
		Student jack = new Student("Jack", 123456);
		int number = 13;
		
		System.out.println(number);
		System.out.println(jack);
		
		mystery(number, jack);
		System.out.println(number);
		System.out.println(jack);
	}
}
