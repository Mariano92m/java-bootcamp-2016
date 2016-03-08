package com.Topic3.User;

import java.util.List;

public class UserRepositoryProxy implements UserRepositoryI {
	private UserRepositoryI userRepo;
	
	public UserRepositoryProxy(UserRepositoryI userRepo){
		this.userRepo=userRepo;
	}
	
	public void create(User user){
		userRepo.create(user);
	}
	
	public User read(int userId){
		return userRepo.read(userId);
	}
	
	public List<User> update(){
		return userRepo.update();
	}
	
	public boolean delete(int userId){
		return userRepo.delete(userId);
	}
}
