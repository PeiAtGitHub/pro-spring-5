package com.apress.prospring5.ch3.annotated;

import pei.java.spring.lab.utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("constructorConfusion")
public class ConstructorConfusion {

	public static void main(String... args) {
	    GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-annotation.xml");
	    System.out.println((ConstructorConfusion) ctx.getBean("constructorConfusion"));
	    ctx.close();
	}
	
	private String someValue;
	
	public ConstructorConfusion(String someValue) {
		System.out.println("ConstructorConfusion(String) called");
		this.someValue = someValue;
	}

	@Autowired
	public ConstructorConfusion(@Value("90") int someValue) {
		System.out.println("ConstructorConfusion(int) called");
		this.someValue = "Number: " + Integer.toString(someValue);
	}

	public String toString() {
		return someValue;
	}

}
