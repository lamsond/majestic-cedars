package org.whrhs.dlamson.csa.u6.l1;

public class ArrayDemo {
	
	
	public static void main(String[] args) {
		
		String[] names = {"Shaggy", "Scooby", "Velma", "Daphne", "Fred"};
		String[] myNames = names.clone();
		
		myNames[1] = "Scrappy";
		
		System.out.println(myNames[1]); // prints Scrappy
		System.out.println(names[1]); // ?
		
	}
}