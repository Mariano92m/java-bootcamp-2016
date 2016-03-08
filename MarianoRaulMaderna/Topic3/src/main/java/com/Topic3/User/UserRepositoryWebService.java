package com.Topic3.User;

import java.util.List;

public class UserRepositoryWebService implements UserRepositoryI {
	UserRepositoryI webService;
	
	public UserRepositoryWebService(){
		//webService = Code
	}
	
	public void create(User user){
		webService.create(user);
	}
	public User read(int userId){
		return webService.read(userId);
	}
	
	public List<User> update(){
		return update();
	}
	
	public boolean delete(int userId){
		return delete(userId);
	}
}
