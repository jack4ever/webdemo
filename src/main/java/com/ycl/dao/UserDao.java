package com.ycl.dao;

import java.util.List;

import com.ycl.entity.User;

public interface UserDao {

	public void add(User User);
	
	public void delete(String userId);
	
	public List<User> list();
	
	public void update(User user);
	
	public User findById(String userId);
}
