package controller;

import java.util.ArrayList;
import java.util.List;

import models.User;
import serviceImpl.UMSImpl;
import serviceImpl.UserManagementServiceImpl;
import services.UserManagementService;

/**
 * 
 * @author MANISH
 *
 */
public class Manager {

	/**
	 * 
	 * @param args
	 */
	
	public static List<User> allUser= new ArrayList<User>();
	
	public static void main(String [] args) {
		
		
		UserManagementServiceImpl impl= new UserManagementServiceImpl();
		// adding user.
		/*
		 * impl.addUser(1, "manish"); impl.addUser(2, "satish"); impl.addUser(3,
		 * "prerna"); impl.addUser(4, "kunal"); impl.addUser(5, "Shubham");
		 */
	//	UserManagementService.disp();
		
		UserManagementService managementService= new UMSImpl();
		managementService.disp2();
		
		UserManagementService managementService2= new UserManagementServiceImpl();
		managementService2.disp2();
		
		/*
		 * for(User x: allUser) { System.out.println(x); }
		 */	
		
	}
}
