package com.practicalunittesting.chp11;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class NoSuchItemException extends Exception {
	public NoSuchItemException(String message) {
		super(message);
	}
}
