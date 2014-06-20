package com.wowinteractive.apps.medicalcenter.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.wowinteractive.apps.medicalcenter.core.dao.UserDAO;
import com.wowinteractive.apps.medicalcenter.core.exceptions.UserNotFoundException;
import com.wowinteractive.apps.medicalcenter.core.model.User;
import com.wowinteractive.apps.medicalcenter.core.services.UserService;

public class UserServiceImplementation implements UserService{
	
	
	@Autowired
	UserDAO userDAO;

	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}

	public boolean changeUserPassword(String userName, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean changeUserImage(String userName, String imagenBase64) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isUserActive(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUserInfo(String username) throws UserNotFoundException{
		return userDAO.getUserByUsername(username);
	}

	

}
