package com.demo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.demo.model.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public void saveUser(User user) {
		persist(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {

		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	@Override
	public void updateUser(User user) {
        getSession().update(user);

	}

	@Override
	public User findById(int id) {
		return (User) getSession().get(User.class, new Integer(id));
	}

}
