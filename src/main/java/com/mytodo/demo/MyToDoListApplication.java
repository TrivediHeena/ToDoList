package com.mytodo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.mytodo.demo.service","com.mytodo.demo.controller"})
public class MyToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyToDoListApplication.class, args);
	}

}
