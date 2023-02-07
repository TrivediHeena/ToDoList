package com.mytodo.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mytodo.demo.entities.ToDoData;

@Repository
public interface ToDoRepo extends JpaRepository<ToDoData, Integer>{
	ToDoData findByTitle(String title);
	List<ToDoData> findAllByUsername(String username);
}
