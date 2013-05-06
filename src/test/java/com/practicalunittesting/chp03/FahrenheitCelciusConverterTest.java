package com.practicalunittesting.chp03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class FahrenheitCelciusConverterTest {

	@Test
	public void shouldConvertCelciusToFahrenheit() {
		assertEquals(32, FahrenheitCelciusConverter.toFahrenheit(0));
		assertEquals(98, FahrenheitCelciusConverter.toFahrenheit(37));
		assertEquals(212, FahrenheitCelciusConverter.toFahrenheit(100));
	}

	@Test
	public void shouldConvertFahrenheitToCelcius() {
		assertEquals(0, FahrenheitCelciusConverter.toCelcius(32));
		assertEquals(37, FahrenheitCelciusConverter.toCelcius(100));
		assertEquals(100, FahrenheitCelciusConverter.toCelcius(212));
	}
}
