package com.springrest.ganesh.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class UserDto {

	private long id;

	@NotEmpty(message = "First Name must not be empty")
	private String firstName;

	@NotEmpty(message = "Last Name must not be empty")
	private String lastName;

	@NotEmpty(message = "Email must not be empty")
	@Email(message = "Provide email in correct format")
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDto(long id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
