package org.whrhs.dlamson.ocp.ch12;

public class CompoundInterestCalculator extends InterestCalculator{
	
	public Double computeInterest(double principle, double yrs, double rate) {
		return principle * Math.pow(1 + rate, yrs) - principle;
	}

}
