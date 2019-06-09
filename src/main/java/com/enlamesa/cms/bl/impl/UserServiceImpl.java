package com.enlamesa.cms.bl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.enlamesa.cms.bl.UserService;
import com.enlamesa.cms.model.User;
import com.enlamesa.cms.repository.UserRepository;
import com.enlamesa.cms.repositoryImpl.UserRepositoryImpl;

@Service
@Component
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.addUser(user);
		
	}

	
	
}
