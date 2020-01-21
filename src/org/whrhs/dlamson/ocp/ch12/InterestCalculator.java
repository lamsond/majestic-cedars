package org.whrhs.dlamson.ocp.ch12;


public class InterestCalculator {

	Number computeInterest(double principle, double yrs, double rate) throws Exception {
		if(yrs < 0) {
			throw new IllegalArgumentException("years should be > than 0");
		}
		return principle*yrs*rate;
	}
}

