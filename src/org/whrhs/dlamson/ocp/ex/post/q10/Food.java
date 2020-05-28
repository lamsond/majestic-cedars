package org.whrhs.dlamson.ocp.ex.post.q10;

abstract class Food implements Eatable{
	
	String name;
	int calories;
	
	public Food(String name) {
		this.name = name;
	}
}
