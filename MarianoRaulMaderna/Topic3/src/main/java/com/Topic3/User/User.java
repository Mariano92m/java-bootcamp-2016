package com.Topic3.User;

public class User {
	private static int nextId=0;
	private String name;
	private String pass;
	private int id;
	
	//Constructor
	public User(String name, String pass){
		this.setId(nextId);
		nextId++;
		this.setName(name);
		this.setPass(pass);
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//Update
	public void updateU(User user){
		setName(user.getName());
		setPass(user.getPass());
	}
	
}
