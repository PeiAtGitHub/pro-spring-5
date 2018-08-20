package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import pei.java.spring.lab.utils.Utils;

public class Target {
   
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = Utils.getGenericXmlApplicationContext("classpath:spring/app-context-03.xml");

        System.out.println(((Target) ctx.getBean("targetByName")).toString());
        System.out.println(((Target) ctx.getBean("targetByType")).toString());
        System.out.println(((Target) ctx.getBean("targetConstructor")).toString());

        ctx.close();
    }

    
    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;
    
    public Target() {
    }
    
    public Target(Foo foo) {
        System.out.println("Target(Foo) called");
    }
    
    public Target(Foo foo, Bar bar) {
        System.out.println("Target(Foo, Bar) called");
    }
    
    //
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
