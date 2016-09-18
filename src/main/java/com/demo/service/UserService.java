package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface UserService {

	void saveUser(User user);
	 
    List<User> findAllUsers();
 
    void updateUser(User user);
    
	User findById(int id);

}
