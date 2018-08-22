package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring5.ch2.decoupled.MessageProvider;

import pei.java.spring.lab.utils.Utils;

public class ConstructorConfusion {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-xml.xml");
        System.out.println((ConstructorConfusion) ctx.getBean("constructorConfusion"));
        System.out.println(((MessageProvider) ctx.getBean("provider")).getMessage());
        ctx.close();
    }

	private String someValue;

	public ConstructorConfusion(String someValue) {
		System.out.println("ConstructorConfusion(String) called");
		this.someValue = someValue;
	}

	public ConstructorConfusion(int someValue) {
		System.out.println("ConstructorConfusion(int) called");
		this.someValue = "Number: " + Integer.toString(someValue);
	}

	public String toString() {
		return someValue;
	}
}
