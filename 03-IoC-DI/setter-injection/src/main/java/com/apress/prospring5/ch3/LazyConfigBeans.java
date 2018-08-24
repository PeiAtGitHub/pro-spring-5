package com.apress.prospring5.ch3;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;

import pei.java.spring.lab.utils.Utils;

import org.springframework.context.support.GenericXmlApplicationContext;

public class LazyConfigBeans {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-lazy-xml.xml");
		ctx.getBean("renderer", MessageRenderer.class).render();
		ctx.close();
	}

}
