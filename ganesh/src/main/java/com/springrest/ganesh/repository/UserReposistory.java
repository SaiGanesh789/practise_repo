package com.springrest.ganesh.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.ganesh.entity.User;

public interface UserReposistory extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);

}
