package com.apress.prospring5.ch3.xml;

import com.apress.prospring5.ch3.annotated.Singer;

import pei.java.spring.lab.utils.Utils;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DependsOnDemo {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = Utils.getGenericXmlApplicationContext("classpath:spring/app-context-01.xml");

		ctx.getBean("johnMayer", Singer.class).sing();

		ctx.close();
	}

}
