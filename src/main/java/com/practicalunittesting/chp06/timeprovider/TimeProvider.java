package com.practicalunittesting.chp06.timeprovider;

import java.util.Calendar;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface TimeProvider {
	Calendar getTime();

	boolean isMorning();
}
