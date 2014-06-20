package com.wowinteractive.apps.medicalcenter.core.services;

import com.wowinteractive.apps.medicalcenter.core.exceptions.UserNotFoundException;
import com.wowinteractive.apps.medicalcenter.core.model.User;

public interface UserService {

	public User login(final String username,final String password);
	
	public void logout();
	
	public boolean changeUserPassword(final String userName,final String newPassword);
	
	public boolean changeUserImage(final String userName,final String imagenBase64);
	
	public boolean isUserActive(final String username);
	
	public User getUserInfo(final String username) throws UserNotFoundException;
}
