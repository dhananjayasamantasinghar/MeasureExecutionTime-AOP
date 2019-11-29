package com.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {

	private final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

	@Around("@annotation(com.logger.MeasureTimeExecution)")
	public void logBefore(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getSimpleName();
		long t0 = System.nanoTime();
		joinPoint.proceed();
		long t1 = System.nanoTime();

		logger.debug(className + " :: " + methodName +
				" >>>>>>>> Execution Time Taken " + (t1 - t0) + " nanos");
	}
}
