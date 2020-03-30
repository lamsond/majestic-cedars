package org.whrhs.dlamson.ocp.ch14;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

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
		
		// Consumer Functional Interface
		Consumer<String> strConsumer = (s) -> {
			System.out.println(s.length());
		};
		
		strConsumer.accept("wuzzle");
		
		List<String> listOf = List.of("Monique", "Dan", "Cora");
		
		// old way
		/*for(String name: listOf) {
			System.out.println(name);
		}
		*/
		
		listOf.forEach((name) -> System.out.println(name));
	}
}
