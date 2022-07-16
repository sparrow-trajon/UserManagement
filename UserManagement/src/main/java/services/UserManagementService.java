package services;

import java.util.List;

import models.User;

public interface UserManagementService {

	 public abstract void addUser(int id, String name);
	
	
	public User getUser();
	public List<User> getAllUser();
	public void editUser();
	public void removeUser();
	public static void disp() {
		System.out.println("Interface static method.");
	}
	default void disp2() {
		System.out.println("I am interface default method");
	}
	
	
}
