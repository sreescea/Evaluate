package com.cloud9.security.service;

import java.util.List;

import com.cloud9.security.model.User;

/**
 * 
 * @author sra
 * interface for User serivice
 */

public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
	
}
