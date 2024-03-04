package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	//fake User List
	
	List<User> list = List.of(
					new User(1311L, "Durgesh", "45754754"),
					new User(1314L, "Pankaj", "4574575754754"),
					new User(1317L, "Ajay", "47875754754")
			);
	
	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	

}
