package serviceImpl;

import java.util.ArrayList;
import java.util.List;

import controller.Manager;
import models.User;
import services.UserManagementService;

public class UserManagementServiceImpl implements UserManagementService{

	public void addUser(int id, String name) {
		//user creattion 
		User u1= new User(id, name);
		//adding user to the list
		
		Manager.allUser.add(u1);
	}

	
	public List<User> getAllUser() {
		return new ArrayList<User>();
	}

	public void editUser() {
		
	}

	public void removeUser() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
