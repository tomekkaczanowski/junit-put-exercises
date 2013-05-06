package com.practicalunittesting.chp11;

import java.util.Collection;
import java.util.HashSet;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Fridge {

	private Collection<String> food = new HashSet<String>();

	public boolean put(String item) {
		return food.add(item);
	}

	public boolean contains(String item) {
		return food.contains(item);
	}

	public void take(String item) throws NoSuchItemException {
		boolean result = food.remove(item);
		if (!result) {
			throw new NoSuchItemException(item + " not found in the fridge");
		}
	}
}