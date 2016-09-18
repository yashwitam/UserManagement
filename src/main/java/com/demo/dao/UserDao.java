package com.demo.dao;

import java.util.List;

import com.demo.model.User;

public interface UserDao {

	void saveUser(User user);

	List<User> findAllUsers();

	void updateUser(User user);
	
	User findById(int id);
}
