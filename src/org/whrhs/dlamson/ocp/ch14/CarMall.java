package org.whrhs.dlamson.ocp.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarMall {

	List<Car> cars = new ArrayList<>();
	
	public CarMall() {
		cars.add(new Car("Hyundai", 2008, 8000, "SEDAN"));
		cars.add(new Car("Chevy", 2000, 2000, "SEDAN"));
		cars.add(new Car("Honda", 2003, 11000, "SUV"));
		cars.add(new Car("Toyota", 2018, 22500, "HATCH"));
		cars.add(new Car("Porsche", 2011, 78700, "SPORTS"));
	}
	
	List<Car> showCars(Predicate<Car> cp){
		ArrayList<Car> carsToShow = new ArrayList<>();
		
		for(Car car: cars) {
			if(cp.test(car)) {
				carsToShow.add(car);
			}
		}
		
		return carsToShow;
		
	}
}
