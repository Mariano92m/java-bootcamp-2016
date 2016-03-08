package com.Topic3.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements UserRepositoryI {

	private List<User> users;
	
	//Constructor
	public UserRepository(){
		this.users= new ArrayList<User>();
	}
	
	public void create(User user) {
		User existingUser = read(user.getId());
		if(existingUser == null){
			users.add(user);
		}else{
			existingUser.updateU(user);
		}
	}

	public User read(int userId) {
		for(User user:users){
			if(user.getId()==userId){
				return user;
			}
		}
		return null;
	}

	public List<User> update() {
		return users;
	}

	public boolean delete(int userId) {
		User existingUser = read(userId);
		if(existingUser == null){
			return false;
		}else{
			users.remove(existingUser);
			return true;
		}
	}

}
