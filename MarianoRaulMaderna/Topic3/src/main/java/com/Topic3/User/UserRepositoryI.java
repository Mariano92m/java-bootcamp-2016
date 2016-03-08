package com.Topic3.User;

import java.util.List;

public interface UserRepositoryI {
	
	/**
	 * Creates a new user
	 */	
	public void create(User user);
	
	/**
	 * Show a user
	 * 
	 */
	public User read(int userId);
	
	/**
	 * Show the actual list of users 
	 */
	public List<User> update();
	
	/**
	 * Delete a user
	 */
	public boolean delete(int userId);
}

