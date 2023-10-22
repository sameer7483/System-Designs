package com.behavioral.chainOfResponsibilityPattern;

public class Logger {
	
	public static int DEBUG = 0;
	public static int INFO = 1;
	public static int ERROR = 2;
	
	Logger logger;
	
	public Logger(Logger logger) {
		this.logger = logger;
	}
	
	public void log(int level, String message) {
		
		if(logger != null) {
			logger.log(level, message);
		}
	}
	
}
