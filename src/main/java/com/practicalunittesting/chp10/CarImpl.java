package com.practicalunittesting.chp10;

import java.awt.*;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class CarImpl implements Car {

	private Engine engine;
	private Color color;
	private Manufacturer manufacturer;

	public Engine getEngine() {
		return engine;
	}

	public Color getColor() {
		return color;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}


}
