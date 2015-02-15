package com.ycl.service;

import java.util.List;

import com.ycl.entity.User;

public interface UserService {

	public void add(User user);
	
	public void delete(String userId);
	
	public void update(User user);
	
	public List<User> list();
	
	public User findById(String userId);
}
