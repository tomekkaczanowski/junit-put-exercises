package com.practicalunittesting.chp03;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class FahrenheitCelciusConverter {

	public static int toCelcius(int fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public static int toFahrenheit(int celcius) {
		return celcius * 9 / 5 + 32;
	}
}
