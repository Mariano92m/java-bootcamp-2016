package com.Topic3.User;

public class UserRepositoryFactory {
	
	private UserRepositoryFactory(){
	};
	
	public static UserRepositoryI getLocalUserRepository(){
		return new UserRepositoryProxy(new UserRepository());
	}
	
	public static UserRepositoryI getUserRepositoryWebService(){
		return new UserRepositoryProxy(new UserRepositoryWebService());
	}
}
