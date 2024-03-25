package com.springrest.ganesh.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.ganesh.dto.UserDto;
import com.springrest.ganesh.entity.User;
import com.springrest.ganesh.mapper.UserMapper;
import com.springrest.ganesh.repository.UserReposistory;
import com.springrest.ganesh.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserReposistory userRepository;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = UserMapper.userToUserDto(userDto);
		User savedUser = userRepository.save(user);
		UserDto savedUserDto = UserMapper.userDtotoUser(savedUser);
		return savedUserDto;

	}

	@Override
	public UserDto getUserById(long UserId) {
		Optional<User> optionalUser = userRepository.findById(UserId);
		User user = optionalUser.get();
		UserDto userDto = UserMapper.userDtotoUser(user);
		return userDto;
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users.stream().map(UserMapper::userDtotoUser).collect(Collectors.toList());
	}

	@Override
	public UserDto updateUser(UserDto user) {
		User existinguser = userRepository.findById(user.getId()).get();
		existinguser.setFirstName(user.getFirstName());
		existinguser.setLastName(user.getLastName());
		existinguser.setEmail(user.getEmail());
		User updatedUser = userRepository.save(existinguser);
		UserDto updatedUserDto = UserMapper.userDtotoUser(updatedUser);
		return updatedUserDto;
	}

	@Override
	public void deleteUser(long id) {
		userRepository.deleteById(id);
	}

}
