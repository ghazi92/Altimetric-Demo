package com.springboot.altimetric.demo.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
 * SETUP USERS IN DB.
 */

@Component
public class UserDaoCommandLineRunner implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserJpaRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception { 
		// TODO Auto-generated method stub
				
		userRepository.save(new User(1L, "admin",
		        "$2a$10$COCUf8siHngVmUl.BMtEZuIeyD43uSaARpl8qpKbbgFavqG9gyKQe", "ROLE_USER_1"));
		userRepository.save(new User(2L, "abrar", 
	    		"$2a$10$A/r1D80sp3aQy/f90odabumcMzc7IAVJZ9S7ur6yGpZl7yOCsT1/6", "ROLE_USER_2"));	

		logger.info("Users created in DB");
	}
}
