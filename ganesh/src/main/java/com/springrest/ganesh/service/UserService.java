package com.springrest.ganesh.service;

import java.util.List;

import com.springrest.ganesh.dto.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);

	UserDto getUserById(long UserId);

	List<UserDto> getAllUsers();

	UserDto updateUser(UserDto user);

	void deleteUser(long id);

}
