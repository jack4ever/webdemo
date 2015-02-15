package com.ycl.dao.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ycl.cache.UserCache;
import com.ycl.dao.UserDao;
import com.ycl.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	private Logger log = LoggerFactory.getLogger(UserDaoImpl.class);
	
	
	public UserDaoImpl() {
		log.info("UserDaoImpl construct...");
	}

	@Override
	public void add(User user) {
		UserCache.getInstance().add(user);
	}

	@Override
	public void delete(String userId) {
		UserCache.getInstance().delete(userId);
	}

	@Override
	public List<User> list() {
		return UserCache.getInstance().getAll();
	}

	@Override
	public void update(User user) {
		UserCache.getInstance().add(user);
	}

	@Override
	public User findById(String userId) {
		return UserCache.getInstance().findByUserId(userId);
	}

	
}
