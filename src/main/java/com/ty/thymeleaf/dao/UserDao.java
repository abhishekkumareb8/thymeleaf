package com.ty.thymeleaf.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.thymeleaf.dto.User;
import com.ty.thymeleaf.repo.UserReposetory;

@Repository
public class UserDao {
	
	@Autowired
	private UserReposetory reposetory;
	
	public User saveUser(User user) {
		return reposetory.save(user);
	}
	
	public List<User> getUser() {
		return reposetory.findAll();
	}
	

}
