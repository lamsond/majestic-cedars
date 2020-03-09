package org.whrhs.dlamson.csa.u9.l2;

public class Parent {
	
	protected String name;
	
	public Parent(String name) {
		System.out.println("Parent(String name) is executing");
		this.name = name;
	}
	
	public Parent() {
		System.out.println("Parent() is executing");
		name = "Bob";
	}
}
