package org.whrhs.dlamson.ocp.ch12;

public class Account {

	double rate, balance;
	
	Account(double rate, double balance){
		this.rate = rate;
		this.balance = balance;
	}
	
	double getInterest(InterestCalculator ic, double yrs) {
		try {
			Number n = ic.computeInterest(balance, yrs, rate);
			return n.doubleValue();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0.0;
	}
}
