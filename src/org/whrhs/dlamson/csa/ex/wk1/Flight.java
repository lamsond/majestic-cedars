package org.whrhs.dlamson.csa.ex.wk1;

public class Flight {
	
	private int id;
	
	public Flight() {
		id = (int)(Math.random()*1000) + 1000;
	}

	public boolean hasMechanicalIssue() {
		return Math.random() < 0.05;
	}
}
