package com.springrest.ganesh.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.ganesh.entity.User;
import com.springrest.ganesh.repository.UserReposistory;
import com.springrest.ganesh.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserReposistory userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);

	}

	@Override
	public User getUserById(long UserId) {
		Optional<User> optionalUser = userRepository.findById(UserId);
		return optionalUser.get();
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public User updateUser(User user) {
		User existinguser =userRepository.findById(user.getId()).get();
		existinguser.setFirstName(user.getFirstName());
		existinguser.setLastName(user.getLastName());
		existinguser.setEmail(user.getEmail());
		User updatedUser = userRepository.save(existinguser);
		return updatedUser;
	}

	@Override
	public void deleteUser(long id) {
      userRepository.deleteById(id);
	}
	
	

}
