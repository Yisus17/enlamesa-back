package com.enlamesa.cms.bl;

import org.springframework.stereotype.Service;

import com.enlamesa.cms.model.User;

@Service
public interface UserService {

	public String addUser(User user);
}
