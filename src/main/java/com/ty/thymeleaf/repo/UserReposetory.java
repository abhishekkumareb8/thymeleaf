package com.ty.thymeleaf.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.thymeleaf.dto.User;

public interface UserReposetory extends JpaRepository<User, Integer>{

}
