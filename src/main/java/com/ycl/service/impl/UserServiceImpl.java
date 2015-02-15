package com.ycl.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycl.dao.UserDao;
import com.ycl.entity.User;
import com.ycl.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	
	public UserServiceImpl() {
		log.info("UserServiceImpl construct..");
	}

	@Autowired
	private UserDao userDao;
	
	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void delete(String userId) {
		userDao.delete(userId);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

	@Override
	public User findById(String userId) {
		return userDao.findById(userId);
	}

	

}
