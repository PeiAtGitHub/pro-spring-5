package com.apress.prospring5.ch3.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

import pei.java.spring.lab.utils.Utils;

public class FieldInjection {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context.xml");
		ctx.getBean(Singer.class).sing();
		ctx.close();
	}
}
