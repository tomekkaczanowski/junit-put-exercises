package com.practicalunittesting.chp07;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MailClient {

	public void sendEmail(String address, String title, String body) {
		Email email = new Email(address, title, body);
		EmailServer.sendEmail(email);
	}
}
