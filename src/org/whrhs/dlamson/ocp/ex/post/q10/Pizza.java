package org.whrhs.dlamson.ocp.ex.post.q10;

import java.util.ArrayList;

public class Pizza extends Food{
	
	ArrayList<String> toppings;
	
	public Pizza() {
		super("Pizza");
		toppings = new ArrayList<String>();
		calories = 400;
	}
	/* Food implemented the Eatable interface but didn't have to have an eat() method since it was abstract. 
	 * The Pizza subclass is then responsible for implementing eat()
	 */
	public void eat() {
		System.out.println("I love PIZZA!");
	}
	
}
