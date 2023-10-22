package com.behavioral.chainOfResponsibilityPattern;

public class InfoLogger extends Logger{
	
	public InfoLogger(Logger nextLogger) {
		super(nextLogger);
	}
	
	public void log(int level, String message) {
		if(level == Logger.INFO) {
			System.out.println(message);
		}
		else
			super.log(level, message);
	}
}
