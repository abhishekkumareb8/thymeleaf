package com.ty.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.thymeleaf.dao.UserDao;
import com.ty.thymeleaf.dto.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public User saveUser(User user) {
		return dao.saveUser(user);
	}
	
	public List<User> getUser() {
		return dao.getUser();
	}

}
