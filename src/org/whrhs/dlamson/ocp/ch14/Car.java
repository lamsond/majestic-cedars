package org.whrhs.dlamson.ocp.ch14;

public class Car {

	String company;
	int year;
	double price;
	String type;
	
	public Car(String c, int y, double p, String t) {
		this.company = c;
		this.year = y;
		this.price = p;
		this.type = t;
	}
	
	@Override
	public String toString() {
		return "(" + company + " " + year + ")";
	}
	
	
}
