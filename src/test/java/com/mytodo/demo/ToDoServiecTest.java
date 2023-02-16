package com.mytodo.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mytodo.demo.entities.ToDoData;
import com.mytodo.demo.service.ToDoService;
import com.mytodo.demo.service.UserService;

@SpringBootTest
//@WebMvcTest
@RunWith(SpringJUnit4ClassRunner.class)
@ImportResource({"classpath*:application-context.xml"})
public class ToDoServiecTest {

	//@Autowired
//	private MockMvc mockMvc;
	@Autowired
	//@MockBean
	private ToDoService todoService;
	//@Autowired
	//private UserService userService;
	private static ObjectMapper mapper=new ObjectMapper();
	
	@Test
	public void testGetToDo() throws Exception{		
		List<ToDoData> lst=new ArrayList<ToDoData>();
		ToDoData toDo=new ToDoData();
		toDo.setId(1);
		toDo.setTitle("Class");
		toDo.setDescription("Test Descr");
		toDo.setStatus("On Going");
		toDo.setUsername("abc");
		lst.add(toDo);
		assertThat(todoService).isNotNull();
	//	Mockito.when(todoService.getTodos()).thenReturn(lst);
		//mockMvc.perform(get("/todos")).andExpect(status().isOk()).andExpect(jsonPath("$", Matchers.hasSize(1)))
//		.andExpect(jsonPath("$[0].title", Matchers.equalTo("Class")));
	}

}
