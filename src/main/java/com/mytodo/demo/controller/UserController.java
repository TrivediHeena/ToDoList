package com.mytodo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mytodo.demo.entities.User;
import com.mytodo.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public User getLogin(@RequestBody User user) {
		return userService.getUser(user);
	}
	
	@GetMapping("/login/{username}")
	public boolean findUser(@PathVariable String username,@RequestBody String password) {
		return userService.getUserByUsername(username, password);
	}
	
	@PostMapping("/createuser")
	public boolean addUser(@RequestBody User user) {
		boolean user_exist=userService.findUserByUsername(user.getUsername());
		if(user_exist) {
			return false;
		}
		userService.saveUser(user);
		return true;
	}
}
