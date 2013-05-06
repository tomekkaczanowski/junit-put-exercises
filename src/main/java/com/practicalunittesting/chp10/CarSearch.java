package com.practicalunittesting.chp10;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class CarSearch {

	private List<Car> cars = new ArrayList<Car>();

	public void addCar(Car car) {
		cars.add(car);
	}

	public List<Car> findSportCars() {
		List<Car> sportCars = new ArrayList<Car>();
		for (Car car : cars) {
			if (car.getEngine().getNbOfCylinders() > 6
					&& Color.RED == car.getColor()
					&& "Ferrari".equals(car.getManufacturer().getName())) {
				sportCars.add(car);
			}
		}
		return sportCars;
	}
}
