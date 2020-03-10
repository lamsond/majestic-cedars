package org.whrhs.dlamson.csa.u9.l2;

public class Parent {
	
	protected String name;
	
	public Parent(String name) {
		// super();
		System.out.println("Parent(String name) is running");
		this.name = name;
	}
	
	public Parent() {
		// super();
		System.out.println("Parent() is running");
		name = "Jay";
	}

}
