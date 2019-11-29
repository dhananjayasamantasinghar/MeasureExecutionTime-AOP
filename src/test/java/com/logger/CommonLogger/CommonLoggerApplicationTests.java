package com.logger.CommonLogger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.logger.service.LoggerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonLoggerApplicationTests {

	@Autowired
	private LoggerService service;
	
	@Test
	public void runTests() {
		service.serve();
		service.serve1();
		service.serve2();
		
	}

}
