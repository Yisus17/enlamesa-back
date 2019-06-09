package com.enlamesa.cms.cms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.enlamesa.cms.bl.UserService;
import com.enlamesa.cms.model.User;

@SpringBootApplication
@ComponentScan({"com.enlamesa.cms"})
public class CmsApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(CmsApplication.class);
	
	@Autowired
	private UserService userService;
	
	
	
	public static void main(String[] args){
		SpringApplication.run(CmsApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		User user = new User("Jesus", "Arevalo");
		LOG.info(userService.addUser(user));
	}
	
	

}
