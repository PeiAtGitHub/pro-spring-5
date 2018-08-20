package com.apress.prospring5.ch3.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;
import pei.java.spring.lab.utils.Utils;

public class AnnotatedDependsOnDemo {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = Utils.getGenericXmlApplicationContext("classpath:spring/app-context-02.xml");

		ctx.getBean("johnMayer", Singer.class).sing();

		ctx.close();
	}

}
