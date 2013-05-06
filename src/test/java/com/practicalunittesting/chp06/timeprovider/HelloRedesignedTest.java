package com.practicalunittesting.chp06.timeprovider;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Calendar;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(JUnitParamsRunner.class)
public class HelloRedesignedTest {

	private HelloRedesigned hello;
	private TimeProvider timeProvider;

	@Before
	public void setUp() {
		timeProvider = mock(TimeProvider.class);
		hello = new HelloRedesigned(timeProvider);
	}

	private static final Object[] morningHours() {
		return $(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
	}

	@Test
	@Parameters(method = "morningHours")
	public void shouldSayGoodMorningInTheMorning(int morningHour) {
		when(timeProvider.getTime()).thenReturn(getCalendar(morningHour));
		assertEquals("Good Morning!", hello.sayHello());
	}

	private static final Object[] afternoonHours() {
		return $(12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23);
	}

	@Test
	@Parameters(method = "afternoonHours")
	public void shouldSayGoodAfternoonInTheAfternoon(int afternoonHour) {
		when(timeProvider.getTime()).thenReturn(getCalendar(afternoonHour));
		assertEquals("Good Afternoon!", hello.sayHello());
	}

	private Calendar getCalendar(int hour) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, hour);
		return cal;
	}
}

