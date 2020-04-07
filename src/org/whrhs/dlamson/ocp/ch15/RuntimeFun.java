package org.whrhs.dlamson.ocp.ch15;

public class RuntimeFun {

	public double computeSimpleInterest(double p, double r, double t){
		if(t < 0) {
			throw new IllegalArgumentException("time is less than zero");
		}
		return p*r*t/100;
	}
	
	public void doInterest() {
		try {
			double interest = computeSimpleInterest(1000, 10, -45);
			System.out.println("Computed Interest: " + interest);
		}
		catch(IllegalArgumentException ex) {
			System.out.println("Problem computing interest: " + ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			System.out.println("All done");
		}
	}
	public static void main(String[] args) {
		RuntimeFun test = new RuntimeFun();
		test.doInterest();
	}
}
