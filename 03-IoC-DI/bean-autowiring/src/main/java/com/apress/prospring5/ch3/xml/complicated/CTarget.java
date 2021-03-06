package com.apress.prospring5.ch3.xml.complicated;

import com.apress.prospring5.ch3.xml.Bar;

import pei.java.spring.lab.utils.Utils;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CTarget {

    public static void main(String... args) {
        
        //using qualifier
//        GenericXmlApplicationContext ctx = Utils.getGenericXmlApplicationContext("classpath:spring/app-context-05.xml");
        //using primary
        GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-04.xml");

        System.out.println(((CTarget) ctx.getBean("targetByType")).toString());
        ctx.close();
    }

	private Foo fooOne;
	private Foo fooTwo;
	private Bar bar;

	public CTarget() {
	}

	public CTarget(Foo foo) {
		System.out.println("Target(Foo) called");
	}

	public CTarget(com.apress.prospring5.ch3.xml.Foo foo, Bar bar) {
		System.out.println("Target(Foo, Bar) called");
	}

	public void setFooOne(Foo fooOne) {
		this.fooOne = fooOne;
		System.out.println("Property fooOne set");
	}

	public void setFooTwo(Foo foo) {
		this.fooTwo = foo;
		System.out.println("Property fooTwo set");
	}

	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("Property bar set");
	}

}