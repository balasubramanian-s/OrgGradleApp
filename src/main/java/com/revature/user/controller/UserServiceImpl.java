package com.revature.user.controller;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.User;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import static java.util.Collections.emptyList;

@Service
public class UserServiceImpl implements UserDetailsService {

	
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.revature.user.controller.User user=userRepository.findByUserName(username);
		if(user==null) {
			throw new UsernameNotFoundException(username);
			
		}
		
		return new User(user.getUsername(),user.getPassword(),emptyList());
	}
}
