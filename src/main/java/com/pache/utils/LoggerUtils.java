package com.pache.utils;

import java.util.logging.Logger;

/**
 * @author lpache
 */
public class LoggerUtils {

	private LoggerUtils() {}
	
	public static <T> Logger getLogger(Class<T> clazz) {
		return Logger.getLogger(clazz.getName());
	}
}
