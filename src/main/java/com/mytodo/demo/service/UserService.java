package com.mytodo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytodo.demo.entities.User;
import com.mytodo.demo.repository.UserRepo;

import javax.persistence.NonUniqueResultException;

@Service
public class UserService {

	@Autowired
	private UserRepo userrepo;

	public void saveUser(User user) {
		userrepo.save(user);
	}
	
	public User getUser(User user) {
		return userrepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
	
	public boolean getUserByUsername(String username,String password) {
		boolean user_exist,pwd_exist;
		try {
			user_exist=userrepo.findTopByUsername(username)!=null?true:false;
			pwd_exist=userrepo.findTopByUsername(password)!=null?true:false;
		}catch (NonUniqueResultException e) {
			return true;
		}
		return user_exist && pwd_exist;
	}
	
	public boolean findUserByUsername(String username) {
		boolean user_exist;
		try {
			user_exist=userrepo.findTopByUsername(username)!=null?true:false;			
		}catch (NonUniqueResultException e) {
			// TODO: handle exception
			return true;
		}
		return user_exist;
	}
}
