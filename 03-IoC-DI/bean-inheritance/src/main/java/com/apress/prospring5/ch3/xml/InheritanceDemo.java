package com.apress.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import pei.java.spring.lab.utils.Utils;

public class InheritanceDemo {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = Utils.getGenericXmlAppCtx("classpath:spring/app-context-xml.xml");

        System.out.println(((Singer) ctx.getBean("parent")).toString());
        System.out.println(((Singer) ctx.getBean("child")).toString());
    }
}
