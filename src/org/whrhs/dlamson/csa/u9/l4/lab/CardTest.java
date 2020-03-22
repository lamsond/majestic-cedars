package org.whrhs.dlamson.csa.u9.l4.lab;

public class CardTest {

	public static void main(String[] args) {
		
		Card c1 = new Card(12, 0);
		Object c2 = new Card(12, 0);
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("c1 equals c2?: " + c1.equals(c2));
	}
}
