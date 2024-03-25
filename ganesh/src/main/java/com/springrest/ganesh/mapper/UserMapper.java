package com.springrest.ganesh.mapper;

import com.springrest.ganesh.dto.UserDto;
import com.springrest.ganesh.entity.User;

public class UserMapper {

	// Dto to user conversion
	public static UserDto userDtotoUser(User user) {
		UserDto userDto = new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
		return userDto;

	}

	// user to dto conversion
	public static User userToUserDto(UserDto userDto) {
		User user = new User(userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail());
		return user;
	}

}
