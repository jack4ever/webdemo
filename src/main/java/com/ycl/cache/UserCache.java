package com.ycl.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.ycl.entity.User;

public class UserCache {

	private Map<String, User> userMap = new HashMap<String, User>();
	private static UserCache userCache = new UserCache();
	private UserCache(){
		init();
	}
	
	public static UserCache getInstance(){
		return userCache;
	}
	
	public List<User> getAll(){
		if(userMap!=null){
			List<User> result = new ArrayList<User>();
			result.addAll(userMap.values());
			return result;
		}
		return null;
	}
	
	public void add(User user){
		userMap.put(user.getId(), user);
	}
	
	public void delete(String userId){
		userMap.remove(userId);
	}
	
	public User findByUserId(String userId){
		return userMap.get(userId);
	}
	
	private void init(){
		for(int i=0;i<10;i++){
			User u = new User();
			u.setId(UUID.randomUUID().toString());
			u.setLoginname("user"+i);
			u.setPassword("8888");
			this.add(u);
		}
		//创建一个管理员用户
		User u = new User();
		u.setId(UUID.randomUUID().toString());
		u.setLoginname("admin");
		u.setPassword("admin");
		this.add(u);
	}
}
