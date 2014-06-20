package com.wowinteractive.apps.medicalcenter.core.dao;

import java.util.List;

import com.wowinteractive.apps.medicalcenter.core.model.User;

public interface UserDAO {
	
	public User getUserByUsername(final String username);
	
	public User getUserByUsernameAndPassword(final String username,final String password);
	
	public List<User> getAllUsers();
	
	public User saveUser(final User user);
	
	public void disableUser(final String username);
	
	public User updateUser(User anUser);

}
