package com.apress.prospring5.ch3.sandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import pei.java.spring.lab.utils.Utils;

@Component("gigi")
@Lazy
public class TrickyTarget {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-05.xml");
        System.out.println(ctx.getBean(TrickyTarget.class).toString());
        ctx.close();
    }

    
	Foo fooOne;
	Foo fooTwo;
	Bar bar;

	public TrickyTarget() {
	}

	public TrickyTarget(Foo fooOne) {
		System.out.println("Target(Foo) called");
	}

	public TrickyTarget(Foo fooOne, Bar bar) {
		System.out.println("Target(Foo, Bar) called");
	}

	// comment @Qualifier annotation to cause NoUniqueBeanDefinitionException being thrown at runtime
	@Autowired
	@Qualifier("fooImplOne")
	public void setFooOne(Foo fooOne) {
		this.fooOne = fooOne;
		System.out.println("Property fooOne set");
	}

	// comment @Qualifier annotation to cause NoUniqueBeanDefinitionException being thrown at runtime
	// and make sure for @Primary in FooImpl to be commented as well
	@Autowired
	@Qualifier("fooImplTwo")
	public void setFooTwo(Foo foo) {
		this.fooTwo = foo;
		System.out.println("Property fooTwo set");
	}

	@Autowired
	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("Property bar set");
	}

}
