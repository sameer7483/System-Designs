package com.behavioral.chainOfResponsibilityPattern;

public class ErrorLogger extends Logger{

	public ErrorLogger(Logger nextLogger) {
		super(nextLogger);
	}
	
	public void log(int level, String message) {
		if(level == Logger.ERROR) {
			System.out.println(message);
		}
		else
			super.log(level, message);
	}
}
