package com.logger.service;

import org.springframework.stereotype.Service;

import com.logger.MeasureTimeExecution;

@Service
public class LoggerService {

	@MeasureTimeExecution
	public String serve() {
		return "Hi DJ";
	}

	@MeasureTimeExecution
	public String serve1() {
		return "Hello";
	}

	@MeasureTimeExecution
	public String serve2() {
		return "Hi DJ";
	}

}
