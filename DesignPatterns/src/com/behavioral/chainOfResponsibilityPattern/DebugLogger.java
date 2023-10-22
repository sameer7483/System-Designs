package com.behavioral.chainOfResponsibilityPattern;

public class DebugLogger extends Logger{

	public DebugLogger(Logger nextLogger) {
		super(nextLogger);
	}
	
	public void log(int level, String message) {
		if(level == Logger.DEBUG) {
			System.out.println(message);
		}
		else
			super.log(level, message);
	}

}
