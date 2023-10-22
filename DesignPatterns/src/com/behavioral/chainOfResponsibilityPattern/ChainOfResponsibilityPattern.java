package com.behavioral.chainOfResponsibilityPattern;

public class ChainOfResponsibilityPattern {

	public static void main(String[] args) {
		// Intent: Decouple sender of a request to its receiver. 
		// Give chance to multiple objects to handle that request. 
		// Chain the receiving objects and pass the request along the
		// chain till it is handled.
		
		Logger logger = new Logger(new InfoLogger(new ErrorLogger(null)));
		logger.log(Logger.DEBUG, "This is Debug message from logger 1");
		logger.log(Logger.INFO, "This is info message from logger 1");
		logger.log(Logger.ERROR, "This is Error message from logger 1");
		
		//changing logger to debug level
		logger = new Logger(new DebugLogger(new InfoLogger(new ErrorLogger(null))));
		logger.log(Logger.DEBUG, "This is Debug message from logger 2");
		logger.log(Logger.INFO, "This is info message from logger 2");
		logger.log(Logger.ERROR, "This is Error message from logger 2");
		
	}
}
