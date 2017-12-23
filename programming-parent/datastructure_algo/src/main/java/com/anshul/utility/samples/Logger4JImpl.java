package com.anshul.utility.samples;

import org.apache.log4j.Logger;

public class Logger4JImpl {
	private static final Logger logger = Logger.getLogger(Logger4JImpl.class);
	
	public static void main(String[] args) {

		Logger4JImpl obj = new Logger4JImpl();
		obj.runMe("mkyong");

	}

	private void runMe(String parameter){

		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}

		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}
}
