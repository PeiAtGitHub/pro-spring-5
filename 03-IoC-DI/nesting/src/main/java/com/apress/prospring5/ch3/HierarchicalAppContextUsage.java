package com.apress.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

import pei.java.spring.lab.utils.Utils;

public class HierarchicalAppContextUsage {

	public static void main(String... args) {
		GenericXmlApplicationContext parentCtx = Utils.getGenericXmlAppCtx("classpath:spring/parent-context.xml");
		
		GenericXmlApplicationContext childCtx = new GenericXmlApplicationContext();
		childCtx.load("classpath:spring/child-context.xml");
		childCtx.setParent(parentCtx);
		childCtx.refresh();

		System.out.println(((Song) childCtx.getBean("song1")).getTitle());
		System.out.println(((Song) childCtx.getBean("song2")).getTitle());
		System.out.println(((Song) childCtx.getBean("song3")).getTitle());

		childCtx.close();
		parentCtx.close();
	}
}
