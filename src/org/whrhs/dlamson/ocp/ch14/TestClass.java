package org.whrhs.dlamson.ocp.ch14;

import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		
		CarMall cm = new CarMall();
		// CarFilter cf = new CompanyFilter("Hyundai");
		
		List<Car> carsByCompany = cm.showCars(c -> 
			c.price > 10000);
		
		System.out.println(carsByCompany);
		/*
		List<Car> carsByCompany = cm.showCars(cf);
		
		System.out.println(carsByCompany);
		*/
	}
}
