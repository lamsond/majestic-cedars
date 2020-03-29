package org.whrhs.dlamson.ocp.ch14;

public class CompanyFilter implements CarFilter{

	private String company;
	
	public CompanyFilter(String company) {
		this.company = company;
	}
	
	@Override
	public boolean showCar(Car c) {
		return this.company == c.company;
	}
}
