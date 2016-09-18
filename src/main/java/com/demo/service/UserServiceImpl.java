package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.UserDao;
import com.demo.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void saveUser(User user) {

		userDao.saveUser(user);
	}

	@Override
	public List<User> findAllUsers() {

		return userDao.findAllUsers();
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}

}
