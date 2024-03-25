package com.springrest.ganesh.service;

import java.util.List;


import com.springrest.ganesh.entity.User;

public interface UserService {

	User createUser(User user);
	
	User getUserById(long UserId);
	
	List<User> getAllUsers();
	
	User updateUser(User user);
	
	void deleteUser(long id);

}
