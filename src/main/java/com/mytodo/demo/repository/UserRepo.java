package com.mytodo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mytodo.demo.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	User findByUsernameAndPassword(String username,String password);
	
	User findTopByUsername(String username);
}
