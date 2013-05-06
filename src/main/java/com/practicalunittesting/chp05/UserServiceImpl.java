package com.practicalunittesting.chp05;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class UserServiceImpl {

	private UserDAO userDAO;
	private SecurityService securityService;

	public void assignPassword(User user) throws Exception {
		String passwordMd5 = securityService.md5(user.getPassword());
		user.setPassword(passwordMd5);
		userDAO.updateUser(user);
	}

	public UserServiceImpl(UserDAO dao, SecurityService security) {
		this.userDAO = dao;
		this.securityService = security;
	}
}
