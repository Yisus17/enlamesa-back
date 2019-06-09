package com.enlamesa.cms.controller;

import com.enlamesa.cms.bl.UserService;
import com.enlamesa.cms.bl.impl.UserServiceImpl;

public class UserController {

	public UserService userService;
	
	
	public String addUser(String name, String password) {
		userService = new UserServiceImpl();
		
		return "controller";
	}
	
}
