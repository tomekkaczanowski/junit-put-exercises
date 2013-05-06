package com.practicalunittesting.chp06.time;

import java.util.Calendar;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class HelpDesk {

	public final static int EOB_HOUR = 17;

	public boolean willHandleIssue(Issue issue) {
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		if (Calendar.SUNDAY == dayOfWeek || Calendar.SATURDAY == dayOfWeek) {
			return false;
		}
		if (Calendar.FRIDAY == dayOfWeek) {
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			if (hour > EOB_HOUR) {
				return false;
			}
		}
		return true;
	}
}
