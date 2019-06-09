package com.enlamesa.cms.repositoryImpl;

import org.springframework.stereotype.Repository;

import com.enlamesa.cms.model.User;
import com.enlamesa.cms.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Override
	public String addUser(User user) {
		//aqui se añade el user a bd
		
		
		return user.name;
	}

}
