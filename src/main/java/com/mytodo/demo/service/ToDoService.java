package com.mytodo.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytodo.demo.entities.ToDoData;
import com.mytodo.demo.repository.ToDoRepo;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepo todorepo;
	
	public ToDoData saveToDo(ToDoData data) {
		Logger logger=LoggerFactory.getLogger(ToDoService.class);
		logger.debug("Saving ToDo");
		return todorepo.save(data);
	}
	
	public List<ToDoData> saveToDos(List<ToDoData> todos) {
        return todorepo.saveAll(todos);
    }
	
	public List<ToDoData> getTodos(){
		return todorepo.findAll();
	}
	
	public ToDoData getToDoById(int id) {
		return todorepo.findById(id).orElse(null);
	}
	
	public ToDoData getToDoByTitle(String title) {
		return todorepo.findByTitle(title);
	}
	
	public List<ToDoData> getToDoForUsername(String username){
		return todorepo.findAllByUsername(username);
	}
	
	public ToDoData updateTodo(ToDoData todos) {
		ToDoData todo=todorepo.findById(todos.getId()).orElse(null);
		todo.setTitle(todos.getTitle());
		todo.setDescription(todos.getDescription());
		todo.setStatus(todos.getStatus());
		todo.setUsername(todos.getUsername());
		return todorepo.save(todos);
	}
	
	public String deleteToDo(int id) {
		todorepo.deleteById(id);
		return id+" id is removed...";
	}
}
