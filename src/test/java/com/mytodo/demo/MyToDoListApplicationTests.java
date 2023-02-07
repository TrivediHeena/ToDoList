package com.mytodo.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyToDoListApplicationTests {

	@Test
	void contextLoads() {
		Logger logger=LoggerFactory.getLogger(getClass());
		logger.debug("Test Completed...");
	}

	
}
