package com.apress.prospring5.ch3.annotated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import lombok.ToString;
import pei.java.spring.lab.utils.Utils;

@ToString
@Service("injectSimple")
public class InjectSimple {

	@Value("John Mayer")
	private String name;

	@Value("40")
	private int age;
	
	@Value("1.92")
	private float height;
	
	@Value("false")
	private boolean programmer;
	
	@Value("1241401112")
	private Long ageInSeconds;

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-annotation.xml");
		System.out.println((InjectSimple) ctx.getBean("injectSimple"));
		ctx.close();
	}

}
