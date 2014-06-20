package com.wowinteractive.apps.medicalcenter.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wowinteractive.apps.medicalcenter.core.exceptions.UserNotFoundException;
import com.wowinteractive.apps.medicalcenter.core.model.AdminErrorMessage;
import com.wowinteractive.apps.medicalcenter.core.model.User;
import com.wowinteractive.apps.medicalcenter.core.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(method= RequestMethod.GET, value="/user/{userId}/isActive")
	@ResponseBody
	public Boolean isUserActive(@PathVariable final long username) throws UserNotFoundException{
		
		return new Boolean(false);
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/user/login")
	@ResponseBody
	public User loginUser(@PathVariable final String loginParametersBase64) throws UserNotFoundException{
		//TODO DEcode login parameters
		String username="";
		String password="";
		return userService.login(username, password);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/user/{userName}")
	@ResponseBody
	public User getUserInfo(@PathVariable final String userName) throws UserNotFoundException{
		return userService.getUserInfo(userName);
	}
	
	
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseBody
	public final AdminErrorMessage handleUserNotFoundException(final UserNotFoundException e,final HttpServletResponse response){
		
		response.setStatus(HttpStatus.FORBIDDEN.value());
		return new AdminErrorMessage("User not found,"+ "");
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/user")
	@ResponseBody
	public void createUser(){
		
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/user")
	@ResponseBody
	public void updateUser(){
		
	}

}
