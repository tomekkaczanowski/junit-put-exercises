package com.practicalunittesting.chp06.timeprovider;

import java.util.Calendar;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class HelloRedesigned {

	private TimeProvider timeProvider;

	public HelloRedesigned(TimeProvider timeProvider) {
			this.timeProvider = timeProvider;
	}

	public String sayHello() {
		Calendar current = timeProvider.getTime();
		if (current.get(Calendar.HOUR_OF_DAY) < 12) {
			return "Good Morning!";
		} else {
			return "Good Afternoon!";
		}
	}
}

