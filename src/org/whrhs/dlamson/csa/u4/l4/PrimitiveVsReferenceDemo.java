package org.whrhs.dlamson.csa.u4.l4;


public class PrimitiveVsReferenceDemo {

	public static void mystery(int n, Student s) {
		n = 5;
		s.setName("Toni");
	}
	
	public static void main(String[] args) {
		// period 7 demo
		int number = 13;
		Student tony = new Student("T0ny", 1234343);
		mystery(number, tony);
		
		System.out.println(number);
		System.out.println(tony);
	}
}
