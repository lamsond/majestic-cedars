package org.whrhs.dlamson.ocp.ch12;

public class AccountManager {

	public static void main(String[] walnuts) {
		Account a = new Account(100, 0.2);
		InterestCalculator ic = new CompoundInterestCalculator();
		double interest = a.getInterest(ic, 2);
		System.out.println(interest);
	}
}