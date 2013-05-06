package com.practicalunittesting.chp03;

import java.util.ArrayList;
import java.util.List;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class StringUtils {

	public static String reverse(String s) {
		List<String> tempArray = new ArrayList<String>(s.length());
		for (int i = 0; i < s.length(); i++) {
			tempArray.add(s.substring(i, i + 1));
		}
		StringBuilder reversedString = new StringBuilder(s.length());
		for (int i = tempArray.size() - 1; i >= 0; i--) {
			reversedString.append(tempArray.get(i));
		}
		return reversedString.toString();
	}
}
