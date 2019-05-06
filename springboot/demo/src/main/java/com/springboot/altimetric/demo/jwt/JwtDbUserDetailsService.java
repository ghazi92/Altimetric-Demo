package com.springboot.altimetric.demo.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.altimetric.demo.jpa.User;
import com.springboot.altimetric.demo.jpa.UserJpaRepository;

 
@Service
public class JwtDbUserDetailsService implements UserDetailsService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserJpaRepository userRepository; 
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User dbuser = userRepository.findByUsername(username);
		
		logger.info("User FOUND:"+dbuser);
		
	    if (dbuser == null) {
	      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
	    } 
		logger.info("User Name:"+dbuser.getUsername());
	    
	    return new JwtUserDetails(dbuser.getId(), dbuser.getUsername(),dbuser.getPassword(),dbuser.getRole());
	}
}
