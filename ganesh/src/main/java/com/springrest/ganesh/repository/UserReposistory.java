package com.springrest.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.ganesh.entity.User;

public interface UserReposistory extends JpaRepository<User, Long> {

}
