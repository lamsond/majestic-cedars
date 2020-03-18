package org.whrhs.dlamson.csa.u9.l3.practice;

public class RogueRobot extends Robot{

	public void sayHello() {
		System.out.println("destroy all humans!");
	}
	
	public void move(int numVrooms) {
		for(int i = 0; i < numVrooms; i++) {
			System.out.println("vroom");
		}
	}
	
	public void destroy() {
		System.out.println("i am currently destroying all humans");
	}
}
