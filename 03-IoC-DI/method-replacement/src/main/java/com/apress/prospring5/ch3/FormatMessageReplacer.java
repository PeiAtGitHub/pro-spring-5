package com.apress.prospring5.ch3;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class FormatMessageReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object arg0, Method method, Object... args) throws Throwable {
		if (isFormatMessageMethod(method)) {
			return "<h2>" + (String) args[0] + "</h2>";
		} else {
			throw new IllegalArgumentException("Unable to reimplement method " + method.getName());
		}
	}

	private boolean isFormatMessageMethod(Method method) {
		if (method.getParameterTypes().length == 1 
		        && method.getParameterTypes()[0] == String.class
		        && "formatMessage".equals(method.getName())
		        && String.class == method.getReturnType()) {
			return true;
		}else {
		    return false;
		}
	}
	
}
