package com.mytodo.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mytodo.demo.entities.ToDoData;
import com.mytodo.demo.service.ToDoService;

@RestController
public class ToDoController {
	@Autowired
	private ToDoService todoservice;
	private Logger logger=LoggerFactory.getLogger(ToDoController.class);
	@PostMapping("/savetodo")
	public ToDoData addToDo(@RequestBody ToDoData data) {
		logger.info("Insert Data");
		return todoservice.saveToDo(data);
	}
	
	@PostMapping("/savetodos")
	public List<ToDoData> addToDos(@RequestBody List<ToDoData> data){
		logger.info("Saving Multi Data");
		return todoservice.saveToDos(data);
	}
	
	@GetMapping("/todos")
	public List<ToDoData> getAllToDo(){
		return todoservice.getTodos();
	}
	
	@GetMapping("/todo/{id}")
	public ToDoData findToDoById(@PathVariable int id) {
		return todoservice.getToDoById(id);
	}
	
	@GetMapping("/todo/{name}")
	public ToDoData findToDoByName(@PathVariable String title) {
		return todoservice.getToDoByTitle(title);
	}
	
	@GetMapping("/todouser/{username}")
	public List<ToDoData> findToDoForUsername(@PathVariable String username) {
		return todoservice.getToDoForUsername(username);
	}
	
	@PutMapping("/updatetodo")
	public ToDoData updateToDoData(@RequestBody ToDoData data) {
		return todoservice.updateTodo(data);
	}
	
	@DeleteMapping("/deletetodo/{id}")
	public String deleteToDoData(@PathVariable int id) {
		return todoservice.deleteToDo(id);
	}
}
