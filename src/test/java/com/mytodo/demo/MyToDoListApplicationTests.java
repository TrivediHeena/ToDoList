package com.mytodo.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mytodo.demo.service.ToDoService;
import com.mytodo.demo.service.UserService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ImportResource({"classpath*:application-context.xml"})
class MyToDoListApplicationTests {

	//@Autowired
	//private UserService userService;
	@Autowired
	private ToDoService todoService;
	@Test
	void contextLoads() {
		Logger logger=LoggerFactory.getLogger(getClass());
		logger.debug("Test Completed...");
	}

	
}
