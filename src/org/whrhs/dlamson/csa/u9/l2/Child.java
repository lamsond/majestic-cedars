package org.whrhs.dlamson.csa.u9.l2;

public class Child extends Parent{

	public Child() {
		// super();
		System.out.println("Child() is running");
	}
	
	public Child(String name) {
		super(name);
		System.out.println("Child(String name) is running");
	}
	
}
