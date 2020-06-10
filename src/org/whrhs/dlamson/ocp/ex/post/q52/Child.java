package org.whrhs.dlamson.ocp.ex.post.q52;

public class Child extends Parent{

	@Override
	// can return Number or subclass of Number and still
	// be a valid override
	public Double luckyStrikes() {
		return 3.0;
	}
}
